package com.example.ruby.funfacts;


import android.graphics.Color;

import java.util.Random;

public class ColorWheel
{
    // Fields or Member variables- properties about the object
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Methods - Actions the object can take
    public int getColor()
    {
        String color;
        // Randomly Select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length); //generates number from 0 to 9
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);   //parse that takes hex string and converts it into integer representation

        return colorAsInt;
    }
}
