package com.example.a4screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void openhulk(View v) {
        Toast.makeText(this, "Opening Internet", Toast.LENGTH_SHORT).show();
        gotoUrl("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=hulk");
    }
    public void openthanos(View v){
        Toast.makeText(this, "Opening Internet", Toast.LENGTH_SHORT).show();
        gotoUrl("https://www.bing.com/search?q=thanos&qs=n&form=QBRE&sp=-1&ghc=1&pq=thano&sc=8-5&sk=&cvid=A63D634CFCAB4177BE6A14D786F5A76E");
    }
    public  void openavengers(View v){
        Toast.makeText(this, "Opening Internet", Toast.LENGTH_SHORT).show();
        gotoUrl("https://www.bing.com/search?q=avengers&qs=n&form=QBRE&sp=-1&pq=&sc=0-0&sk=&cvid=84D67CF07306411B90D87763EB00C9B3");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

    public static class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }

        public void openActivity2(View v) {
            Toast.makeText(this, "Opening screen 2", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }

        public void openActivity3(View v) {
            Toast.makeText(this, "Opening screen 3", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }

        public void openActivity4(View v) {
            Toast.makeText(this, "Opening screen 4", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity4.class);
            startActivity(intent);
        }
    }
}