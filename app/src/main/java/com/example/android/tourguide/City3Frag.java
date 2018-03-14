package com.example.android.tourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
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

    public static City3Frag newInstance(int page) {
        Bundle args = new Bundle ();
        args.putInt ( ARG_PAGE, page );
        City3Frag fragment = new City3Frag ();
        fragment.setArguments ( args );
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate ( R.layout.fragment_city3, container, false );

        String name1 = getString ( R.string.n1 ), name2 = getString ( R.string.n2 ), name3 = getString ( R.string.n3 ), name4 = getString ( R.string.n4 );
        String add1 = getString ( R.string.a1 ), add2 = getString ( R.string.a2 ), add3 = getString ( R.string.a3 ), add4 = getString ( R.string.a4 );
        String numb1 = getString ( R.string.p1 ), numb2 = getString ( R.string.p2 ), numb3 = getString ( R.string.p3 ), numb4 = getString ( R.string.p4 );
        String Tip1 = getString ( R.string.t1 ), Tip2 = getString ( R.string.t2 ), Tip3 = getString ( R.string.t3 ), Tip4 = getString ( R.string.t4 );


        // Create a list of words
        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( name1, add1, numb1, Tip1 ) );
        att.add ( new Attrazioni ( name2, add2, numb2, Tip2 ) );
        att.add ( new Attrazioni ( name3, add3, numb3, Tip3 ) );
        att.add ( new Attrazioni ( name4, add4, numb4, Tip4 ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity (), att );

        ListView listView = rootView.findViewById ( R.id.ListFrag3 );

        listView.setAdapter ( itemsAdapter );

        return rootView;
    }

}
