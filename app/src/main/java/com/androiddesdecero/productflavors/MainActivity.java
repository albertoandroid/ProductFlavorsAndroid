package com.androiddesdecero.productflavors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDepartamento;
    private TextView tvURLDepartamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDepartamento = findViewById(R.id.mainActivityTvDepartamento);
        tvDepartamento.setText(Departamento.getDepartamento());

        tvURLDepartamento = findViewById(R.id.mainActivityTvURLDepartamento);
        tvURLDepartamento.setText(BuildConfig.BASE_URL);
    }
}
