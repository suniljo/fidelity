package com.fidelity.streams;

import java.util.stream.IntStream;

public class EffectivelyFinal {

	public static void main(String[] args) {
        int temp = 1; // Effectively final because it is assigned only once

        IntStream.rangeClosed(1, 5).forEach(i -> {
            System.out.println("Value of temp is = " + temp + " - " + i); // Legal: temp is effectively final
        });

        // The following line would cause a compilation error, as it reassigns temp
        // temp = 2; 
	}

}
