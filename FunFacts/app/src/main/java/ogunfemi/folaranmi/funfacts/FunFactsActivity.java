package ogunfemi.folaranmi.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

///NOTE: the App icon is present multiple times in the resources folder in different resolutions to provide the best presentation for every available Android screen resolution
            // ie. mipmap hdpi, mipmap mdpi, mipmap xhdpi, mipmap xxhdpi, mipmap xxxhdpi.
public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName(); //sets the Tag equal to whatever the class name even if it is refactored to another name.

    //Declare View Variables
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assigning views from layout file to corresponding variables
        factTextView =findViewById(R.id.factTextView);

        showFactButton = findViewById(R.id.showFactButton);

        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //random fact pulled from FactBook class
              String fact = factBook.getFact();

                //update screen with new fact
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                //Update BackgroundColor each time a new fact is selected

                //resets the color of the button text to match the background
                showFactButton.setTextColor(color);



            }
        };
        showFactButton.setOnClickListener(listener);

       Toast.makeText(this, "Activity Created", Toast.LENGTH_SHORT).show();
        // Toasts, like Logs, do not need to be assigned to an instance variable
        //Log (String tag, String msg)
        Log.d(TAG , "We're logging from the OnCreate() method!");
    }
}
