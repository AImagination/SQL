package com.imagenation.sql;

public enum KeyWord {

    Select("SELECT"), Create("CREATE"), From("FROM"), Table("TABLE"), Drop("DROP"), Insert("INSERT"), Into("INTO"),
    Values("VALUES"), Where("WHERE"), Update("UPDATE"), Set("SET"), Alter("ALTER"), Add("ADD"), Column("COLUMN"),
    Delete("DELETE"), Truncate("TRUNCATE");

    private final String _name;

    KeyWord(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return _name;
    }
}
