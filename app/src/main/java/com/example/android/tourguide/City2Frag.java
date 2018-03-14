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
public class City2Frag extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";


    public City2Frag() {
        // Required empty public constructor
    }

    public static City2Frag newInstance(int page) {
        Bundle args = new Bundle ();
        args.putInt ( ARG_PAGE, page );
        City2Frag fragment = new City2Frag ();
        fragment.setArguments ( args );
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate ( R.layout.fragment_city2, container, false );

        String name1 = getString ( R.string.n21 ), name2 = getString ( R.string.n22 ), name3 = getString ( R.string.n23 ), name4 = getString ( R.string.n24 );
        String add1 = getString ( R.string.a21 ), add2 = getString ( R.string.a22 ), add3 = getString ( R.string.a23 ), add4 = getString ( R.string.a24 );
        String numb1 = getString ( R.string.p21 ), numb2 = getString ( R.string.p22 ), numb3 = getString ( R.string.p23 ), numb4 = getString ( R.string.p24 );
        String Tip1 = getString ( R.string.t21 ), Tip2 = getString ( R.string.t22 ), Tip3 = getString ( R.string.t23 ), Tip4 = getString ( R.string.t24 );

        //Create a list
        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( name1, add1, numb1, Tip1 ) );
        att.add ( new Attrazioni ( name2, add2, numb2, Tip2 ) );
        att.add ( new Attrazioni ( name3, add3, numb3, Tip3 ) );
        att.add ( new Attrazioni ( name4, add4, numb4, Tip4 ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity (), att );

        ListView listView = rootView.findViewById ( R.id.ListFrag2 );

        listView.setAdapter ( itemsAdapter );


        return rootView;
    }

}
