package com.imagenation.sql.Querys.Updating;

import java.util.List;
import java.util.Map;

import com.imagenation.sql.Table;
import com.imagenation.sql.DataTypes.DataType;
import com.imagenation.sql.Querys.UpdatedQuery;
import com.imagenation.sql.Utils.Utils;

import static com.imagenation.sql.KeyWord.*;

public class CreateTable extends UpdatedQuery {
    
    public <T extends Enum<T>> CreateTable(Table<T> frame) {
        
        Command = Create + " " + Table + " " + frame.getName();

        Map<String, DataType> columnsByDataType = frame.getColumnsByDataType();
        List<String> columnNames = frame.getColumnNames();
        System.out.println(columnNames.get(0) + " " + columnNames.get(1));

        for (int i = 0; i < columnNames.size(); i++) {
            String columnName = columnNames.get(i);
            String nameByDataType = columnName + " " + columnsByDataType.get(columnName);
            columnNames.set(i, nameByDataType);
        }

        Command += Utils.formatArguments(" (", ")", ", ", columnNames.toArray());
    } 

}
