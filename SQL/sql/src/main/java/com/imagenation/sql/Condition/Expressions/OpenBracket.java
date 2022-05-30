package com.imagenation.sql.Condition.Expressions;

import com.imagenation.sql.Condition.Expression;
import static com.imagenation.sql.Condition.ComparisonOperators.*;

public class OpenBracket extends Expression {
    
    public OpenBracket(Expression connected) {
        super(OpBracket.toString() + connected.toString());
    }

}
