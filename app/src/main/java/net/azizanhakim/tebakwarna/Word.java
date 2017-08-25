package net.azizanhakim.tebakwarna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * Created by J I J A N on 8/21/2017.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok Translation for that word.
 */


public class Word {

    /** Default Translation for the word */
    private String mWarna;

    /** Miwok Translation for the word */
    private String mKode;

    private int mGambar;

    public Word(String Warna, String Kode, int Gambar){
        mWarna = Warna;
        mKode = Kode;
        mGambar = Gambar;
    }

    /**
     * Get the Miwok translation of the word
     */
    public  String getWarna(){
        return mWarna;
    }

    /**
     * Get the Miwok translation of the word
     */
    public  String getKode(){
        return mKode;
    }

    public int getGambar(){ return mGambar; }
}

