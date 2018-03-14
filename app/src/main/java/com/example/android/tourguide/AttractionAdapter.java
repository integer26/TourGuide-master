package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attrazioni> {

    public AttractionAdapter(Activity context, ArrayList<Attrazioni> att) {

        super ( context, 0, att );
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate ( R.layout.layout_elem_list, parent, false );
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Attrazioni currentAndroidFlavor = getItem ( position );

        TextView nameTextView = listItemView.findViewById ( R.id.Name );
        assert currentAndroidFlavor != null;
        nameTextView.setText ( currentAndroidFlavor.getmName () );

        TextView addressTextView = listItemView.findViewById ( R.id.Address );
        addressTextView.setText ( currentAndroidFlavor.getmAddress () );

        TextView numberTextView = listItemView.findViewById ( R.id.Number );
        numberTextView.setText ( currentAndroidFlavor.getmPhone () );

        TextView tipoTextView = listItemView.findViewById ( R.id.Tipology );
        tipoTextView.setText ( currentAndroidFlavor.getmTipo () );

        return listItemView;
    }
}