package com.demo;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collection_3 {

	public static void main(String[] args) {
//		LinkedList list= new LinkedList();
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		for(int i=0; i<list.size(); i++)
//			System.out.println(list.get(i));
//		System.out.println(list.remove(2));
//		System.out.println(list);
		
		
//		Vector list =new Vector();
//		list.add(null);
//		list.add(null);
//		list.add(10);
//		list.add(20);
//		list.add("Sham");
//		System.out.println(list);
		
		Stack list =new Stack();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		while(!list.empty())
			System.out.println(list.pop());	
		
		
	}

}
