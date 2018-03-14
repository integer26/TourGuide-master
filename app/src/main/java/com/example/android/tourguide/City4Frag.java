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
public class City4Frag extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    public City4Frag() {
        // Required empty public constructor
    }

    public static City4Frag newInstance(int page) {
        Bundle args = new Bundle ();
        args.putInt ( ARG_PAGE, page );
        City4Frag fragment = new City4Frag ();
        fragment.setArguments ( args );
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate ( R.layout.fragment_city4, container, false );

        String name1 = getString ( R.string.n41 ), name2 = getString ( R.string.n42 ), name3 = getString ( R.string.n43 ), name4 = getString ( R.string.n44 );
        String add1 = getString ( R.string.a41 ), add2 = getString ( R.string.a42 ), add3 = getString ( R.string.a43 ), add4 = getString ( R.string.a44 );
        String numb1 = getString ( R.string.p41 ), numb2 = getString ( R.string.p42 ), numb3 = getString ( R.string.p43 ), numb4 = getString ( R.string.p44 );
        String Tip1 = getString ( R.string.t41 ), Tip2 = getString ( R.string.t42 ), Tip3 = getString ( R.string.t43 ), Tip4 = getString ( R.string.t44 );

        //Create a list
        ArrayList<Attrazioni> att = new ArrayList<Attrazioni> ();
        att.add ( new Attrazioni ( name1, add1, numb1, Tip1 ) );
        att.add ( new Attrazioni ( name2, add2, numb2, Tip2 ) );
        att.add ( new Attrazioni ( name3, add3, numb3, Tip3 ) );
        att.add ( new Attrazioni ( name4, add4, numb4, Tip4 ) );


        AttractionAdapter itemsAdapter = new AttractionAdapter ( getActivity (), att );

        ListView listView = rootView.findViewById ( R.id.ListFrag4 );

        listView.setAdapter ( itemsAdapter );

        return rootView;
    }

}
