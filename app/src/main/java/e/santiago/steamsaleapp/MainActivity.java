package e.santiago.steamsaleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//TODO: This Activity will implement LoaderManager.LoaderCallbacs() interface so it can retrieve data from the internet.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        downloadData();
    }

    public void downloadData() {

        //TODO: Either you need a complete url or you need to build one from the user data.
    }
}
