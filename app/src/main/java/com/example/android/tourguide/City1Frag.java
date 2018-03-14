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
public class City1Frag extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";


    public City1Frag() {
        // Required empty public constructor
    }


    public static City1Frag newInstance(int page) {
        Bundle args = new Bundle ();
        args.putInt ( ARG_PAGE, page );
        City1Frag fragment = new City1Frag ();
        fragment.setArguments ( args );
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate ( R.layout.fragment_city1, container, false );

        String name1 = getString ( R.string.n11 ), name2 = getString ( R.string.n12 ), name3 = getString ( R.string.n13 ), name4 = getString ( R.string.n14 );
        String add1 = getString ( R.string.a11 ), add2 = getString ( R.string.a12 ), add3 = getString ( R.string.a13 ), add4 = getString ( R.string.a14 );
        String numb1 = getString ( R.string.p11 ), numb2 = getString ( R.string.p12 ), numb3 = getString ( R.string.p13 ), numb4 = getString ( R.string.p14 );
        String Tip1 = getString ( R.string.t11 ), Tip2 = getString ( R.string.t12 ), Tip3 = getString ( R.string.t13 ), Tip4 = getString ( R.string.t14 );

        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( name1, add1, numb1, Tip1 ) );
        att.add ( new Attrazioni ( name2, add2, numb2, Tip2 ) );
        att.add ( new Attrazioni ( name3, add3, numb3, Tip3 ) );
        att.add ( new Attrazioni ( name4, add4, numb4, Tip4 ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity (), att );

        ListView listView = rootView.findViewById ( R.id.ListFrag1 );


        listView.setAdapter ( itemsAdapter );

        return rootView;
    }

}
