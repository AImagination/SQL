package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;

import static com.imagenation.sql.Condition.ComparisonOperators.*;


public class LessEqual extends Expression {

    public <T extends Enum<T>, U extends Number> LessEqual(Enum<T> field, U value) {
        super(field + " " + LessEqual + " " + value);
    }
}
