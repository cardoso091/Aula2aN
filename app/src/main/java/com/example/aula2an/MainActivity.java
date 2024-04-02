package com.example.aula2an;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//import javax.swing.text.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirGorjeta(View view) {

        Intent intent = new Intent(this, GorjetaActivity.class);
        startActivity(intent);

    }
}