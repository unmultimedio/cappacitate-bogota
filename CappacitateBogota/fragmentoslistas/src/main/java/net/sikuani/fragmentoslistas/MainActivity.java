package net.sikuani.fragmentoslistas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity
    implements Communicator {

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

    @Override
    public void sendSuperHero(View view) {
        //Avisarle al primer fragmento
        Sender fragmentSender = (Sender)
        getFragmentManager().findFragmentById(R.id.fragment_sender);

        fragmentSender.sendData();
    }

    @Override
    public void receiveNameSuperhero(String superHeroName) {
        //Enviarlo al receptor para agregar a la lista
        Receiver fragmentReceiver = (Receiver)
        getFragmentManager().findFragmentById(R.id.fragment_receiver);

        fragmentReceiver.addToList(superHeroName);
    }
}
