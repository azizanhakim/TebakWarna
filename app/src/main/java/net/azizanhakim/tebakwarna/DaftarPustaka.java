package net.azizanhakim.tebakwarna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DaftarPustaka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of numberEnglish
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Kuning", "#FFFF00", R.drawable.warna_kuning));
        words.add(new Word("Merah Jambu", "#FFC0CB", R.drawable.warna_merahjambu));
        words.add(new Word("Hijau", "#00FF00", R.drawable.warna_hijau));
        words.add(new Word("Magenta", "#FF00FF", R.drawable.warna_magenta));
        words.add(new Word("Violet", "#8F00FF", R.drawable.warna_violet));
        words.add(new Word("Perak", "#C0C0C0", R.drawable.warna_perak));
        words.add(new Word("Cokelat", "#964B00", R.drawable.warna_cokelat));
        words.add(new Word("Abu-abu", "#808080", R.drawable.warna_abuabu));
        words.add(new Word("Sian", "#00FFFF", R.drawable.warna_sian));
        words.add(new Word("Ungu", "#BF00FF", R.drawable.warna_ungu));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
