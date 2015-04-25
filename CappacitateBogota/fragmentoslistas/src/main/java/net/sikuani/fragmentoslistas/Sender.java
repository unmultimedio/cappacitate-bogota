package net.sikuani.fragmentoslistas;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sender extends Fragment {

    Communicator myActivityParent;

    public Sender() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            myActivityParent = (Communicator)activity;
        }catch (Exception e){
            //Lero lero no me dejo
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sender, container, false);
    }


    public void sendData(){
        EditText et = (EditText)
        ((Activity)myActivityParent).findViewById(R.id.textBoxSender);

        String superHeroName = et.getText().toString();

        if(!superHeroName.isEmpty()){
            et.setText("");
            myActivityParent.receiveNameSuperhero(superHeroName);
        }
    }
}
