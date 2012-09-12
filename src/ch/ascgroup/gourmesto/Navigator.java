package ch.ascgroup.gourmesto;

import org.apache.cordova.DroidGap;
import android.os.Bundle;
import android.view.Menu;

public class Navigator extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_navigator, menu);
        return true;
    }  
}
