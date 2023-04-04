package com.gl.javafsd.dsa.denominations;

public class Sort {

	private int[] array;
	
	public Sort(int[] array) {
		
		this.array = array;
	}
	
	public void sort() {
				
		sortDesc();
	}
	
	private void sortDesc() {
		
		int length = array.length;
		for (int iIndex = 0; iIndex < (length - 1); iIndex++) {
		
			for (int jIndex = 0; jIndex < (length - iIndex - 1); jIndex++) {
			
				if (array[jIndex] < array[jIndex + 1]) {
				
					int temp = array[jIndex];
					array[jIndex] = array[jIndex + 1];
					array[jIndex + 1] = temp;
				}
			}
		}		
	}	
}
