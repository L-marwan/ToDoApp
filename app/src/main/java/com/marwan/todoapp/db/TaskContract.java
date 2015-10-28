package com.marwan.todoapp.db;

import android.provider.BaseColumns;

/**
 * Created by marwan on 10/28/2015.
 */
public class TaskContract {
    public  static final String DB_NAME ="com.marwan.todoapp.db.tasks";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "tasks";

    public class Columns {
        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;
    }
}

