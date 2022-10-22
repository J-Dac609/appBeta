package com.kevin.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, MainActivity2.class);
        startActivity(siguiente);

    }
    public void Siguiente2 (View view) {
        Intent siguiente2 = new Intent(this, MainActivity3.class);
        startActivity(siguiente2);

    }
    public void Siguiente3 (View view) {
        Intent siguiente3 = new Intent(this, MainActivity4.class);
        startActivity(siguiente3);
    }
}