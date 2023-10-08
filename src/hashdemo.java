import java.util.*;
import java.util.Map.Entry;

public class hashdemo {
    public static void main(String args[]) {


        GenericDemo<Integer, String> genericDemo = new GenericDemo<Integer, String>();//As defined in the genericdemo program T can be any data type here it is integer and X can be any data type here it is String
        genericDemo.add(4, "KillforDill");//custom data structure as defined in generic class
        HashMap hashMap = new HashMap();
        hashMap.put(1234, "Rahul");
        hashMap.put(2342, "Jain");
        hashMap.put(1345, "Ravi");
        hashMap.put(5425, "Karnan");
        hashMap.remove(432);
        hashMap.put(5323, "tamir");
        hashMap.put(6343, "Samira");
        hashMap.putAll(hashMap);
        hashMap.putIfAbsent(2001, "new year");
    }
}



//        hashMap.forEach((key, value) -> {
//                    System.out.println(key + "," + value);
//                }
//    }
//}


//
//
//        TreeSet<String> treeSet = new TreeSet();
//        treeSet.add("Ravi");
//        treeSet.add("Ramu");
//        treeSet.add("Vikram");
//        treeSet.add("Surya");
//        Iterator itr=treeSet.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());

//        PriorityQueue<String> priorityQueue=new PriorityQueue<>();
//        Deque<String> deque= new ArrayDeque<>();
//        priorityQueue.peek();
//
//Stack
//        Stack<String> stack = new Stack();// Remember to specify the data type of the elements to be added
//        stack.add("Aravind");
//        stack.push("Ravi");
//        stack.add("Ram");
//        stack.add("Akshay");
//        stack.add("Amar");
//        stack.add("Rohit");
//       //stack.remove(0);
//       stack.pop();

//        Iterator itr = stack.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//    }
//}

//Linked list
//        LinkedList linkedList = new LinkedList();
//        linkedList.add("Aravind");
//        linkedList.add("Ram");
//        linkedList.add("Akshay");
//        linkedList.add("Amar");
//        linkedList.add("Rohit");
//        linkedList.remove(0);
//        linkedList.remove("Amar");
//
//        Iterator itr = linkedList.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }




//ArrayList
//        ArrayList<> arrayList= new ArrayList();
//        arrayList.add("Aravind");
//        arrayList.add("Arun");
//        arrayList.add("Rahul");
//        arrayList.add("Rajesh");
//        arrayList.add("Kiran");
//        arrayList.add(23);
//        arrayList.remove(0);
//        arrayList.remove("Rahul");
//
//        Iterator itr = arrayList.iterator();//for every list iterator type is used
//
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//
//        }
//        System.out.println(arrayList.size());



//Hashmap
//        Hashtable hm = new Hashtable();
//
//        hm.put(3243,"Aravind");
//        hm.put(4562,"Arun");
//        hm.put(3463,"Rahul");
//        hm.put(3536,"Ragav");
//        hm.put(2345,"Mathew");
//
//        Enumeration e = hm.keys();//keys return single value
//        Collection c= hm.values();//values in hashtable can be objects of a class
//        // first write the hm.keys hover over the keys it will show "public java.util.Enumeration<K> keys()", so from this we understand that the return type is enumeration,
//
//        Object o[] = c.toArray();
//        while(e.hasMoreElements()) {
//            System.out.println(e.nextElement());
//        }
//
//        for(int i = 0;i<o.length;i++) {
//            System.out.println(o[i].toString());



