package com.example.amst_l1_apellido_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AcademicoActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academico);
        textView=(TextView) findViewById(R.id.txt_academico);
        textView.setText("Este es una plataforma que le va permitir \n al estudiante ver las calificacionesa durante \n todo el año lectivo");
    }
}
