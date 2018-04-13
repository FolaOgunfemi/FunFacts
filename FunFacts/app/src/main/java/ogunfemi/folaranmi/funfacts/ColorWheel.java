package ogunfemi.folaranmi.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Stores and Selects a random color. To be called on each button click of "new fact"
 */

public class ColorWheel {

    private String[] colors = {
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

    public int getColor() {  //Chose to have this return an int instead of the natural String..see "int color" below

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(colors.length);  //optional input here sets maximum colors to the number specified.
        //Randomly Select a fact

        int color = Color.parseColor(colors[randomNumber]);

        return color;
             /*   String fact = randomNumber + ""; //Lazy way to convert int to String*/

    }
}
