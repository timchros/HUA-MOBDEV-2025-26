package hua.dit.mobdev.ec.lab3a.db2;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {MyTable.class}, version = 2, exportSchema = false)
@TypeConverters({MyConverters.class})
public abstract class MyDatabase extends RoomDatabase {

    public abstract MyDao myDao();

}
