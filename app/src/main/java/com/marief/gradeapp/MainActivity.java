package com.marief.gradeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private EditText editTextSemester, editTextNIM, editTextNama, editTextPresensi, editTextTugas, editTextUTS, editTextUAS;
    private Button buttonHitung;
    private TextView textViewHasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSemester = findViewById(R.id.editTextSemester);
        editTextNIM = findViewById(R.id.editTextNIM);
        editTextNama = findViewById(R.id.editTextNama);
        editTextPresensi = findViewById(R.id.editTextPresensi);
        editTextTugas = findViewById(R.id.editTextTugas);
        editTextUTS = findViewById(R.id.editTextUTS);
        editTextUAS = findViewById(R.id.editTextUAS);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungNilaiAkhir();
            }
        });
    }

    private void hitungNilaiAkhir() {
        double presensi = Double.parseDouble(editTextPresensi.getText().toString());
        double tugas = Double.parseDouble(editTextTugas.getText().toString());
        double uts = Double.parseDouble(editTextUTS.getText().toString());
        double uas = Double.parseDouble(editTextUAS.getText().toString());

        double nilaiAkhir = (presensi * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);

        String grade;

        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 55) {
            grade = "C";
        } else {
            grade = "D";
        }


        textViewHasil.setText("Nilai Akhir: " + nilaiAkhir);
    }
}