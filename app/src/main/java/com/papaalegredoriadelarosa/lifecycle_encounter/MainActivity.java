package com.papaalegredoriadelarosa.lifecycle_encounter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView countText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onStart");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countText = findViewById(R.id.count_text);
        Button countButton = findViewById(R.id.count_button);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
        }
        countText.setText("Gabby's Count: " + count);
        countButton.setOnClickListener(v -> {
            count++;
            countText.setText("Gabby's Count: " + count);
        });
    }
    private static final String TAG = "Marabulas";
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }
}