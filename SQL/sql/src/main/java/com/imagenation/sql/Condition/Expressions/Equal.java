package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;

import static com.imagenation.sql.Condition.ComparisonOperators.*;

public class Equal extends Expression {

    public <T extends Enum<T>> Equal(T field, String value) {
        super(field + " " + Equal + " '" + value + "'");
    }

    public <T extends Enum<T>, U> Equal(T field, U value) {
        super(field + " " + Equal + " " + value);
    }

}
