package com.example.act.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;

import com.example.act.entity.Inmueble;
import com.example.act.entity.User;
import com.google.android.material.snackbar.Snackbar;

public class UserDAO {
    private ManagerDB managerDataBase;
    Context context;
    View view;
    private User user;
    private Inmueble inmueble;

    public UserDAO(Context context, View view) {
        this.context = context;
        this.view = view;
        managerDataBase =new ManagerDB(this.context);
    }
    public void InsertUser(User user){
        try{
            SQLiteDatabase db = managerDataBase.getWritableDatabase();
            if(db!=null){
                ContentValues values = new ContentValues();
                values.put("use_document", user.getDocument());
                values.put("use_user", user.getUser());
                values.put("use_names", user.getNames());
                values.put("use_lastnames", user.getLastNames());
                values.put("use_password", user.getPassword());
                values.put("use_status", 1);
                Long cod = db.insert("users", null, values);
                Snackbar.make(this.view, "Se ha registrado el Usuario: "+ cod, Snackbar.LENGTH_LONG).show();
            }else{

                Snackbar.make(this.view, "NO se ha registrado el Usuario", Snackbar.LENGTH_LONG).show();
            }
        }catch (SQLException e){
            Log.i("BD",""+e);

        }

    }
    public void InsertInmueble(Inmueble inmueble){
        try{
            SQLiteDatabase db = managerDataBase.getWritableDatabase();
            if(db!=null){
                ContentValues values = new ContentValues();
                values.put("use_ID", inmueble.getID());
                values.put("use_direccion", inmueble.getDireccion());
                values.put("use_vendedor", inmueble.getVendedor());
                values.put("use_descripcion", inmueble.getDescripcion());
                values.put("use_valor", inmueble.getValor());
                values.put("use_tipo", 1);
                values.put("use_celular", inmueble.getCelular());
                //values.put("use_image", inmueble.getImagen());

                Long cod = db.insert("users", null, values);
                Snackbar.make(this.view, "Se ha registrado el Inmueble: "+ cod, Snackbar.LENGTH_LONG).show();
            }else{

                Snackbar.make(this.view, "NO se ha registrado el Inmueble", Snackbar.LENGTH_LONG).show();
            }
        }catch (SQLException e){
            Log.i("BD",""+e);

        }

    }
}
