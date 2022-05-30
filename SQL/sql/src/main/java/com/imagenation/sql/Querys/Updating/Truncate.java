package com.imagenation.sql.Querys.Updating;

import com.imagenation.sql.Querys.UpdatedQuery;
import com.imagenation.sql.Table;

import static com.imagenation.sql.KeyWord.*;

public class Truncate extends UpdatedQuery {
    
    public <T extends Enum<T>> Truncate(Table<T> table) {
        Command = Delete + " " + Table + " " + table.getName();
    }
}
