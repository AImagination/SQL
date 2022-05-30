package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;
import com.imagenation.sql.Utils.Utils;

import static com.imagenation.sql.Condition.LogicOperators.*;


public class In extends Expression {
    
    public <T extends Enum<T>> In(Enum<T> field, String[] values) {
        super(field + " " + In + Utils.formatArguments(" (", ")", ", ", values, '\''));
    }

    public <T extends Enum<T>, U> In(Enum<T> field, U[] values) {
        super(field + " " + In + Utils.formatArguments(" (", ")", ", ", values));
    }
}
