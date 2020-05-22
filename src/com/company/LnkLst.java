package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LnkLst {

    public void sampleLinedList(){
        LinkedList<String> LL = new LinkedList<>();
        LL.add("A");
        LL.add("B");
        LL.add("C");
        LL.add("D");

        LL.add(3,"e");

        LL.addFirst("F");
        LL.addLast("L");

        System.out.println(LL);

        Object first = LL.getFirst();
        String last = LL.getLast();
        System.out.println("first node: " + first);
        System.out.println("last node: " + last);

//        LL.remove("C");
//        LL.remove(2);
//        System.out.println("Remove operation: "+LL);

//        LL.removeFirst();
//        LL.removeLast();
//        System.out.println("First and Last remove: "+LL);


        boolean status = LL.contains("C");
        System.out.println("list contains C: " + status );

        int size = LL.size();
        System.out.println("size of List: " + size);

        boolean EMP = LL.isEmpty();
        System.out.println("Is List empty: "+ EMP);

        LL.set(0,"X");
        System.out.println("modified list: " +LL);


        System.out.println("The node at index 2: "+LL.get(2));

        LL.clear();
        System.out.println(LL);

    }

    public void retentionExample(){
        LinkedList<String>  sample1 = new LinkedList<>();
        LinkedList<String>  sample2 = new LinkedList<>();

        sample1.add("s1");
        sample1.add("s2");
        sample1.addFirst("s0");
        sample1.addLast("sn");
        System.out.println("Sample1: " + sample1);

        sample2.add("s2");
        sample2.add("s3");
        sample2.addFirst("sx");
        sample2.addLast("sn");
        System.out.println("Sample2: " + sample2);

        sample1.retainAll(sample2);
        System.out.println("sample1 after retaining nodes of sample2: " + sample1);
        // retain only nodes in sample 1 which are contained in sample 2
        // only s0, s1 in sample 1 are erased because this two sample are not present in sample 2
        System.out.println("sample2 is unaffected after retention: "+ sample2);
    }

    public void subListDemo(){
        LinkedList<Object> L = new LinkedList<>();
        L.add("a");        // index 0
        L.add("b");        // index 1
        L.add("c");        // index 2
        L.add("d");        // index 3
        L.add("e");        // index 4
        L.add("f");        // index 5

        // declaring empty list to save the sublist
        List<Object> SL = new LinkedList<>();
        SL = L.subList(1,4);

        System.out.println("List: "+L);
        System.out.println("Newly created Sub List: "+SL);
    }

    public void offerDemo(){
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Original list: "+ list);
        list.offerFirst("X");
        System.out.println("after Offering X in the beginning of LinkedList: "+ list);
        list.offerLast("O");
        System.out.println("after Offering O in the end of LinkedList: "+ list);
    }

    public void peekFirstPollFirst(){
        LinkedList<String> PPD = new LinkedList<>();
        PPD.add("A");
        PPD.add("B");
        PPD.add("C");
        PPD.add("D");
        System.out.println("OG List: "+PPD);

        System.out.println("Peek first o/p: " + PPD.peekFirst());
        System.out.println("Peek last o/p: " + PPD.peekLast());
        System.out.println("list after Peek: "+PPD);

        System.out.println("Poll first o/p: " + PPD.pollFirst());
        System.out.println("Poll last o/p: " + PPD.pollLast());
        System.out.println("list after Poll: "+PPD);


    }
}

