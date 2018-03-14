package com.example.android.tourguide;

/**
 * Created by giorgioschirano on 11/03/18.
 */

public class Attrazioni {

    private String mName, mAddress, mPhone, mTipo;

    public Attrazioni(String Name, String Address, String Phone, String Tipo){

        mName = Name;
        mAddress = Address;
        mPhone = Phone;
        mTipo = Tipo;

    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmTipo() {
        return mTipo;
    }

}
