package hua.dit.mobdev.ec.lab3b.db;

public class UserWithSex {

    public String name;
    public Integer age;
    public String sex;

    @Override
    public String toString() {
        return "UserWithSex{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
