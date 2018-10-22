package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class SortAlgoTest {

	// Task 2 Question 2 Test Sequences
	// Bubble Sort CONDITION case
	@Test(expected=java.lang.NullPointerException.class)
	public void testEmptyItem() {
		Item[] arr = null;
		SortAlgos.bubbleSort(arr);
	}
	
	// Bubble Sort NODE, EDGE, CONDITION case
	@Test
	public void unsortedTest(){
		int[] array = {1,3,2,5,4,0};
		Item[] items = new Item[6];
		int i = 0;
		int length =array.length;
		for (i = 0; i < length; i++)
			items[i] = new Item(array[i]);

		int[] sortedList = {0,1,2,3,4,5};
		Item[] sorted = new Item[6];
		for (i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);
		
		SortAlgos.bubbleSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}
	
	// Task 2 Question 3
	// All Null Sorting: CONDITION cases
	@Test(expected=java.lang.NullPointerException.class)
	public void testEmptyItemForSelectionSort() {
		Item[] emptyArr = null;
		SortAlgos.selectionSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testEmptyItemForInsertionSort() {
		Item[] emptyArr = null;
		SortAlgos.insertionSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testEmptyItemForMergeSort() {
		Item[] emptyArr = null;
		SortAlgos.mergeSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testEmptyItemQuickSort() {
		Item[] emptyArr = null;
		SortAlgos.quickSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testEmptyItemForHeapSort() {
		Item[] emptyArr = null;
		SortAlgos.heapSort(emptyArr);
	}
	
	// All NonNull Unsorted: NODE, EDGE, COVERAGE cases
	@Test
	public void testSelection(){
		int[] array = {1,3,2,5,4,0};
		Item[] items = new Item[6];
		for (int i = 0; i < array.length; i++)
			items[i] = new Item(array[i]);

		int[] sortedList = {0,1,2,3,4,5};
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);
		
		SortAlgos.selectionSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}
	
	@Test
	public void testInsertion(){
		int[] array = {1,3,2,5,4,0};
		Item[] items = new Item[6];
		for (int i = 0; i < array.length; i++)
			items[i] = new Item(array[i]);

		int[] sortedList = {0,1,2,3,4,5};
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);
		
		SortAlgos.insertionSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}
	
	@Test
	public void testMerge(){
		int[] array = {1,3,2,5,4,0};
		Item[] items = new Item[6];
		for (int i = 0; i < array.length; i++)
			items[i] = new Item(array[i]);

		int[] sortedList = {0,1,2,3,4,5};
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);
		
		SortAlgos.mergeSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}
	
	@Test
	public void testQuick(){
		int[] array = {1,3,2,5,4,0};
		Item[] items = new Item[6];
		for (int i = 0; i < array.length; i++)
			items[i] = new Item(array[i]);

		int[] sortedList = {0,1,2,3,4,5};
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);
		
		SortAlgos.quickSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}
	
	@Test
	public void testHeap(){
		int[] array = {1,3,2,5,4,0};
		Item[] items = new Item[6];
		for (int i = 0; i < array.length; i++)
			items[i] = new Item(array[i]);

		int[] sortedList = {0,1,2,3,4,5};
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);
		
		SortAlgos.heapSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}
}
