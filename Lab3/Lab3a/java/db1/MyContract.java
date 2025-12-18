package hua.dit.mobdev.ec.lab3a.db1;

import android.provider.BaseColumns;

public final class MyContract {

    private MyContract() { }

    /* Inner class that defines the table contents */
    public static class MyTableEntry implements BaseColumns {
        public static final String MY_TABLE = "my_table";
        public static final String STRING_VALUE = "string_value";
        public static final String INTEGER_VALUE = "integer_value";
    }

}
