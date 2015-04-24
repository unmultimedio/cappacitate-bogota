package net.sikuani.cappacitatebogota;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,
                "onCreate()",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this,
                "onPause()",
                Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,
                "onStart()",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,
                "onResume()",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this,
                "onStop()",
                Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this,
                "onDestroy()",
                Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,
                "onRestart()",
                Toast.LENGTH_SHORT).show();
    }

    public void clickOnButton(View view){

        /*Toast t;
        t = Toast.makeText(this, "Hola Usuario!", Toast.LENGTH_SHORT);
        t.show();*/
        Toast.makeText(this,
                getResources().getString(R.string.toast_msg)
                , Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, TestActivity.class);

        String msg;

        EditText et = (EditText)findViewById(R.id.editText);

        msg = et.getText().toString();

        intent.putExtra("nombre",msg);

        startActivity(intent);
    }
}
