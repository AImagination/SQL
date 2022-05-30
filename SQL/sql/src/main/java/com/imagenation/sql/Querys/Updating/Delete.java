package com.imagenation.sql.Querys.Updating;

import com.imagenation.sql.Table;
import com.imagenation.sql.Condition.Expression;
import com.imagenation.sql.Querys.UpdatedQuery;

import static com.imagenation.sql.KeyWord.*;

public class Delete extends UpdatedQuery {
    
    public <T extends Enum<T>> Delete(Table<T> table) {
        Command = Delete + " " + From + " " + table.getName();
    }
    
    public <T extends Enum<T>> Delete(Table<T> table, Expression expression) {
        Command = Delete + " " + From + " " + table.getName() + " " + Where + " " + expression;
    }
}
