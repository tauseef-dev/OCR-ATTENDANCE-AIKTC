package cultoftheunicorn.marvel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import org.opencv.cultoftheunicorn.marvel.R;

public class MainActivity extends AppCompatActivity {
    Button faq;
    Button web_app;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faq= (Button)findViewById(R.id.FAQ);
        web_app= (Button) findViewById(R.id.web_aik);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),aiktc_chtbt.class);
                startActivity(intent);
            }
        });

        web_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),aiktc_web.class);
                startActivity(intent);
            }
        });



        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("AIKTC Attendance System");
        }

        Button recognizeButton = (Button) findViewById(R.id.recognizeButton);
        Button trainingButton = (Button) findViewById(R.id.trainingButton);

        recognizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Recognize.class));
            }
        });

        trainingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NameActivity.class));
            }
        });



    }

}
