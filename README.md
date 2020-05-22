# List  Interface

------

## What is List?

 1. List is the child interface of Collection interface 

 2. It contains list type data structure in which we can store the ordered collection of objects

 3. It can have duplicate values of object

 4. There are various methods in list interface that can be used to **insert**, **delete** and **access** the element from list

[Collection Interface Overview Diagram](https://github.com/jaySiddhapura-eng/List/blob/master/Capture1.PNG)

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

 2. Size of conventional array can not be modified

    1. If user want to add more elements in the conventional array, new array need to be implemented

    2. **Create** an ArrayList object 

          ~~~java
          import java.util.ArrayList;
          
          ArrayList<String> nameOfArrayList = new ArrayList<String>();
          // it will create the arraylist of string object
          
          //Alternative if user is not sure which datatype element will have
          ArrayList<Object> nameOfArrayList = new ArrayList<Object>();
          // or
          ArrayList<Object> nameOfArrayList = new ArrayList<>();
          ~~~

          

    3. **Add Items** in to the previously created Array List

          ~~~java
          nameOfArrayList.add("String1"); //index 0 Auto indexing
          nameOfArrayList.add("String2"); //index 1
          nameOfArrayList.add("String3"); //index 2
          nameOfArrayList.add("String4"); //index 3
          System.out.println(nameOfArrayList);
          ~~~

          Output:

          ~~~java
          [string1, string2, string3, string4]
          ~~~

          

    4. **Add items** in the array list at **specific index**

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
          
          Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
          	at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:755)
          	at java.base/java.util.ArrayList.add(ArrayList.java:480)
          	at com.company.arrayList.ArrayListMethod(arrayList.java:19)
          ~~~

          

    5. ArrayList can hold **multiple datatypes**

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

          

    6. **Access an Item** from ArrayList [ArrayList name **Val** is used for demo]

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

          

    7. **Setting the element** in predefined ArrayList 

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

          

    8. **Removing the element** from the ArrayList

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

          Exception:

          ~~~java
          rem.remove(3); // index 4 is not available
          
          // results into the exception
          Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
          ~~~

          

    9. **Remove all Element** of an ArrayList

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

          

    10. Find out how **many elements** situated in given ArrayList [check the size of ArrayList name **removeAll** ]

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

          

    11. **Sorting** an ArrayList

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

           

    12. **Adding** two ArrayLists

           1. Consider two ArrayList, by following procedure appending one ArrayList to the Second ArrayList is possible

           2. Two ArrayList must have same element datatypes [or typecasting will be requires]

           3. **Observe the indices**

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

                 ~~~java
                 output1: [A, B, C, D, String1, String2]
                 output2: [A, String1, String2, B, C, D]
                 ~~~

                 

    13. **Searching** in the ArrayList

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
                     
                 index of s5 first occurrence : -1
                 index of s5 last occurrence : -1
                 ~~~

                 

    14. **Iterate** over an ArrayList

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

## LinkedList

1. ArrayList and LinkedList both implements the List interface

2. Therefore, **all the methods demonstrated in ArrayList section applies to LinkedList**

3. Both maintains the **insertion order**

4. Both are **non synchronized** classes

5. What is **Node** in LinkedList?

   1. LinkedList is a linear data structure where each element is a separate object
   2. This element object of the List called as Node
   3. Each node holds reference to the neighboring node along with the data
   4. If node holds reference of next node only then list known as **Singly Linked List**
   5. If node holds reference of both next and previous node then list known as **Doubly Linked List**<br><br>

6. Differences between LinkedList and ArrayList

   | ArrayList                                                    | LinkedList                                                   |
   | :----------------------------------------------------------- | :----------------------------------------------------------- |
   | Internally uses **Dynamic Array**                            | Internally uses **Doubly Linked list**                       |
   | **Slow at element manipulation** due to shifting of elements during operations | **Faster element manipulation**, due to absence of element shifting during operations |
   | Can only acts as a **List**                                  | Can act as a **List and Queue**                              |
   | Better for **storing and accessing** data                    | better for **data manipulation**                             |

   <br>

