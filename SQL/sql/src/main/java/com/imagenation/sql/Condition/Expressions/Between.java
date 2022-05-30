package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;

import static com.imagenation.sql.Condition.ComparisonOperators.*;
import static com.imagenation.sql.Condition.LogicOperators.*;

public class Between extends Expression {
    
    public <T extends Enum<T>, U> Between(Enum<T> field, U minFrame, U maxFrame) {
        super(field + " " + Between + " " + minFrame + " " + And + " " + maxFrame);
    }
}
