package com.imagenation.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.imagenation.sql.Querys.ExecutedQuery;
import com.imagenation.sql.Querys.UpdatedQuery;

public class DataBase {

    private Connection _connection;
    private Statement _statement;
    
    private final String _jdbcConnectionString;
    private final String _user;
    private final String _password;

    public DataBase(String url, String port, String databaseName, String user, String password) {
        _jdbcConnectionString = "jdbc:mysql://" + url + ":" + port + "/" + databaseName;
        _user = user;
        _password = password;
    }

    public void connect() throws SQLException, ClassNotFoundException {
        _connection = DriverManager.getConnection(_jdbcConnectionString, _user, _password);
    }
    
    public void disconnect() throws SQLException {

        if(_connection != null) {
            _connection.close();
        }
    }

    public ResultSet execute(ExecutedQuery query) throws Exception {

        reconnectIfConnectInvalid();
        _statement = _connection.createStatement();
        return _statement.executeQuery(query.toString());
    }

    public void update(UpdatedQuery query) throws Exception {

        reconnectIfConnectInvalid();
        _statement = _connection.createStatement();
        _statement.executeUpdate(query.toString());
    }

    public <T extends Enum<T>> boolean isTableExisted(Table<T> tableFrame) throws SQLException {
        DatabaseMetaData meta = _connection.getMetaData();
        ResultSet resultSet = meta.getTables(null, null, tableFrame.getName(), new String[] {"TABLE"});
        return resultSet.next();
    }

    private void reconnectIfConnectInvalid() throws Exception {
        if(_connection.isValid(0) == false) {
            connect();
        }
    }
}
