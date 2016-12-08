package com.example.erik.magin8ball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Button;
import java.util.Random;


public class Magic8BallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic8_ball);

        Button submit_button = (Button)findViewById( R.id.submitButton );
        final TextView question_text = (TextView)findViewById( R.id.main_text );

        submit_button = (Button) findViewById(R.id.submitButton);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( final View view ) {
                // Open a new activity here.
                final Intent intent = new Intent( view.getContext(), AnswerPage.class );
                String[] answers = getResources().getStringArray( R.array.text );


                intent.putExtra( "asked_question", question_text.getText().toString() );
                intent.putExtra( "selected_answer", answers[ new Random().nextInt( answers.length ) ] );

                startActivity( intent );
            }
        });

        Button contact_button = (Button)findViewById(R.id.contactbutton);
        contact_button = (Button) findViewById(R.id.contactbutton);
        contact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( final View view ) {
                // Open a new activity here.
                final Intent intent = new Intent( view.getContext(), contact.class );
                startActivity( intent );
            }
        });
    }
}