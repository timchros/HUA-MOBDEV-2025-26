package hua.dit.mobdev.ec.lab1c;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Get data from Intent object
        final Intent intent = getIntent();
        final Bundle extras = intent.getExtras();
        assert extras != null;
        final String name = extras.getString("name", "none");
        final String sex = extras.getString("sex", "none");
        // Show data in the Screen
        final TextView textView = findViewById(R.id.second_page_output_area);
        textView.setText("name: " + name + " , sex: " + sex);

        findViewById(R.id.go_to_eclass).setOnClickListener((v)->{
            Log.d(TAG, "Going to eclass ...");
            // Start another App (Web Browser) using an Implicit Intent
            final String site_url = "https://eclass.hua.gr/";
            final Intent open_web_browser_intent = new Intent(Intent.ACTION_VIEW);
            open_web_browser_intent.setData(Uri.parse(site_url));
            startActivity(open_web_browser_intent);
        });

        findViewById(R.id.go_back_button).setOnClickListener((v)->{
            Log.d(TAG, "Going back ... to Main Activity");
            // Go back .. Start Main Activity using an Explicit Intent
            final Intent go_back_intent = new Intent(this, MainActivity.class);
            startActivity(go_back_intent);
        });

    } // End of onCreate(..)

}