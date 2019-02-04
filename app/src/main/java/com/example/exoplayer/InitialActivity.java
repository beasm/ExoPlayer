package com.example.exoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        getSupportActionBar().hide();
    }

    public void goExoplayerToyStory(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url", "http://www.html5videoplayer.net/videos/toystory.mp4");
        startActivity(intent);
        finish();
    }

    public void goExoplayerBig_buck_bunny(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url", "http://www.html5videoplayer.net/videos/big_buck_bunny.mp4");
        startActivity(intent);
        finish();
    }

    public void goExoplayerMadagascar3(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url", "http://www.html5videoplayer.net/videos/madagascar3.mp4");
        startActivity(intent);
        finish();
    }

    public void goExoplayerElephants_dream(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("url", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
        startActivity(intent);
        finish();
    }

    public void goExoplayer(View view) {
        TextInputEditText tiet_input = (TextInputEditText) findViewById(R.id.input_data);
        String url = tiet_input.getText().toString();
        if (url.isEmpty()) {
            Toast toast = Toast.makeText(this, "URL no puede ser vacia, ejemplo: http://www.html5videoplayer.net/videos/madagascar3.mp4", Toast.LENGTH_LONG);
            toast.show();
        } else if (!url.contains(".mp4")) {
            Toast toast = Toast.makeText(this, "URL tiene que ser mp4", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("url", url);
            startActivity(intent);
            finish();
        }
    }

}
