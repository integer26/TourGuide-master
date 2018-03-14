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
public class City2Frag extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";


    public City2Frag() {
        // Required empty public constructor
    }

    private int mPage;

    public static City2Frag newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        City2Frag fragment = new City2Frag();
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
        View rootView = inflater.inflate ( R.layout.fragment_city2, container, false );

        // Create a list of words
        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( "Castello Aragonese", "Piazza Castello","099 775 3438", "Historical attraction"  ) );
        att.add ( new Attrazioni ( "Museo Archeologico", "Via Cavour","099 453 2112", "Museum" ) );
        att.add ( new Attrazioni ( "Avalon Pub", "Viale Unicef","333 850 8431", "Pub"  ) );
        att.add ( new Attrazioni ( "Avalon Pub", "Via F.Cavallotti","346 109 9490", "Pub"  ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity(), att );

        ListView listView = (ListView) rootView.findViewById(R.id.ListFrag2);

        listView.setAdapter ( itemsAdapter );


        return rootView;
    }

}
