package com.dennis.tsuma.jokesrenderer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Renderer extends AppCompatActivity {
    private String jokeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renderer);
        jokeString=getIntent().getStringExtra("jokeString");
        if(savedInstanceState != null){
            if(savedInstanceState.containsKey("jokeString")){
                jokeString=savedInstanceState.getString("jokeString");
            }
        }
        TextView jokeTextView = findViewById(R.id.jokes_tv);
        jokeTextView.setText(jokeString);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(jokeString != null){
            outState.putString("jokeString",jokeString);
        }
    }
}
