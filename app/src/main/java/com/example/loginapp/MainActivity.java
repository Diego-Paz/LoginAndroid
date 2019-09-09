package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button BtnIn , BtnUp;
    private EditText txtName , txtPass;
    private String user = "Taka", pass="1122";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnIn = findViewById(R.id.IdBtnSingIn);
        BtnUp = findViewById(R.id.IdBtnSingUp);

        BtnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowSingIn();
            }
        });
        BtnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowSingUp();
            }
        });
    }
    public void ShowSingIn(){
        txtName = findViewById(R.id.IdTxtUser);
        txtPass = findViewById(R.id.IdTxtPass);
        String UserTxt = txtName.getText().toString(), PassTxt = txtPass.getText().toString();
        if(UserTxt.equals(user) && PassTxt.equals(pass)){
            Intent intent = new Intent(this, SingIn.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "UserName or Password Wrong", Toast.LENGTH_SHORT).show();
        }
    }
    public void ShowSingUp(){
        Intent intent = new Intent(this, SingUp.class);
        startActivity(intent);
    }
}
