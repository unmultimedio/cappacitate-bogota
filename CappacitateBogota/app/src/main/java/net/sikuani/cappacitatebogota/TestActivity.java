package net.sikuani.cappacitatebogota;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class TestActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        String str = getIntent().getStringExtra("nombre");

        ((TextView)findViewById(R.id.renderText))
                .setText(str);

    }
}
