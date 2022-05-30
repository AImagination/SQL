package com.imagenation.sql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imagenation.sql.DataTypes.DataType;

public abstract class Table<ColumnName extends Enum<ColumnName>> {

    private final String _name;
    public String getName() {
        return _name;
    }
    private final Map<ColumnName, DataType> _columnsByDataType;
    public Map<String, DataType> getColumnsByDataType() {
        
        Map<String, DataType> columnsByDataType = new HashMap<String, DataType>();
        for (ColumnName columnName : _columnsByDataType.keySet()) {
            columnsByDataType.put(columnName.toString(), _columnsByDataType.get(columnName));
        }
        return columnsByDataType;
    }
    
    public Table(String name, Map<ColumnName, DataType> columnsByDataType) {
        _name = name;
        _columnsByDataType = columnsByDataType;
    }

    public List<String> getColumnNames() {
        
        List<String> columnNames = new ArrayList<String>();
        _columnsByDataType.keySet().forEach(name -> columnNames.add(name.toString()));
        return columnNames;
    }

}
