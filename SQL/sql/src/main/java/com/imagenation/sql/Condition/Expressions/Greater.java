package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;

import static com.imagenation.sql.Condition.ComparisonOperators.*;

public class Greater extends Expression {

    public <T extends Enum<T>, U extends Number> Greater(Enum<T> field, U value) {
        super(field + " " + Greater + " " + value);
    }

}