7. **Declaring** LinkedList

   ~~~java
   LinkedList<String> LL = new LinkedList<>();
   // user can perform all the operations which are possible with ArrayList
   // because both the class implements the List interface
   ~~~

   

8. **Add Nodes** in created LinkedList

   ~~~java
   LL.add("A");	// method from List interface
   LL.add("B");		
   LL.add("C");
   LL.add("D");
   ~~~

   Output:

   ~~~java
   [A, B, C, D]
   ~~~

   

9. Add node at **particular Index** 

   ~~~java
   LL.add(3,"e");  // method from List Interface
   ~~~

   Output:

   ~~~java
   [A, B, C, e, D]
   ~~~

10. Add **First and Last Node** in the LinkedList

    ~~~java
    LL.addFirst("F");		// methods from Deque Interface
    LL.addLast("L");
    ~~~

    Output:

    ~~~java
    [F, A, B, C, e, D, L]
    ~~~

    

11. **Get First and Last Node** in the LinkedList

    ~~~java
    Object first = LL.getFirst();	// methods from Deque Interface
    String last = LL.getLast();
    System.out.println("first node: " + first);
    System.out.println("last node: " + last);
    ~~~

    Output:

    ~~~java
    first node: F
    last node: L
    ~~~

    

12. **Remove** the Node

    ~~~java
    LL.remove("C");		// method from List interface
    LL.remove(2);
    System.out.println("Remove operation: "+LL);
    ~~~

    Output:

    ~~~java
    Original List: [F, A, B, C, e, D, L]
    Remove operation: [F, A, e, D, L]
    ~~~

    

13. **Remove first and last** node

    ~~~java
     LL.removeFirst();		// method from Deque Interface
     LL.removeLast();
     System.out.println("First and Last remove: "+LL);
    ~~~

    Output:

    ~~~java
    Original List: [F, A, B, C, e, D, L]
    First and Last remove: [A, B, C, e, D]
    ~~~

    

14. Check whether List **contains** particular node 

    ~~~java
    boolean status = LL.contains("C");		// method from List Interface
    System.out.println("list contains C: " + status );
    ~~~

    Output:

    ~~~java
    Original List: [F, A, B, C, e, D, L]
    list contains C: true
    ~~~

    

15. Check the **Size** of List

    ~~~java
    int size = LL.size();		// method from List Interface
    System.out.println("size of List: " + size);
    ~~~

    Output:

    ~~~java
    Original List: [F, A, B, C, e, D, L]
    size of List: 7
    ~~~

    

16. Check whether List is **Empty**

    ~~~java
    boolean EMP = LL.isEmpty();		// method from List Interface
    System.out.println("Is List empty: "+ EMP);
    ~~~

    Output:

    ~~~java
    Is List empty: false
    ~~~

    

17. **Overwrite** the node in List and **Obtain** the Node of corresponding index

    ~~~java
    // it can overwrite the First and last node also
    LL.set(0,"X");		// method from List Interface
    System.out.println("modified list: " +LL);
    
    System.out.println("The node at index 2: "+LL.get(2));
    ~~~

    Output:

    ~~~java
    Original List: [F, A, B, C, e, D, L]
    modified list: [X, A, B, C, e, D, L]
    The node at index 2: B
    ~~~

    

18. **Clear** the LinkedList

    ~~~java
    LL.clear();		// method from List Interface
    System.out.println(LL);
    ~~~

    Output:

    ~~~java
    Original List: [F, A, B, C, e, D, L]
    []
    ~~~

    

