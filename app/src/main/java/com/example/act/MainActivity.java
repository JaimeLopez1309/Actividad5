package com.example.act;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageButton BtnHome ;
    private ImageButton BtnLogin;
    private ImageButton BtnSearch;
    private EditText ETSearch;
    private ListView LiEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitObj();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        BtnHome.setOnClickListener(this::HomeB);
        BtnLogin.setOnClickListener(this::Logon);
    }
    private void Logon (View view){
        /*Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);*/
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_VIEW);
        String uri = "whatsapp://send?phome=573005430116"+ "?text=Hola";
        sendIntent.setData(Uri.parse(uri));
        startActivity(sendIntent);
    }


    private void HomeB(View view){
        super.onRestart();
    }
    private void  InitObj(){
        BtnHome = findViewById(R.id.BtnHome);
        BtnLogin = findViewById(R.id.BtnLogon);
        BtnSearch = findViewById(R.id.BtnSearch);
        ETSearch = findViewById(R.id.EtSearch);
        LiEmpresa = findViewById(R.id.LiEmpresa);


    }
}