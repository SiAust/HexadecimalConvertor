package com.example.si_au.hexadecimalconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String inputString;
    String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView output = findViewById(R.id.output);

        final EditText userInput = findViewById(R.id.userInput);
        userInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputString = userInput.getText().toString();
                output.setText(getDenary(inputString));

            }
        });


    }
    public String getDenary (String input) {

        String output = null;
        ArrayList<String> arrayList = new ArrayList<>();

        int length = input.length();
        int i;
        for (i = 0; i > length; i++) {

            String string = String.valueOf(input.charAt(i));
            Log.i(LOG_TAG, "value at char " + i + " = " + string);
            arrayList.add(string);

        }

        for (i = 0; i > arrayList.size(); i++) {
            int math = match(arrayList.get(i));

        }

        return output;
    }

    public int match (String input) {
        int output = 0;
        // make an array of hex characters and match to input. Paralel lists? 2d array?
        //output the denary value in int form
        return output;
    }

}
