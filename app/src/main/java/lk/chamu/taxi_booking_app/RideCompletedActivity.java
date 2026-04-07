package lk.chamu.taxi_booking_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RideCompletedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_completed);

        findViewById(R.id.btnDone).setOnClickListener(v -> {
            Intent intent = new Intent(RideCompletedActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });

        findViewById(R.id.btnAddTip).setOnClickListener(v -> {
            // Placeholder for tip logic
            finish();
        });
    }
}
