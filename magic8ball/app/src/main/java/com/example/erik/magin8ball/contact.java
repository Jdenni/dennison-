package com.example.erik.magin8ball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button send_button = (Button) findViewById(R.id.send_button);
        send_button = (Button) findViewById(R.id.send_button);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                // Open a new activity here.
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "some@email.address" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                intent.putExtra(Intent.EXTRA_TEXT, "mail body");
                startActivity(Intent.createChooser(intent, ""));

                Button gohome_button = (Button) findViewById(R.id.gohome_button);
                gohome_button = (Button) findViewById(R.id.gohome_button);
                gohome_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        // Open a new activity here.
                        final Intent intent = new Intent(view.getContext(), Magic8BallActivity.class);
                        startActivity(intent);
                    }
                });
                ;
            }
        });
    }
}



