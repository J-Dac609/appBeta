package com.kevin.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.kevin.gym.data.AdminSQLiteOpenHelper;

public class MainActivity5 extends AppCompatActivity {

    private EditText txtNombre1,txtEdad1,txtEstatura1,txtPeso1,txtGenero1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        txtNombre1 =(EditText)findViewById(R.id.txtNombre);
        txtEdad1 =(EditText)findViewById(R.id.txtEdad);
        txtEstatura1=(EditText)findViewById(R.id.txtEstatura);
        txtPeso1 =(EditText)findViewById(R.id.txtPeso);
        txtGenero1 =(EditText)findViewById(R.id.txtGenero);

    }
    public void savedate (View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"usuarios",null,1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String Nombre = txtNombre1.getText().toString();
        String Edad = txtEdad1.getText().toString();
        String Estatura = txtEstatura1.getText().toString();
        String Peso = txtPeso1.getText().toString();
        String Genero = txtGenero1.getText().toString();

        if(!Nombre.isEmpty() && !Edad.isEmpty() && !Estatura.isEmpty() && !Peso.isEmpty() && !Genero.isEmpty()){

            ContentValues registro = new ContentValues();
            registro.put("Nombre",Nombre);
            registro.put("edad",Edad);
            registro.put("peso",Peso);
            registro.put("estatura",Estatura);
            registro.put("genero",Genero);

            db.insert("usuarios",null,registro);
            db.close();

            txtNombre1.setText("");
            txtEdad1.setText("");
            txtEstatura1.setText("");
            txtPeso1.setText("");
            txtGenero1.setText("");

        }else{
            Toast.makeText(this,"DEBES LLENAR TODOS LOS CAMPOS",Toast.LENGTH_SHORT).show();
        }

    }

}