# List [ArrayList]

------

## What is List?

 1. List is the child interface of Collection interface 

 2. It contains list type data structure in which we can store the ordered collection of objects

 3. It can have duplicate values of object

 4. There are various methods in list interface that can be used to **insert**, **delete** and **access** the element from list

    ```mermaid
    classDiagram
    
    Iterable <-- Collection
    
    Collection <-- List
    Collection <-- Queue
    Collection <-- Set
    
    List <-- ArrayList
    List <-- LinkedList
    List <-- Vector
    Vector <-- Stack
    
    Queue <-- Deque
    Queue < -- PriorityQueue
    Deque <-- LinkedList
    Deque <-- ArrayDeque
    
    Set <-- SortedSet
    Set <-- HashSet
    Set <-- LinkedSet
    SortedSet <-- TreeSet
    
    Iterable: Interface
    Collection: Interface
    
    List: Interface
    Queue: Interface
    Set: Interface
    
    Deque: Interface
    ArrayDeque: Class
    PriorityQueue: Class
    
    SortedSet: Interface
    TreeSet: Class
    HashSet: Class
    LinkedSet: Class
    
    ArrayList: Class
    LinkedList: Class
    Vector: Class
    Stack: Class
    ```

## Who implements the List interface?

 1. List interface is implemented by following classes

     1. ArrayList

        ~~~java
        List <data-type> Lst1 = new ArrayList(); 
        List <data-type> Lst1 = new ArrayList(3); // initial size of ArrayList is 3
        // class arrayList implements the interface List
        // List can not hold primitive datatype
        // List can hold wrapper class objects
        ~~~

     2. LinkedList

        ~~~java
        List <data-type> Lst2 = new LinkedList();
        // class LinkedList implements the interface List
        ~~~

     3. Vector

        ~~~java
        List <data-type> Lst3 = new Vector();
        // class Vector implements the interface Vector
        ~~~

     4. Stack

        ~~~java
        List <data-type> Lst4 = new Stack();
        // class Stack implements the interface List
        ~~~

## Methods which are available with List interface

 1. Since **List interface extends collection interface**, it supports all the operations/methods of collection interface

 2. Following are the **additional operations** which are available at List interface

     1. **Positional Access**

         1. List allow **ADD**, **REMOVE**, **GET**, **SET** operations

         2. This operations are based on numeric positions of the elements in the List

            ~~~java
            void add(int index, Object O);
            // Method adds Object O in to the specified index
            
            boolean addAll(int index, Collection c);
            // The elecment of Collection c get appended to the list for which this method called
            // the elements of collection is appended to the element of list
            // while appending the elements shift right the exisiting element of list in which appending is happening
            
            Object remove(int index);
            // removes the element from the given index
            
            Object get(int index);
            // returns the element of specified index
            
            Object set(int index, Object new);
            //replace element at given index with given object
            // returns the object which is being replaced
            
            // add all this operations in an example of array list
            ~~~

     2. **Searching**

         1. This methods are used to search the index of provided element

         2. Following are two methods which are used to search the index of element

            ~~~java
            int indexOf(Object element);
            //returns the index of first occurance of given element
            
            int lastIndexOf(Object element);
            // returns the index of last occurance of the given element
            // both the methods returns -1 if element is not present in the list
            ~~~

     3. **Iteration** 

         	1.	List interface provide method to perform the iteration over the elements of the list, starting from specified index

        ~~~java
        ListIterator listIterator(int index);
        /*
        * @param: index of the first element to be returned from the list iterator
        * @return: returns list iterator over the elements in the list(in proper seq.)
        * starting at the specified position
        * @exception: if index is out of range it will throw IndexOutOfBoundException
        */
        ~~~

     4. **Range-view**

         1. List interface provides a method to get the list view of of the portion of the given list

         2. User can provide range of indices

            ~~~java
            List subList(int fromIndex, int toIndex);
            /*
            * @param: fromIndex - an index value from the list view started capturing the value
            * 		  toIndex - an index value from the list till the view is being captured
            */
            ~~~

