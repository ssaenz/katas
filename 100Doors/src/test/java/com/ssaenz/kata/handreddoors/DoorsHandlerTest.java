package com.ssaenz.kata.handreddoors;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoorsHandlerTest {

	@Test
	public void _01_firstTimeAllDoorsAreOpened() {
		DoorsHandler.passDoors(1).forEach(door -> Assert.assertTrue(door));
	}

	@Test
	public void _02_secondTimeAllEvenDoorsAreClosed() {

		List<Boolean> doors = DoorsHandler.passDoors(2);
		IntStream.range(0, doors.size())
		.peek(i -> {
			if (i % 2 == 0) 
				Assert.assertFalse(doors.get(i));
			else
				Assert.assertTrue(doors.get(i));
		});

	}

	@Test
	public void _03_thirdTime() {

		List<Boolean> doors = DoorsHandler.passDoors(3);

		Assert.assertTrue(doors.get(1));
		Assert.assertFalse(doors.get(2));
		Assert.assertFalse(doors.get(3));
		Assert.assertFalse(doors.get(4));
		Assert.assertTrue(doors.get(5));
		Assert.assertTrue(doors.get(6));
		Assert.assertTrue(doors.get(7));
		Assert.assertFalse(doors.get(8));
		Assert.assertFalse(doors.get(9));
		Assert.assertFalse(doors.get(10));
		

	}

	@Test
	public void _04_oneHundredTimes() {

		List<Boolean> doors = DoorsHandler.passDoors(100);

		Assert.assertTrue(doors.get(1));
		Assert.assertTrue(doors.get(4));
		Assert.assertTrue(doors.get(9));
		Assert.assertTrue(doors.get(16));
		Assert.assertTrue(doors.get(25));
		Assert.assertTrue(doors.get(36));
		Assert.assertTrue(doors.get(49));
		Assert.assertTrue(doors.get(64));
		Assert.assertTrue(doors.get(81));

	}
	
	@Test
	public void _05_shouldOpenInRound () {
		Assert.assertFalse(DoorsHandler.shouldOpenInRound(3, 100));
		Assert.assertFalse(DoorsHandler.shouldOpenInRound(56, 100));
		Assert.assertFalse(DoorsHandler.shouldOpenInRound(79, 100));
		Assert.assertFalse(DoorsHandler.shouldOpenInRound(99, 100));
	}

}
