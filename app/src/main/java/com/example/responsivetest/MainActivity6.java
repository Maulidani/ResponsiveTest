package com.example.responsivetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Pojo pojo = new Pojo();

        EditText nama = findViewById(R.id.nama);
        EditText nim = findViewById(R.id.nim);
        TextView tv_nama = findViewById(R.id.tv_nama);
        TextView tv_nim = findViewById(R.id.tv_nim);

        Button simpan = findViewById(R.id.simoan);
        Button tampil = findViewById(R.id.tampil);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sNama = nama.getText().toString();
                String sNim = nim.getText().toString();

                pojo.setNama(sNama);
                pojo.setNim(Integer.parseInt(sNim));

            }
        });
        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pojo.getNama()==null){
                    Toast.makeText(MainActivity6.this, "data kosong", Toast.LENGTH_SHORT).show();
                } else {

                    tv_nama.setText(pojo.getNama());
                    tv_nim.setText(String.valueOf(pojo.getNim()));
                }

            }
        });
    }
}