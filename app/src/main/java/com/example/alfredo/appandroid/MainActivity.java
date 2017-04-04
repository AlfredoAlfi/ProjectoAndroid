package com.example.alfredo.appandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editTextNombreUsuario)
    EditText editText;

    @OnClick(R.id.button_listo)
    public void button_listo(){
        String nombre_usuario = String.valueOf(editText.getText());
        setContentView(R.layout.hola_usuario);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
