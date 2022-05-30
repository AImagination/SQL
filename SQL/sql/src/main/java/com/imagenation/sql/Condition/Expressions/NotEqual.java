package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;
import static com.imagenation.sql.Condition.ComparisonOperators.*;

public class NotEqual extends Expression {
    
    public <T extends Enum<T>> NotEqual(Enum<T> field, String value) {
        super(field + " " + NotEqual + " '" + value + "'");
    }

    public <T extends Enum<T>, U> NotEqual(Enum<T> field, U value) {
        super(field + " " + NotEqual + " " + value);
    }
}
