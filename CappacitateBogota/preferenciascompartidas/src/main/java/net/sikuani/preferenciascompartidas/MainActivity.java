package net.sikuani.preferenciascompartidas;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void saveData(View view){
        switch (view.getId()){
            case R.id.save_string:
                
                String value =
                        ((EditText)findViewById(R.id.string_value))
                        .getText().toString();

                SharedPreferences preferences =
                        getPreferences(MODE_PRIVATE);

                SharedPreferences.Editor editor =
                        preferences.edit();

                editor.putString("stringVal", value);
                editor.commit();

                break;
            case R.id.save_int:
                break;
            case R.id.save_boolean:
                break;
            case R.id.save_all:
                break;
        }
    }

    public void clearData(View view){

    }
}
