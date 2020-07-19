package reverseArray;

import java.util.Arrays;

public class ReverseArray {

public static int [] reverseArr(int [] arr) {
		
		for(int i = 0; i <arr.length / 2; i++)
		  {
		    int temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
		  }
		
		return arr;
		
	}

	public static void main(String[] args) {
		int [] arr= {11,22,33,44,55,66,77,88,99};
		System.out.println("original array  :  "+Arrays.toString(arr));
		System.out.println("Reversed array  :  "+Arrays.toString(reverseArr(arr)));
	}
}
