package com.example.erik.magin8ball;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class AnswerPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answerpage);

        final String asked_question = getIntent().getStringExtra( "asked_question" );
        final String chosen_answer = getIntent().getStringExtra( "selected_answer" );

        TextView myTextView = (TextView) findViewById(R.id.answerpage_text);
        myTextView.setText(chosen_answer);

        Button another_button = (Button)findViewById(R.id.anotherbutton );
        another_button = (Button) findViewById(R.id.anotherbutton);
       another_button.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick( final View view ) {
                // Open a new activity here.
                final Intent intent = new Intent( view.getContext(), Magic8BallActivity.class );
               startActivity( intent );
            }
        });
    }
}