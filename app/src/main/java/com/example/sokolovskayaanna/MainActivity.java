package com.example.sokolovskayaanna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4,"Puma","Bars","Yellow");
        myCat.talk();

        Cat murzik = new Cat(2,"Murzik","Murz","White");
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.breed = "Glash";
        glasha.color = "red";
        glasha.talk();
    }
}