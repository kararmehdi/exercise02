package com.example.stallions.exercise02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.text);
       final RadioButton female = (RadioButton) findViewById(R.id.female);
        final RadioButton male = (RadioButton) findViewById(R.id.male);
        final RadioButton robot = (RadioButton) findViewById(R.id.robot);
        final TextView output= (TextView) findViewById(R.id.output);
        Button add= (Button) findViewById(R.id.add);
        Button clear= (Button) findViewById(R.id.clear);

       //adding the function of add button
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String output1 = female.getText().toString();
                String output4 = male.getText().toString();
                String output5 = robot.getText().toString();

                //checking if edittext is empty
                if (input.getText().toString().trim().length() != 0) {

                    // setting output if female radio button is checked
                    if (female.isChecked()) {
                        String output2 = input.getText().toString();
                        String output3 = output1 + " " + output2 + " added.";
                        output.setText(output3);
                    }
                    // setting output if male radio button is checked
                    else if (male.isChecked()) {
                        String output2 = input.getText().toString();
                        String output3 = output4 + " " + output2 + " added.";
                        output.setText(output3);
                    }
                    // setting output if robot radio button is checked
                    else if (robot.isChecked()) {
                        String output2 = input.getText().toString();
                        String output3 = output5 + " " + output2 + " added.";
                        output.setText(output3);
                    }
                }
            }
        });

        //adding the function of clear button
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                // clearing the edittext
                // unchecking the radio buttons
                input.setText("");
                female.setChecked(false);
                male.setChecked(false);
                robot.setChecked(false);
                output.setText("");
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
