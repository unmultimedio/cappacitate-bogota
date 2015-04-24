package net.sikuani.cappacitatebogota;

import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by julian on 4/24/15.
 */
public class MenuActivity extends ActionBarActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.item2:
                Toast.makeText(this,
                        "Compartiendo...",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                break;
            case R.id.item4:
                break;
            case R.id.action_settings:
                break;
        }

        return true;
    }
}
