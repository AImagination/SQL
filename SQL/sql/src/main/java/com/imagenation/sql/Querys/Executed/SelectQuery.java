package com.imagenation.sql.Querys.Executed;

import static com.imagenation.sql.KeyWord.*;

import com.imagenation.sql.Table;
import com.imagenation.sql.Querys.ExecutedQuery;
import com.imagenation.sql.Utils.Utils;

public class SelectQuery extends ExecutedQuery {
    
    public <T extends Enum<T>> SelectQuery(Table<T> table, Enum<T>[] fields) {
        Command = Select.toString();
        Command += Utils.formatArguments(" ", " ", ", ", fields);
        Command += From + " " + table.getName();
    }

    public <T extends Enum<T>> SelectQuery(Table<T> table) {
        Command = Select + " * " + From + " " + table.getName();
    }
}
