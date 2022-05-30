package com.imagenation.sql.DataTypes;

public class VarChar extends DataType {
    
    private final Integer _length;

    public VarChar(int lenght) {
        _length = lenght;
    }

    @Override
    public String toString() {
        return "VARCHAR(" + _length + ")";
    }
}
