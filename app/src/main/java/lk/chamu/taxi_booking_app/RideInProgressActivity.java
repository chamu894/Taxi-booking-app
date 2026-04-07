package lk.chamu.taxi_booking_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class RideInProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_in_progress);

        // Simulate trip progress and completion after 5 seconds
        new Handler().postDelayed(() -> {
            startActivity(new Intent(RideInProgressActivity.this, RideCompletedActivity.class));
            finish();
        }, 5000);

        findViewById(R.id.btnCancelRide).setOnClickListener(v -> finish());
    }
}
