package net.azizanhakim.tebakwarna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the mulai category
        TextView mulai = (TextView)findViewById(R.id.mulai);
        //set a clicklistener on that View
        mulai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link pertama}
                Intent mulaiIntent = new Intent(MainActivity.this, pertama.class);
                //Start the new activity
                startActivity(mulaiIntent);
            }
        });

        //Find the View that shows the numbers category
        TextView keluar = (TextView)findViewById(R.id.keluar);
        //set a clicklistener on that View
        keluar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }

}
