package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextAngka1;
    EditText editTextAngka2;
    TextView textViewHasil;
    Button btnTambah;
    Button btnKurang;
    Button btnBagi;
    Button btnKali;
    Button btnBersih;

    float angka1;
    float angka2;
    float hasil;
    String result1;
    String result2;
    String result3;
    String result4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextAngka1 = findViewById(R.id.editTextAngka1);
        editTextAngka2 = findViewById(R.id.editTextAngka2);
        textViewHasil = findViewById(R.id.labelHasil);
        btnTambah = findViewById(R.id.btnTambah);
        btnBagi = findViewById(R.id.btnBagi);
        btnKali = findViewById(R.id.btnKali);
        btnKurang = findViewById(R.id.btnKurang);
        btnBersih=findViewById(R.id.btnBersih);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cekAngka()){
                    hasil=angka1+angka2;
                    result1 = "Hasil Penjumlahan = "+ hasil;
                    textViewHasil.setText(String.valueOf(result1));
                }
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cekAngka()){
                    hasil=angka1-angka2;
                    result2 = "Hasil Pengurangan = "+hasil;
                    textViewHasil.setText(String.valueOf(result2));
                }
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cekAngka()){
                    hasil=angka1*angka2;
                    result3 = "Hasil Perkalian = "+hasil;
                    textViewHasil.setText(String.valueOf(result3));
                }
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cekAngka()){
                    hasil=angka1/angka2;
                    result4 = "Hasil Pembagian = "+hasil;
                    textViewHasil.setText(String.valueOf(result4));
                }
            }
        });
        btnBersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAngka1.setText(null);
                editTextAngka2.setText(null);
                hasil=0f;
                textViewHasil.setText(String.valueOf(hasil));
            }
        });

    }
    public boolean cekAngka(){
        editTextAngka1=findViewById(R.id.editTextAngka1);
        editTextAngka2=findViewById(R.id.editTextAngka2);
        textViewHasil=findViewById(R.id.labelHasil);

        String cekData=editTextAngka1.getText().toString();
        String cekData2=editTextAngka2.getText().toString();

        if(cekData.equals("")||cekData2.equals("")){
            String error = "Masukkan Kedua Angka!!";
            textViewHasil.setText(error);
            return false;
        } else {
            angka1=Float.parseFloat(cekData);
            angka2=Float.parseFloat(cekData2);
        }
        return true;
    }

}