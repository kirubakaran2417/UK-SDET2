package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
    @DataProvider(name = "testdata")
    public String[] testdata(){
        String[] data = new String[4];
        data[0]="Track And Trail";
        data[1]="Chennai Cyclists";
        data[2]="Bums On The Saddle";
        data[3]="Cyclop";
        return data;
    }
    @Test(dataProvider = "testdata")
    public void test1(String data){
        System.out.println("Tested: "+data);
    }
}
