package hua.dit.mobdev.ec.lab1b;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        /* TODO: Select either Linear or Constraint Layout */
        // setContentView(R.layout.activity_main);
        // Linear Layout
        // setContentView(R.layout.activity_main_linear_layout);
        // Constrain Layout
        // setContentView(R.layout.activity_main_constraint_layout);
        setContentView(R.layout.activity_main_linear_layout);

        // Show Widgets below bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Add OnClickListener to Login Button
        final Button login_button_widget = findViewById(R.id.login_button);
        login_button_widget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Login Button - onClick()");
                // Find Views
                final EditText username = findViewById(R.id.username);
                final EditText password = findViewById(R.id.password);
                final TextView output = findViewById(R.id.output_area);
                // Get Data from input fields
                final String username_str = username.getText().toString().trim();
                final String password_str = password.getText().toString().trim();
                // Check
                if (username_str.isEmpty() || password_str.isEmpty()) {
                    // Show a pop-up messageg using Toast
                    Toast.makeText(MainActivity.this, "Username or Password is empty !", Toast.LENGTH_SHORT).show();
                    // Clear output area
                    output.setText("");
                } else {
                    // Log Data
                    final String log_msg = "username: " + username_str + " , password: " + password_str;
                    Log.i(TAG, log_msg);
                    // Show Data on the Screen
                    final String screen_msg = "Given: " + username_str + " , " + password_str;
                    output.setText(screen_msg);
                }
            } // END of onClick(..)
        });
    }
}