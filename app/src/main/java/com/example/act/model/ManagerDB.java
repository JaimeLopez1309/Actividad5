package com.example.act.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ManagerDB extends SQLiteOpenHelper {
    private static final String DataBase = "DbUsers";
    private static  final   int VERSION =1;
    private static final String Table_User="user";
    private static final String Table_Inmueble ="inmueble";
    public static final String Create_TableU= "CREATE TABLE " + Table_User + "(use_document " + "INTERGER PRIMARY KEY NOT NULL, use_user varchar(50) NOT NULL, use_names varchar(150) " +
            "NOT NULL, use_lastnames varchar(150) NOT NULL, use_password varchar(25) NOT NULL, " +
            "use_status varchar(1) NOT NULL);";
    public static final String Create_TableI= "CREATE TABLE " + Table_Inmueble + "(use_ID " + "INTERGER PRIMARY KEY NOT NULL " +
            ", use_direccion varchar(50) NOT NULL, use_vendedor varchar(150) " +
            "NOT NULL, use_descripcion varchar(200) NOT NULL," +
            " use_valor INTERGER NOT NULL, " +
            "use_tipo varchar(1) NOT NULL, " +
            "use_celular varchar(50) NOT NULL, " +
            "use_image image );";
    private static final String DELETE_TABLE = "DROP TABLE IF EXISTS "+ Table_User;
    public ManagerDB(@Nullable Context context) {
        super(context, DataBase, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create_TableU);
        db.execSQL(Create_TableI);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DELETE_TABLE);
        onCreate(db);

    }


}
