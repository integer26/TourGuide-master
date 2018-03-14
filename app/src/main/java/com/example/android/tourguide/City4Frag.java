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
public class City4Frag extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    public City4Frag() {
        // Required empty public constructor
    }

    private int mPage;

    public static City4Frag newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        City4Frag fragment = new City4Frag();
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
        View rootView = inflater.inflate ( R.layout.fragment_city4, container, false );

        // Create a list of words
        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( "Porta Napoli", "Piazzetta Arco di Trionfo","No Phone", "Historical Attraction"  ) );
        att.add ( new Attrazioni ( "Teatro Romano", "Via Arte della Cartapesta" ,"No Phone", "Historical Attraction" ) );
        att.add ( new Attrazioni ( "Road 66", "Via dei Perroni","0832 246568", "Pub"  ) );
        att.add ( new Attrazioni ( "Urban Cafè", "Piazza Vittorio Emanuele","0832 288388", "Cafè"  ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity(), att );

        ListView listView = (ListView) rootView.findViewById(R.id.ListFrag4);

        listView.setAdapter ( itemsAdapter );

        return rootView;
    }

}