19. **Retention** of one list on the other list [Retention: the action of absorbing]

    ~~~java
    sample1.add("s1");
    sample1.add("s2");
    sample1.addFirst("s0");
    sample1.addLast("sn");
    
    sample2.add("s2");
    sample2.add("s3");
    sample2.addFirst("sx");
    sample2.addLast("sn");
    
    sample1.retainAll(sample2);		// method from List Interface
    System.out.println("sample1 after retaining nodes of sample2: " + sample1);
    // retain only nodes in sample 1 which are contained in sample 2
    // only s0, s1 in sample 1 are erased because this two sample are not present in sample 2
    System.out.println("sample2 is unaffected after retention: "+ sample2);
    ~~~

    Output:

    ~~~java
    Sample1: [s0, s1, s2, sn]
    Sample2: [sx, s2, s3, sn]
    sample1 after retaining elements of sample2: [s2, sn]
    sample2 is unaffected after retention: [sx, s2, s3, sn]
    ~~~

    

20. **Sub listing** certain portion of the LinkedList

    ~~~java
    LinkedList<Object> L = new LinkedList<>();
        L.add("a");        // index 0
        L.add("b");        // index 1
        L.add("c");        // index 2
        L.add("d");        // index 3
        L.add("e");        // index 4
        L.add("f");        // index 5
    
        // declaring empty list to save the sublist
        List<Object> SL = new LinkedList<>();
        SL = L.subList(1,4); 	// Exclude the element of index 4
    	// method of List Interface
    
        System.out.println("List: "+L);
        System.out.println("Newly created Sub List: "+SL);
    ~~~

    Output:

    ~~~java
    List: [a, b, c, d, e, f]
    Sub List: [b, c, d]
    ~~~

    

21. LinkedList provides **flexible addition of elements** both at front and back

    ~~~java
    LinkedList<String> list = new LinkedList<>();
          list.add("A");
          list.add("B");
          list.add("C");
    
    System.out.println("Original list: "+ list);
    list.offerFirst("X");		// method is from Deque Interface
    System.out.println("after Offering X in the beginning of LinkedList: "+ list);
    list.offerLast("O");
    System.out.println("after Offering O in the end of LinkedList: "+ list);
    ~~~

    Output:

    ~~~java
    Original LinkedList: [A, B, C]
    after Offering X in the beginning of LinkedList: [X, A, B, C]
    after Offering O in the end of LinkedList: [X, A, B, C, O]
    ~~~

    

22. **Peeking and Polling** of element from the list

    ~~~java
    // peeking = retrive element without removing it
    // polling = retrive element with removal of it
    LinkedList<String> PPD = new LinkedList<>();
       PPD.add("A");
       PPD.add("B");
       PPD.add("C");
       PPD.add("D");
    System.out.println("OG List: "+PPD);
    
    System.out.println("Peek first o/p: " + PPD.peekFirst());	//method from Deque Interface
    System.out.println("Peek last o/p: " + PPD.peekLast());
    System.out.println("list after Peek: "+PPD);
    
    System.out.println("Poll first o/p: " + PPD.pollFirst());
    System.out.println("Poll last o/p: " + PPD.pollLast());
    System.out.println("list after Poll: "+PPD);
    ~~~

    Output:

    ~~~java
    OG List: [A, B, C, D]
    Peek first o/p: A
    Peek last o/p: D
    list after Peek: [A, B, C, D]
    Poll first o/p: A
    Poll last o/p: D
    list after Poll: [B, C]
    ~~~

## Vector [Synchronization in ArrayList ]

1. Vector same as ArrayList implements the List Interface

2. Both Vector and ArrayList uses **Dynamically Resizable Array**

3. Vector is **Synchronized**, but **ArrayList is not**

4. Only one thread at a time can access the Vector

5. Where as on ArrayList multiple thread can operate at the same time

6. **Vector is thread safe**, ArrayList is **not thread safe by default**

7. Vectors are considered to be obsolete and unofficially deprecated in java

8. **Thread safety** can be achieved **with ArrayList** by following method

   1. Collections.synchronizedList() method
   2. Using CopyOnWriteArrayList.

9. Synchronized List method

   ~~~java
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
   ~~~

