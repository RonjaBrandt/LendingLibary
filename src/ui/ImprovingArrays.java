package ui;

import java.util.HashSet;

public class ImprovingArrays {
    public static void main(String[] args) {


        HashSet<String> myHashSet = new HashSet<>();


        myHashSet.add("first item");
        myHashSet.add("second item");
        myHashSet.add("third item");
        myHashSet.add("fourth item");


        System.out.println(myHashSet.size());

        myHashSet.remove("second item");

        System.out.println(myHashSet.size());
    }





}
