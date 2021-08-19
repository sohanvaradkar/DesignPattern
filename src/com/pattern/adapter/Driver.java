package com.pattern.adapter;

public class Driver {
    public static void main(String[] args) {
        AndroidAdapter androidAdapter=new AndroidAdapter();
        AndroidPhone androidPhone=new OnePlus();
        androidAdapter.charge(androidPhone);

        IPhoneAdapter iPhoneAdapter=new IPhoneAdapter();
        IPhone iPhone=new IPhoneX();
        iPhoneAdapter.charge(iPhone);

        AndroidToIPhoneAdapter androidToIPhoneAdapter=new AndroidToIPhoneAdapter(androidPhone);
        iPhoneAdapter.charge(androidToIPhoneAdapter);

    }
}
