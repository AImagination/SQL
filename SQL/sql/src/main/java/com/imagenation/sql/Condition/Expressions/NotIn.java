package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;
import com.imagenation.sql.Utils.Utils;

import static com.imagenation.sql.Condition.LogicOperators.*;

public class NotIn extends Expression {

    public <T extends Enum<T>> NotIn(Enum<T> field, String[] values) {
        super(field + " " + NotIn + Utils.formatArguments(" (", ")", ", ", values, '\''));
    }

    public <T extends Enum<T>, U> NotIn(Enum<T> field, U[] values) {
        super(field + " " + NotIn + Utils.formatArguments(" (", ")", ", ", values));
    }
}
