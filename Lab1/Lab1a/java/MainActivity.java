package hua.dit.mobdev.ec.lab1a;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "on-create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "on-start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "on-resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "on-pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "on-stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "on-destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "on-RE-start");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Check Orientation and Log the appropriate message
        if ( newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i(TAG, "ORIENTATION - PORTRAIT");
        } else {
            Log.i(TAG, "ORIENTATION - OTHER !");
        }
    } // End of onConfigurationChanged(..)

}