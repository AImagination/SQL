package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;

import static com.imagenation.sql.Condition.ComparisonOperators.*;

public class Less extends Expression {
    
    public <T extends Enum<T>, U extends Number> Less(Enum<T> field, U value) {
        super(field + " " + Less + " " + value);
    }
}
