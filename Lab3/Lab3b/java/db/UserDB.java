package hua.dit.mobdev.ec.lab3b.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Sex.class, User.class}, version = 1, exportSchema = false)
public abstract class UserDB extends RoomDatabase {

    public abstract SexDao sexDao();

    public abstract UserDao userDao();

}
