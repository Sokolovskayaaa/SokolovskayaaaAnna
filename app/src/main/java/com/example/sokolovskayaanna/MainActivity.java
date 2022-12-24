package com.example.sokolovskayaanna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat32 = new Cat(1, "Murz");
        cat32.talk();
        Cat cat33 = new Cat(5, "Bars");
        cat33.talk();
        Cat cat34 = new Cat(8, "Sokol");
        cat34.talk();

        Cat cat35 = new Cat();
        Cat cat36 = new Cat();
        Cat cat37 = new Cat();
        Cat cat38 = new Cat();

        Log.i("count", "" + Cat.count);

        Cat.CountResetter countResetter = new Cat.CountResetter();

        Log.i("count", "" + Cat.count);
    }

}