## ArrayList

 1. ArrayList class is the **Resizable Array**

        1. try
        2. try1

 2. Size of conventional array can not be modified

      1. TRY
     2. If user want to add more elements in the conventional array, new array need to be implemented

     3. Create an ArrayList object 

    ~~~java
    import java.util.ArrayList;
    
    ArrayList<String> nameOfArrayList = new ArrayList<String>();
    // it will create the arraylist of string object
    
    //Alternative if user is not sure which datatype element will have
    ArrayList<Object> nameOfArrayList = new ArrayList<Object>();
    // or
    ArrayList<Object> nameOfArrayList = new ArrayList<>();
    ~~~

    4.	**Add Items** in to the previously created Array List

    ~~~java
    nameOfArrayList.add("sample String1"); //index 0 Auto indexing
    nameOfArrayList.add("sample String2"); //index 1
    nameOfArrayList.add("sample String3"); //index 2
    nameOfArrayList.add("sample String4"); //index 3
    System.out.println(nameOfArrayList);
    ~~~

    Output:

    ~~~java
    [string1, string2, string3, string4]
    ~~~

    5.	**Add items** in the array list at **specific index**

    ~~~java
    nameOfArrayList.add(0,"s1"); // add string s1 at the index 0
    nameOfArrayList.add(1,"s2"); // add string s2 at the index 1
    nameOfArrayList.add(2,"s3"); // add string s3 at the index 2
    ~~~

    Output:

    ~~~java
    [s1, s2, s3]
    ~~~

    Exception:

    ~~~java
    // In case of bad indexing Exception occurs : IndexOutOfBoundsException
    val.add(4,"s4");	// bad indexing
    ~~~

    ~~~java
    Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
    	at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:755)
    	at java.base/java.util.ArrayList.add(ArrayList.java:480)
    	at com.company.arrayList.ArrayListMethod(arrayList.java:19)
    ~~~

    6.	ArrayList can hold **multiple datatypes**

    ~~~java
    Arrayist<Object> val = new ArrayList<>();
    val.add(0,"s1");
    val.add(1,123459);
    val.add(2,0.01);
    val.add(3,1);
    System.out.println(val);
    ~~~

    Output:

    ~~~java
    [s1, 123459, 0.01, 1]
    ~~~

    7.	**Access an Item** from ArrayList [ArrayList name **Val** is used for demo]

    ~~~java
    ArrayList<Object> val1 = new ArrayList<>();
    val1.add(0,"s1");
    val1.add(1,123459);
    val1.add(2,0.01);
    val1.add(3,1);
    
    Object retrive = val1.get(0);
    System.out.println(retrive);
    ~~~

    Output:

    ~~~java
    s1
    ~~~

    Exception:

    ~~~java
    System.out.println(val1.get(4)); 
    // accessing the 4th element results into following exception
    Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
    ~~~

    8.	**Setting the element** in predefined ArrayList 

    ~~~java
    Arrayist<Object> val = new ArrayList<>();
    val.add(0,"s1");
    val.add(1,123459);
    val.add(2,0.01);
    val.add(3,1);
    Object retrive = val1;
    System.out.println(retrive);
    
    val1.set(1,"set example");
    System.out.println(val1);
    // bad index results into an exception
    ~~~

    Output:

    ~~~java
    [s1, 123459, 0.01, 1]		// before set operation
    [s1, set example, 0.01, 1]	// after set operation
    ~~~

    Exception:

    ~~~java
    val1.set(4,"invalid"); // index out of bound
    // following exception occures
    Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
    ~~~

    9.	**Removing the element** from the ArrayList

    ~~~java
    ArrayList<Object> rem = new ArrayList<>();
    rem.add(1);
    rem.add(2);
    rem.add(3);
    System.out.println("Old array List: "+rem);
    
    rem.remove(1);
    System.out.println("after removing an element: "+ rem);
    ~~~

    Output:

    ~~~java
    Old array List: [1, 2, 3]
    after removing an element: [1, 3]
    ~~~

    Exception: IndexOutOfBoundsException

    ~~~java
    rem.remove(3); // index 4 is not available
    
    // results into the exception
    Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
    ~~~

    10.	**Remove all Element** of an ArrayList

     ~~~java
      ArrayList<Object> removeAll = new ArrayList<>();
      removeAll.add(0, "el1");
      removeAll.add(1,"el2");
      removeAll.add(2,"el3");
      System.out.println(removeAll);
     
      removeAll.clear();
      System.out.println(removeAll);
     ~~~

     Output:

     ~~~java
     [el1, el2, el3]
     []
     ~~~

    11.	Find out how **many elements** situated in given ArrayList [check the size of ArrayList name **removeAll** ]

     ~~~java
     Object o = removeAll.size();
     // or
     int o = removeAll.size();
     System.out.println("number of elements: "+o);
     ~~~

     Output:

     ~~~java
     number of elements: 3
     ~~~

    12.	**Sorting** an ArrayList

     	1.	To sort the ArrayList the sort method of Collections class is being used

     ~~~java
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
     ~~~

     Output:

     ~~~java
     unsorted ArrayList: [D, B, A, C, E]
     sorted ArrayList[Acs]: [A, B, C, D, E]
     sorted ArrayList[Desc][E, D, C, B, A]
     ~~~

    13.	**Adding** two ArrayLists

     	1.	Consider two ArrayList, by following procedure appending one ArrayList to the Second ArrayList is possible

     	2.	Two ArrayList must have same element datatypes [or typecasting will be requires]

     	3.	**Observe the indices**

         ~~~java
         ArrayList<String> ArrayList1 = new ArrayList<String>();
            ArrayList1.add("A");
            ArrayList1.add("B");
            ArrayList1.add("C");
         ArrayList<String> ArrayList3 = new ArrayList<String>();
            ArrayList3.add("String1");
            ArrayList3.add("String2");
         
         ArrayList1.addAll(ArrayList3);
         System.out.println("output1: " + ArrayList1);
         
         // put ArrayList3 from index 1 of ArrayList1
         ArrayList1.addAll(1,ArrayList3);
         System.out.println("output2: " + ArrayList1);
         ~~~

         Output:

         ~~~
         output1: [A, B, C, D, String1, String2]
         output2: [A, String1, String2, B, C, D]
         ~~~

    14.	**Searching** in the ArrayList

     1. This procedure search the element in the ArrayList and returns corresponding  index value

     2. It **returns -1** if asked value does not found

        ~~~java
        // Type safe array list, stores only string
        List<String> l = new ArrayList<String>(5); //list is interface, arraylist is class :)
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
        ~~~

        Output:

        ~~~java
        index of s1 first occurrence : 0
        index of s3 first occurrence : 2
            
        index of s1 last occurrence : 3
        index of s3 last occurrence : 4
            
        index of  s5 first occurrence : -1
        index of  s5 last occurrence : -1
        ~~~

    15.	**Iterate** over an ArrayList

     1. Iterator is an interface, which allow user to traverse, access and remove the element in an ArrayList

     2. The iterator can start at the specified position in the list [user input the index value]

     3. If provided index is out of range then, this method throws Exception

     4. Iterator has following methods

        ~~~java
        boolean hasNext();
        // true: iterator has more element to iterate
        // false: no more element to iterate
        
        boolean hasPrevious();
        // true: iterator has previous element
        // false: no more previous element
        
        Object next();
        //returns next element of the given Array list
        // throws Exception[NoSuchElementException] if there is no next element
        
        Object previous();
        // return previous element of the given Array list
        // throws Exception same as Object next() method
        
        void remove();
        // remove current element in the list
        // throws exception[illegalStateException] if it is called before next
        ~~~

        Sample:

        ~~~java
        ArrayList<Integer> itSample = new ArrayList<>();
        	itSample.add(1);
        	itSample.add(3);
          	itSample.add(5);
        	itSample.add(7);
        
            ListIterator<Integer> iterator = itSample.listIterator();
        
            while(iterator.hasNext()){
                	System.out.println(iterator.next());
            }
        ~~~





















