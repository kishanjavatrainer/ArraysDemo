package com.infotech.client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ClientTest {

	public static void main(String[] args) {

		//1.Returns a fixed-size list backed by the specified array.
		List<Integer> list = Arrays.asList(23,4,67,78,89,1000,11928);
		list.forEach(System.out::println);
		System.out.println("------------------------------");
		
		int  arr[] = {1,4,5,6,7,70,89};
		System.out.println("---------------------------------------");
		//2.Sorts the specified array into ascending numerical order.
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		//3.Searches the specified array of ints for the specified value using the binary search algorithm. 
		System.out.println("---------------------------------------");
		int binarySearch = Arrays.binarySearch(arr, 6);
		System.out.println("binarySearch:"+binarySearch);
		//4.Returns a sequential IntStream with the specified array as its source.
		System.out.println("---------------------------------------");
		IntStream stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
	}

}
