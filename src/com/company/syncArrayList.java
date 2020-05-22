package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class syncArrayList {

    public void methd() throws InterruptedException {
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());

        //List methods are synchronized
        namesList.add("A");
        namesList.add("B");
        namesList.add("C");
        namesList.add("D");
        namesList.add("E");

        //Use explicit synchronization while iterating
        // only one thread will execute following block at a time
        // following block of code acts as a monitor block of the code
        synchronized (namesList) {
            Iterator<String> iterator = namesList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

}



