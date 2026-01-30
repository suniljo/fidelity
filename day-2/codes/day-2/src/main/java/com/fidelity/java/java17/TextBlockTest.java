package com.fidelity.java.java17;

public class TextBlockTest {

	public static void main(String[] args) {
		String str = "This is multi-line text"
				+"\nwhich is used "
				+"\nbefore Java 17";
		System.out.println(str);
		System.out.println();
		
		str = """
				This is multi-line text
				
				which is used
				
							from Java-17
			  """;
		System.out.println(str);
	}

}
