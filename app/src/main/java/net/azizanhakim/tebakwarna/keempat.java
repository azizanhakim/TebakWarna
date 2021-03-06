package net.azizanhakim.tebakwarna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class keempat extends AppCompatActivity {
    private String keterangan1, keterangan2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keempat);

        //Find the View that shows the mulai category
        TextView lanjut = (TextView)findViewById(R.id.lanjut);
        //set a clicklistener on that View
        lanjut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link pertama}
                Intent lanjutIntent = new Intent(keempat.this, kelima.class);
                //Start the new activity
                startActivity(lanjutIntent);
            }
        });
    }
    public void displayBenar1(String benar){
        TextView kuantitasView = (TextView) findViewById(R.id.keterangan);
        kuantitasView.setText(benar);
    }
    public void displayBenar2(String benar){
        TextView kuantitasView = (TextView) findViewById(R.id.jawaban);
        kuantitasView.setText(benar);
    }
    public void benar(View view){
        keterangan1 ="anda benar!";
        keterangan2 ="";
        displayBenar1(keterangan1);
        displayBenar2(keterangan2);
    }

    public void displaySalah1(String salah){
        TextView kuantitasView = (TextView) findViewById(R.id.keterangan);
        kuantitasView.setText(salah);
    }

    public void displaySalah2(String salah){
        TextView kuantitasView = (TextView) findViewById(R.id.jawaban);
        kuantitasView.setText(salah);
    }
    public void salah(View view){
        keterangan1 ="anda salah!";
        keterangan2 ="Warna : Magenta";
        displaySalah1(keterangan1);
        displaySalah2(keterangan2);
    }
}
