package com.example.sokolovskayaanna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        z++;

        myCat = new Cat(4, "Puma", "Bars", "Yellow");
        myCat.talk();

        Cat murzik = new Cat(2, "Murzik", "Murz", "White");
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.breed = "Glash";
        glasha.color = "red";
        glasha.talk();

        Puma puma = new Puma();
        puma.name = "Leo";

        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        Log.i("isAlive", "My name is " + puma.name + " and " + puma.breathe());
    }

    void method(double x, int y) {
        int a;
        a = 1;
        a = y + 1;
        double d = x * 2;
        z = a + y;
    }

    void method1() {
        int a;
        a = 1;
    }
}