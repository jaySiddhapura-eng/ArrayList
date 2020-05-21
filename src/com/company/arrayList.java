package com.company;

import java.util.*;

public class arrayList {

    public void ArrayListMethod(){
        ArrayList<String> values = new ArrayList<String>();
        values.add("string1");
        values.add("string2");
        values.add("string3");
        values.add("string4");
        System.out.println(values);
    }

    public void mixElements(){
        ArrayList<Object> val = new ArrayList<>();
        val.add(0,"s1");
        val.add(1,123459);
        val.add(2,0.01);
        val.add(3,1);
        System.out.println(val);
    }

    public void ArrayListMethod1(){

        ArrayList<Object> val1 = new ArrayList<>();
        val1.add(0,"s1");
        val1.add(1,123459);
        val1.add(2,0.01);
        val1.add(3,1);

        Object retrive = val1;
        System.out.println(retrive);

        val1.set(1,"set example");
        System.out.println(val1);

        //val1.set(4,"invalid");
    }

    public void arrayListGet(){
        ArrayList<Object> val1 = new ArrayList<>();
        val1.add(0,"s1");
        val1.add(1,123459);
        val1.add(2,0.01);
        val1.add(3,1);

        Object retrive = val1.get(0);
        System.out.println(retrive);

        System.out.println(val1.get(4));
    }

    public void removeElement(){
        ArrayList<Object> rem = new ArrayList<>();
        rem.add(1);
        rem.add(2);
        rem.add(3);
        System.out.println("Old array List: "+rem);

        rem.remove(1);

        System.out.println("after removing an element: "+ rem);

        //rem.remove(3);
    }

    public void removeAllElement(){
        ArrayList<Object> removeAll = new ArrayList<>();
        removeAll.add(0, "el1");
        removeAll.add(1,"el2");
        removeAll.add(2,"el3");
        System.out.println(removeAll);

        int o = removeAll.size();
        System.out.println("number of elements: "+o);

        removeAll.clear();
        System.out.println(removeAll);
    }

    public void sortingArrayList(){
        ArrayList<String> sortExample = new ArrayList<>();
        sortExample.add("D");
        sortExample.add("B");
        sortExample.add("A");
        sortExample.add("C");
        sortExample.add("E");

        System.out.println("unsorted ArrayList: " + sortExample);
        Collections.sort(sortExample);
        System.out.println("sorted ArrayList[Acs]: "+ sortExample);

        Collections.sort(sortExample,Collections.reverseOrder());
        System.out.println("sorted ArrayList[Desc]"+sortExample);
    }

    public void addingTwoArrayLists(){
        ArrayList<String> ArrayList1 = new ArrayList<String>();
        ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
        ArrayList<String> ArrayList3 = new ArrayList<String>();

        ArrayList1.add("A");
        ArrayList1.add("B");
        ArrayList1.add("C");
        ArrayList1.add("D");

        ArrayList2.add(1);
        ArrayList2.add(2);
        ArrayList2.add(3);

        ArrayList3.add("String1");
        ArrayList3.add("String2");

        System.out.println("AL1: "+ArrayList1);
        System.out.println("AL2: "+ArrayList2);
        System.out.println("AL3: "+ArrayList3);

        //ArrayList1.addAll(ArrayList2);
        // two arraylist must have same element datatype
        // arraylist 1 has String as an element datatype
        // arraylist 2 has Integer as an element datatype

//        ArrayList1.addAll(ArrayList3);
//        System.out.println(ArrayList1);

        ArrayList1.addAll(1,ArrayList3);
        System.out.println(ArrayList1);
    }

    public void searchExample(){
        // Type safe array list, stores only string
        List<String> l = new ArrayList<String>(5);
        l.add("s1");    //index 0
        l.add("s2");    //index 1
        l.add("s3");    //index 2
        l.add("s1");    //index 3
        l.add("s3");    //index 4

        int in1 = l.indexOf("s1");
        int in3 = l.indexOf("s3");

        System.out.println("index of s1 first occurrence : " + in1);
        System.out.println("index of s3 first occurrence : " + in3);

        System.out.println("index of s1 last occurrence : " + l.lastIndexOf("s1"));
        System.out.println("index of s3 last occurrence : " + l.lastIndexOf("s3"));

        System.out.println("index of  s5 first occurrence : " + l.indexOf("s5"));
        System.out.println("index of  s5 last occurrence : " + l.lastIndexOf("s5"));
    }

    public void iterationOverArrayList(){

        ArrayList<Integer> itSample = new ArrayList<>();
        itSample.add(1);
        itSample.add(3);
        itSample.add(5);
        itSample.add(7);

        ListIterator<Integer> iterator = itSample.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }













}
