package hua.dit.mobdev.ec.lab3b.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sex")
public class Sex {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo
    public String name;

    public Sex(@NonNull String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
