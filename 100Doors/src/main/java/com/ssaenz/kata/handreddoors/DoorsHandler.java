package com.ssaenz.kata.handreddoors;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DoorsHandler {
	
	public static List<Boolean> passDoors (int round) {
		List<Boolean> doors = Collections.nCopies(100, Boolean.FALSE);
		return IntStream.range(0, doors.size())
		.mapToObj(doorNum -> shouldOpenInRound(doorNum, round))
		.collect(Collectors.toList());
	}
	
	public static boolean shouldOpenInRound(int number, int round) {
		boolean shouldOpen = false;
		for (int i = 1; i <= round; i++) {
			if (number % i == 0) shouldOpen = !shouldOpen;
		}
		return shouldOpen;
	}
	
}
