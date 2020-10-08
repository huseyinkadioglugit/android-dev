package com.huseyinkadioglu.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /*
    Aktivite yaratıldığında çağırılan metot.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Butona basıldığında resimlerin değişmesini istiyorum.
        İmajlarımı kodumda tan ımlamam lazım.

        Metod bir görünüme tıklayınca çalışacak.
     */
    public void changeImage(View view){
        ImageView imageView = (ImageView) findViewById(R.id.image); //eskiden gerek vardı , ama şimdi yok castinge.
        Button button = findViewById(R.id.button);

        imageView.setImageResource(R.drawable.images2);

        
    }

}