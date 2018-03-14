package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class City1Frag extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";


    public City1Frag() {
        // Required empty public constructor
    }


    private int mPage;

    public static City1Frag newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        City1Frag fragment = new City1Frag();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.fragment_city1, container, false );

        // Create a list of words
        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( "Guinnes Pub", "Via Da Vinci","329 709 3659", "Pub") );
        att.add ( new Attrazioni ( "Gravina", "Via per Laterza" ,"NO Phone", "Parck" ) );
        att.add ( new Attrazioni ( "Gusto", "Via Lucana","No Phone", "Fast Food"  ) );
        att.add ( new Attrazioni ( "Mosto", "Via Ridola","0835 332733", "Alehouse"  ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity(), att );

        ListView listView = (ListView) rootView.findViewById(R.id.ListFrag1);


        listView.setAdapter ( itemsAdapter );

        return rootView;
    }

}
