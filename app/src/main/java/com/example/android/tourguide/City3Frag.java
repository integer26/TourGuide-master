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
public class City3Frag extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";


    public City3Frag() {
        // Required empty public constructor
    }

    private int mPage;

    public static City3Frag newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        City3Frag fragment = new City3Frag();
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
        View rootView = inflater.inflate ( R.layout.fragment_city3, container, false );


        // Create a list of words
        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( "La Ciclatera", "Corte Colagualano","333 373 5155", "Bar"  ) );
        att.add ( new Attrazioni ( "CAVANBAH Pub", "Piazza Mercantile" ,"329 648 6618", "Pub" ) );
        att.add ( new Attrazioni ( "Teatro Petruzzelli", "Corso Cavour","080 975 2810", "Theatre"  ) );
        att.add ( new Attrazioni ( "Basilica di San Nicola", "Largo Abate Elia","080 573 7111", "Church"  ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity(), att );

        ListView listView = (ListView) rootView.findViewById(R.id.ListFrag3);

        listView.setAdapter ( itemsAdapter );

        return rootView;
    }

}
