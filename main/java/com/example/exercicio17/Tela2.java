package com.example.exercicio17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    Button btn;
    EditText user, pass;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
           btn = findViewById(R.id.btn);
            user = findViewById(R.id.user);
            pass = findViewById(R.id.pass);
            txt = findViewById(R.id.txt);
        }

        public void Login(View view)
        {

            String username=user.getText().toString();
            String password =pass.getText().toString();
            if ((password.equals("pass")) && ((username.equals("User")) || (username.equals("USER")) || (username.equals("user"))))
            {
                txt.setText("Login Válido");
                user.setText("");
                pass.setText("");
            } else {
                txt.setText("Login Inválido");
                user.setText("");
                pass.setText("");
            }
        }

    }
