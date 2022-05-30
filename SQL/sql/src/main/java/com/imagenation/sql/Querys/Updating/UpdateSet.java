package com.imagenation.sql.Querys.Updating;

import static com.imagenation.sql.KeyWord.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.imagenation.sql.Table;
import com.imagenation.sql.Condition.Expression;
import com.imagenation.sql.Querys.UpdatedQuery;
import com.imagenation.sql.Utils.Utils;

public class UpdateSet extends UpdatedQuery {
    
    public <T extends Enum<T>> UpdateSet(Table<T> table, Map<T, String> setDataByColumns) {
        Command = Update + " " + table.getName() + " " + Set;
        List<String> data = new ArrayList<String>();
        for (Enum<T> column : setDataByColumns.keySet()) {
            data.add(column.toString() + " = " + setDataByColumns.get(column));
        }

        Command += Utils.formatArguments(" ", "", ", ", data.toArray());
    }

    public <T extends Enum<T>> UpdateSet(Table<T> table, Map<T, String> setDataByColumns, Expression expression) {
        Command = Update + " " + table.getName() + " " + Set;
        List<String> data = new ArrayList<String>();
        for (Enum<T> column : setDataByColumns.keySet()) {
            data.add(column.toString() + " = " + setDataByColumns.get(column));
        }

        Command += Utils.formatArguments(" ", " ", ", ", data.toArray()) + Where + " " + expression;
    }


}
