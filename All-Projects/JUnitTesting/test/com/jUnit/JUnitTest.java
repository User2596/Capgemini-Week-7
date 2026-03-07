package com.jUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JUnitTest {

	public JUnit ju = new JUnit();
	public static int[] arr;
	
	@BeforeEach
	public void start() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void end() {
		System.out.println("After Each");
	}
	
	@BeforeAll
	public void begin() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public void finish() {
		System.out.println("After All");
	}
	
	@Test
	void addTest() {
		assertEquals(5, ju.add(1,4));
	}

	@Test
	void mulTest() {
		assertEquals(6, ju.mul(2, 3));
	}
	
	@Test
	void boolTest() {
		assertTrue(5>3);
	}
	
	@Test
	void arrayTest() {
		int[] arr1 = null;
		try { for (int num : arr1) System.out.println(num);
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
		} catch (Exception e) {}
	}
	
	@Test
	void arrTest() {
		assertArrayEquals(arr, null);
		arr = new int[]{3};
		int[] arr2 = {3};
		assertArrayEquals(arr, arr2);
//		arr2 = new int[]{4};
//		assertArrayEquals(arr, arr2);
	}

}