package com.company;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonWriteArrayList {
    public void CWAL () {
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //iterator created // list snapshot is taken
        Iterator<Integer> ITR = numbers.iterator();

        // following element is not present in the snapshot which ITR has
        numbers.add(5);

        while(ITR.hasNext()){
            System.out.println(ITR.next());
        }
    }

    public void CWALMulti(){
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //iterator created // list snapshot is taken
        Iterator<Integer> ITR = numbers.iterator();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // new iterator holds the updated values with old values
        Iterator<Integer> ITR2 = numbers.iterator();

        while (ITR.hasNext()){
            System.out.println("ITR values: " + ITR.next());
        }

        while (ITR2.hasNext()){
            System.out.println("ITR2 values: " + ITR2.next());
        }


    }
}
