package com.example.craitson.autenticacao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class MainActivity extends Activity {

    private TextView nomeTextView;
    private TextView senhaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nomeTextView = (TextView) findViewById(R.id.textViewUsuario);
        this.senhaTextView = (TextView) findViewById(R.id.textViewSenha);
    }

    public void entrar(View v){

        if(nomeTextView.equals("admin") && senhaTextView.equals("admin")){
            Intent myIntent = new Intent(v.getContext(), ActivityDasboard.class);
            startActivity(myIntent);
        }else{
            String mensagemErro = getString (R.string.erro_autenticao);
            Toast toast = Toast.makeText ( this,mensagemErro , Toast.LENGTH_SHORT );
            toast . show ();
        }

    }

}
