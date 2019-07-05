package com.syafiqmarzuki21.msyafiqmarzuki.fomulir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNama,edMotivasi;
    Button btnHasil;
    TextView hslNama,hslMotivasi,hslPilihan;
    Spinner spinnerPilihan;
    String[] pilihanHidup = {"Presiden", "Menteri" , "Pengusaha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.etNama);
        edMotivasi = findViewById(R.id.etMotivasi);
        spinnerPilihan = findViewById(R.id.spinner_pilihan);
        btnHasil = findViewById(R.id.btnHasil);
        hslNama = findViewById(R.id.hslNama);
        hslMotivasi = findViewById(R.id.hslMotivasi);
        hslPilihan = findViewById(R.id.hslPilihan);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinnerPilihan.getSelectedItem().toString().equals(pilihanHidup[0])){
                    String mnama = edNama.getText().toString().trim();
                    String mmotivasi = edMotivasi.getText().toString().trim();

                    hslNama.setText(" : "+mnama);
                    hslMotivasi.setText(" : "+mmotivasi);
                    hslPilihan.setText(" : "+spinnerPilihan.getSelectedItem().toString());
                }else if(spinnerPilihan.getSelectedItem().toString().equals(pilihanHidup[1])){
                    String mnama = edNama.getText().toString().trim();
                    String mmotivasi = edMotivasi.getText().toString().trim();

                    hslNama.setText(" : "+mnama);
                    hslMotivasi.setText(" : "+mmotivasi);
                    hslPilihan.setText(" : "+spinnerPilihan.getSelectedItem().toString());
                }else if(spinnerPilihan.getSelectedItem().toString().equals(pilihanHidup[2])){
                    String mnama = edNama.getText().toString().trim();
                    String mmotivasi = edMotivasi.getText().toString().trim();

                    hslNama.setText(" : "+mnama);
                    hslMotivasi.setText(" : "+mmotivasi);
                    hslPilihan.setText(" : "+spinnerPilihan.getSelectedItem().toString());

                }
            }
        });
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, pilihanHidup);
        spinnerPilihan.setAdapter(adapter);



    }
}
