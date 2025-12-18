package hua.dit.mobdev.ec.lab3b.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "user", foreignKeys = {
        @ForeignKey(
                entity = Sex.class,
                parentColumns = { "id" },
                childColumns = {"sex_id"}
        )}, indices = { @Index("sex_id") } )
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo
    public String name;

    @ColumnInfo
    public Integer age;

    @ColumnInfo
    public Long sex_id;

    public User(String name, Integer age, Long sex_id) {
        this.name = name;
        this.age = age;
        this.sex_id = sex_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex_id=" + sex_id +
                '}';
    }

}
