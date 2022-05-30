package com.imagenation.sql.Querys.Updating;

import com.imagenation.sql.Table;
import com.imagenation.sql.DataTypes.DataType;
import com.imagenation.sql.Querys.UpdatedQuery;
import com.imagenation.sql.Utils.Utils;

import static com.imagenation.sql.KeyWord.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddColumn extends UpdatedQuery {
    
    public <T extends Enum<T>> AddColumn(Table<T> table, Enum<T> column, DataType dataType) {
        Command = Alter + " " + Table + " " + table.getName() + " " + Add + " " + Column + " " + column.toString() + " " + dataType;
    }

    public <T extends Enum<T>> AddColumn(Table<T> table, Map<T, DataType> columnsByDatatype) {
        Command = Alter + " " + Table + " " + table.getName();
        List<String> columnNames = new ArrayList<String>();
        for (T column : columnsByDatatype.keySet()) {
            columnNames.add(Add + " " + Column + " " + column.toString() + " " + columnsByDatatype.get(column));
        }

        Command += Utils.formatArguments(" ", "", ", ", columnNames.toArray());
    }
}
