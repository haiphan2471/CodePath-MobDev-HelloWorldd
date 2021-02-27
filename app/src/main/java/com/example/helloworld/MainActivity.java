package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textView = ((TextView) findViewById(R.id.text));
        //User can tap a button to change the text color of the label.
        findViewById(R.id.changeTextColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        //User can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.purple_200));
            }
        });

        //User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextContent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //User can tap on the background view to reset all views to default settings.
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reset the text to the original text
                ((TextView) findViewById(R.id.text)).setText("Hello from Hai!");
                //Reset the color of the text
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
                //Reset the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.teal_200));
            }
        });

        //User can update the label text with custom text entered into the text field.
        findViewById(R.id.changeTextContentCustom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (userEnteredText.isEmpty()) {
                    ((TextView) findViewById(R.id.text)).setText("Enter your own text!");
                } else {
                    ((TextView) findViewById(R.id.text)).setText(userEnteredText);
                }

            }
        });
    }
}