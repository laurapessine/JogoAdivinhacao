package com.example.jogoadivinhacao;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

private TextView tvPensei;
private TextView tvResultado;
private Button btn1;
private Button btn2;
private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPensei = findViewById(R.id.tvPensei);
        tvResultado = findViewById(R.id.tvResultado);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(view -> {
            int resultado = new Random().nextInt(3) + 1;
            tvPensei.setText("Pensei em: " + resultado);
            if (resultado == 1) {
                tvResultado.setText("VOCÊ GANHOU.");
                tvResultado.setTextColor(Color.GREEN);
                Toast toast = Toast.makeText(getApplicationContext(), "Parabéns!!!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            } else {
                tvResultado.setText("VOCÊ PERDEU.");
                tvResultado.setTextColor(Color.RED);
                Toast toast = Toast.makeText(getApplicationContext(), "Fracassado!!!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });
        btn2.setOnClickListener(view -> {
            int resultado = new Random().nextInt(3) + 1;
            tvPensei.setText("Pensei em: " + resultado);
            if (resultado == 2) {
                tvResultado.setText("VOCÊ GANHOU.");
                tvResultado.setTextColor(Color.GREEN);
                Toast toast = Toast.makeText(getApplicationContext(), "Parabéns!!!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            } else {
                tvResultado.setText("VOCÊ PERDEU.");
                tvResultado.setTextColor(Color.RED);
                Toast toast = Toast.makeText(getApplicationContext(), "Fracassado!!!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });
        btn3.setOnClickListener(view -> {
            int resultado = new Random().nextInt(3) + 1;
            tvPensei.setText("Pensei em: " + resultado);
            if (resultado == 3) {
                tvResultado.setText("VOCÊ GANHOU.");
                tvResultado.setTextColor(Color.GREEN);
                Toast toast = Toast.makeText(getApplicationContext(), "Parabéns!!!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            } else {
                tvResultado.setText("VOCÊ PERDEU.");
                tvResultado.setTextColor(Color.RED);
                Toast toast = Toast.makeText(getApplicationContext(), "Fracassado!!!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });
    }
}