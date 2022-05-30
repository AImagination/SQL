package com.imagenation.sql.Querys.Updating;

import static com.imagenation.sql.KeyWord.*;

import com.imagenation.sql.Table;
import com.imagenation.sql.Querys.UpdatedQuery;
import com.imagenation.sql.Utils.Utils;

public class DropColumn extends UpdatedQuery {
    
    public <T extends Enum<T>> DropColumn(Table<T> table, Enum<T> column) {
        Command = Alter + " " + Table + " " + table.getName() + " " + Drop + " " + Column + " " + column;
    }

    public <T extends Enum<T>> DropColumn(Table<T> table, T[] columns) {
        Command = Alter + " " + Table + " " + table.getName() + " " + Drop + " " + Column + " ";
        Command += Utils.formatArguments("", "",  ", " + Drop + " " + Column + " ", columns);
    }
}
