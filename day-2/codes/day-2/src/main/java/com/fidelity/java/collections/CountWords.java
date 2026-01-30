package com.fidelity.java.collections;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountWords {

	public static void main(String[] args) {
		String article = "hello Hello HEllo hi hi hi! Welcome  welcome";
		
		
		article = article.toLowerCase();
		
		String[] words = article.split("[, ;:.?!]+");
		System.out.println("no of words = " + words.length);
		System.out.println(Arrays.toString(words));
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		System.out.println(map);
	}

}
