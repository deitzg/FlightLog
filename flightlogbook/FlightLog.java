package au.com.greenreed.flightlogbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FlightLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_log);
    }

    /** Called when the user clicks the Send button */
    public void startFlight(View view) {
        // Do something in response to button

        //check mandatory inputs eg flight type, aircraft type, launch location else error

        //set flight date to current date

        //set flight start time to current time

    }
}