10. CopyOnWriteArrayList

    1. Thread-safe variant of ArrayList in which all mutative operations(add, set etc) are implemented by making fresh copy of the underlying array.

    2. we can iterate over the list in a safe way, even when concurrent modification is happening

    3. When Iterator is created a copy of list is given to that iterator

    4. Therefore whatever operations are performed on the list after creation of iterator are not affected on iterator

       Sample1:

       ~~~java
       CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
           numbers.add(1);
           numbers.add(2);
           numbers.add(3);
           numbers.add(4);
       
       //iterator created // copy of list is provided to the iterator
       Iterator<Integer> ITR = numbers.iterator();
       // This iterator has a copy of numbers list [snapshot]
       
       // following element is not present in the snapshot which ITR has
       // following update will happen on the original copy of the list
       numbers.add(5);
       
       // following iteration will happen on the snapshot which ITR has
       // therefore element 5 is excluded
       while(ITR.hasNext()){	
             System.out.println(ITR.next());
            }
       ~~~

       Output:

       ~~~java
       1
       2
       3
       4
       ~~~

       Sample2: performing iteration on the updated list

       ~~~java
       // to perform this another iterator is being declared
       // after the update
       
       CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
           numbers.add(1);
           numbers.add(2);
           numbers.add(3);
           numbers.add(4);
       
               //iterator created // list snapshot1 is given to ITR
       	   // snapshot1 has 4 elements therefore ITR have 4 elements
               Iterator<Integer> ITR = numbers.iterator();
       
               // following elements are added in the list 'numbers'
       		// not in snapshot1
       	    numbers.add(10); 	
               numbers.add(20);
               numbers.add(30);
               numbers.add(40);
       
               // iterator 2 created // list snapshot2 is given to ITR2
       	   // snapshot 2 has old as well as recently updated elements
               Iterator<Integer> ITR2 = numbers.iterator();
       
               while (ITR.hasNext()){
                   // iteration will happen on snapshot1
                   // not on the list 'numbers'
                   System.out.println("ITR values: " + ITR.next());
               }
       
               while (ITR2.hasNext()){
                   // iteration will happen in snapshot2
                   // not on the list 'numbers'
                   System.out.println("ITR2 values: " + ITR2.next());
               }
       
       ~~~
[Collection Interface Overview Diagram](https://github.com/jaySiddhapura-eng/List/blob/master/Capture1.PNG)


## Stack

1. Stack extends vector class

2. It is **LIFO** list

3. **Creating** new Stack

   ~~~java
   Stack<Integer> S = new Stack<>();
   ~~~

4. **Checking** whether stack is **empty** or not

   ~~~java
   boolean stackStatus = S.isEmpty();
   System.out.println("stack empty: " + stackStatus);
   ~~~

   Output:

   ~~~java
   stack empty: true
   ~~~

5. **Pushing** element into stack

   ~~~java
   S.push(2002);
   S.push(3003);
   S.push(4004);
   S.push(5005);
   System.out.println("stack: " + S);
   ~~~

   Output:

   ~~~java
   stack: [2002, 3003, 4004, 5005]
   ~~~

6. **Popping** the element from stack

   ~~~java
   Integer i = S.pop();	// popping removes the element from the stack
   System.out.println("popped value: " +i);
   System.out.println("stack: " + S);
   ~~~

   Output:

   ~~~java
   popped value: 5005
   stack: [2002, 3003, 4004]
   ~~~

7. **Searching** the element

   ~~~java
   // index started from 1 not 0
   int Index = S.search(3003);
   System.out.println("stack: " + S);
   System.out.println("Index of 3003 is: "+ Index);
   ~~~

   Output:

   ~~~java
   stack: [2002, 3003, 4004]
   Index of 3003 is: 2
   ~~~

8. **Peeking** the element 

   ~~~java
   Object peeked = S.peek();		// it will not remove the element like popping
   System.out.println("stack: " + S);
   System.out.println("Last object without removing it: " + peeked);
   ~~~

   Output:

   ~~~java
   stack: [2002, 3003, 4004]
   Last object without removing it: 4004
   ~~~

9. **Clearing** the stack

   ~~~java
   S.clear();
   System.out.println("stack: " + S);
   ~~~

   Output:

   ~~~java
   stack: []
   ~~~

   













