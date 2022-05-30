package com.imagenation.sql.Querys.Updating;

import static com.imagenation.sql.KeyWord.*;

import java.util.Map;

import com.imagenation.sql.Table;
import com.imagenation.sql.Querys.UpdatedQuery;
import com.imagenation.sql.Utils.Utils;

public class Insert extends UpdatedQuery {
    
    public <T extends Enum<T>> Insert(Table<T> table, Class<T> columnNames, Map<T, String> values) {
        Command = Insert + " " + Into + " " + table.getName();
        Command += Utils.formatArguments(" (", ") ", ", ", values.keySet().toArray());
        Command += Values;
        Command += Utils.formatArguments(" (", ")", ", ", values.values().toArray());
    }
}
