package com.imagenation.sql.Querys.Executed;

import static com.imagenation.sql.KeyWord.*;

import com.imagenation.sql.Table;
import com.imagenation.sql.Condition.Expression;
import com.imagenation.sql.Querys.ExecutedQuery;
import com.imagenation.sql.Utils.Utils;

public class SelectWhere extends ExecutedQuery {
    
    public <T extends Enum<T>> SelectWhere(Table<T> table, Enum<T>[] shown, Expression expression) {
        
        Command = Select + " ";
        Command += Utils.formatArguments("(", ") ", ", ", shown);
        Command += From + " " + table.getName() + " " + Where + " " + expression.toString();
    }

    public <T extends Enum<T>> SelectWhere(Table<T> table, Expression expression) {
        Command = Select + " * " + From + " " + table.getName() + " " + Where + " " + expression;
    }
}
