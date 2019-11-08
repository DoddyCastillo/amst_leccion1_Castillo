package com.example.amst_l1_apellido_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_sidweb;
    Button btn_academico;
    Button btn_vinculo;
    Button btn_bienestar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sidweb=(Button) findViewById(R.id.btn_sidweb);
        btn_academico=(Button) findViewById(R.id.btn_academico);
        btn_vinculo=(Button) findViewById(R.id.btn_vinculo);
        btn_bienestar=(Button) findViewById(R.id.btn_bienestar);
    }


   public void irSidweb(View view){
       Intent intent=new Intent(this,SidwebActivity.class);
       startActivity(intent);
   }
   public void irVinculo(View view){
        Intent intent=new Intent(this,VinculosActivity.class);
        startActivity(intent);
   }
    public void irBienestar(View view){
        Intent intent=new Intent(this,BienestarActivity.class);
        startActivity(intent);
    }
    public void irAcademico(View view){
        Intent intent=new Intent(this, AcademicoActivity.class);
        startActivity(intent);
    }
}
