package net.sikuani.fragmentoslistas;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Receiver extends Fragment {

    Activity myParentActivity;

    List<String> superHeroes;
    ArrayAdapter<String> myAdapter;

    public Receiver() {
        // Required empty public constructor
        superHeroes = new ArrayList<>();
    }

    @Override
    public void onResume() {
        super.onResume();

        ListView lv = (ListView)
        myParentActivity.findViewById(R.id.list_receiver);

        myAdapter = new ArrayAdapter<String>(
                myParentActivity,
                android.R.layout.simple_list_item_1,
                superHeroes
        );

        lv.setAdapter(myAdapter);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myParentActivity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receiver, container, false);
    }


    public void addToList(String superHeroName) {

        superHeroes.add(superHeroName);

        myAdapter.notifyDataSetChanged();
    }
}
