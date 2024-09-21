package Lec29;

import java.util.LinkedList;

public class LinkedList_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<Integer> ll = new LinkedList<>();
      // stack
      ll.addFirst(10);
      ll.addFirst(20);
      ll.addFirst(30);
      System.out.println(ll);
      System.out.println(ll.remove()); // remove first
      System.out.println(ll);
      
      // Queue
      LinkedList<Integer> ll1 = new LinkedList<>();
      ll1.add(10);
      ll1.add(20);
      ll1.add(30);
      ll1.add(40);
      System.out.println(ll1);
      System.out.println(ll1.remove());
      System.out.println(ll1);
      
    //  Queue<Integer> ll1 = new LinkedList<>();
      ll1.add(10);
      ll1.add(20);
      ll1.add(30);
      ll1.add(40);
      System.out.println(ll1);
      System.out.println(ll1.remove());
      System.out.println(ll1);
	}

}
