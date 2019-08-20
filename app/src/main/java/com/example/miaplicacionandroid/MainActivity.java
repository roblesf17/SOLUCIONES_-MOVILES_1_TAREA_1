package com.example.miaplicacionandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private int contador = 0 ;
    private TextView textoContador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textoContador = (TextView)findViewById(R.id.txt_marcador);



        //esto se agregara aqui--------------------------
        if (savedInstanceState != null)
        {
            contador = savedInstanceState.getInt("count");
            textoContador.setText(String.valueOf(contador));
        }
        //-----------------------------------------------
    }



    public void showToast (View view) {
        Toast.makeText(  this
        ,  getString(R.string.mensaje) +" " +  textoContador.getText().toString()
    ,Toast.LENGTH_SHORT).show();

    }

    public void countUp (View view)
    {
        ++contador ;
        textoContador.setText(Integer.toString(contador));

    }




    // agregar 1ro //
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("count" , contador);
    }
    //https://www.youtube.com/watch?v=TcTgbVudLyQ
    //------------------------------------------------------------

}
