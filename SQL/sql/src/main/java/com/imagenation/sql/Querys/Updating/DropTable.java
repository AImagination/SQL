package com.imagenation.sql.Querys.Updating;

import static com.imagenation.sql.KeyWord.*;

import com.imagenation.sql.Table;
import com.imagenation.sql.Querys.UpdatedQuery;

public class DropTable extends UpdatedQuery {

    public <T extends Enum<T>> DropTable(Table<T> table) {
        Command = Drop + " " + Table + " " + table.getName(); 
    }
}
