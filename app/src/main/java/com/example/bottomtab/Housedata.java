package com.example.bottomtab;

import java.util.ArrayList;

public class Housedata {
    private static int[] houseData = {
                R.drawable.house1,
                R.drawable.house2,
                R.drawable.house3,
                R.drawable.house4,
                R.drawable.house5,
                R.drawable.house6,
                R.drawable.house7
    };

    private static int[] apartData = {
            R.drawable.apart1,
            R.drawable.apart2,
            R.drawable.apart3,
            R.drawable.apart4,
            R.drawable.apart5,
            R.drawable.apart6,
            R.drawable.apart7,
            R.drawable.apart8,
            R.drawable.apart9,
            R.drawable.apart10,
            R.drawable.apart11
    };



    public static ArrayList<House> getListData() {
        ArrayList<House> list = new ArrayList<>();
        for (int position = 0; position < houseData.length; position++) {
            House house = new House();
            house.setHouse(houseData[position]);
            house.setApart(apartData[position]);
            list.add(house);
        }
        return list;
    }
}
