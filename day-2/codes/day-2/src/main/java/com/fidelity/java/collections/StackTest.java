package com.fidelity.java.collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.println(st + " |size = " + st.size());
		System.out.println("is stack empty = " + st.isEmpty());
		//System.out.println(st.pop()); //java.util.EmptyStackException
		
		st.push(10);
		System.out.println("10 is in location " + st.search(10));
		
		st.push(Integer.valueOf(25));
		System.out.println("10 is in location " + st.search(10));
		
		st.push(32);		
		System.out.println("10 is in location " + st.search(10));
		
		System.out.println(st + " |size = " + st.size());
		
		System.out.println("peek() --- " + st.peek()); //32
		System.out.println("pop() --- " + st.pop());
		System.out.println(st + " |size = " + st.size());
		
		System.out.println(st.empty());
		System.out.println(st + " |size = " + st.size());
		
		st.clear();
		System.out.println(st + " |size = " + st.size());
	}
}
