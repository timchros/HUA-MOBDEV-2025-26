package hua.dit.mobdev.ec.lab1c;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.button1).setOnClickListener((v) -> {
            Log.d(TAG, "Button 1 - Explicit Intent");
            // Find Views
            final EditText edittext = findViewById(R.id.user_name);
            final Spinner spinner = findViewById(R.id.user_sex);
            // Get Data from Fields
            final String user_name = edittext.getText().toString();
            final String user_sex = spinner.getSelectedItem().toString();
            // Log Data - View using Logcat
            final String log_msg = "User: "+ user_name + " , Sex: " + user_sex;
            Log.d(TAG, log_msg);
            // Go to next Screen using an Explicit Intent
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.setData(Uri.parse("other-data"));
            intent.putExtra("name", user_name);
            intent.putExtra("sex", user_sex);
            startActivity(intent);
        });

        findViewById(R.id.button2).setOnClickListener((v) -> {
            Log.d(TAG, "Button 2 - Implicit Intent");
            // Start another "local" Activity using an Implicit Intent
            Intent intent2 = new Intent(Intent.ACTION_SEND);
            startActivity(intent2);
        });

    } // End of onCreate(..)

}