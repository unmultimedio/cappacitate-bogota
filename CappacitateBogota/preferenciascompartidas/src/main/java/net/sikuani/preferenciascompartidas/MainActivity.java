package net.sikuani.preferenciascompartidas;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public static final String STRING_KEY = "stringVal";
    public static final String INTEGER_KEY = "intVal";
    public static final String BOOLEAN_KEY = "booleanVal";

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getPreferences(MODE_PRIVATE);

        editor = preferences.edit();

        refreshScreen();
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

    public void saveData(View view) {
        switch (view.getId()) {
            case R.id.save_string:

                savePref(0);

                break;
            case R.id.save_int:

                savePref(1);

                break;
            case R.id.save_boolean:

                savePref(2);

                break;
            case R.id.save_all:

                savePref(0);
                savePref(1);
                savePref(2);

                break;
        }

        refreshScreen();

    }

    public void savePref(int sib) {
        switch (sib) {
            case 0:

                String valueString =
                        ((EditText) findViewById(R.id.string_value))
                                .getText().toString();

                editor.putString(STRING_KEY, valueString);
                editor.commit();

                break;
            case 1:

                try {
                    int valueInt =
                            Integer.valueOf((
                                    (EditText) findViewById(R.id.int_value))
                                    .getText().toString());

                    editor.putInt(INTEGER_KEY, valueInt);
                    editor.commit();
                }catch (NumberFormatException e){
                    Toast.makeText(this,"Lero lero", Toast.LENGTH_SHORT).show();
                }
                break;
            case 2:

                boolean valueBoolean =
                        ((CheckBox) findViewById(R.id.boolean_value))
                                .isChecked();

                editor.putBoolean(BOOLEAN_KEY, valueBoolean);
                editor.commit();

                break;
        }
    }

    public void clearData(View view) {

    }

    public void refreshScreen() {
        String stringVal = preferences.getString(STRING_KEY,
                getResources().getString(R.string.no_data));

        ((TextView) findViewById(R.id.string_render))
                .setText(stringVal);

        int intVal = preferences.getInt(INTEGER_KEY,
                0);

        ((TextView) findViewById(R.id.int_render))
                .setText(String.valueOf(intVal));

        boolean booleanVal = preferences.getBoolean(BOOLEAN_KEY,
                false);

        ((TextView) findViewById(R.id.boolean_render))
                .setText(String.valueOf(booleanVal));
    }
}
