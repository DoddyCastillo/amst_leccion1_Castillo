package com.example.amst_l1_apellido_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SidwebActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidweb);
        textView=(TextView) findViewById(R.id.txt_sidweb);
        textView.setText("Este es una plataforma que le va permitir \n al estudiante llevar el control de sus tareas");
    }
}
