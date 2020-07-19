package removeDup;

import java.util.Arrays;

public class RemoveDfromArray {
public static int [] remD(int [] arr) {
	
	 int []arr2=new int[arr.length-1];
	for(int i = 0; i < arr.length; i++){
		   if (arr[i] == arr[i+1]){
           // shift elements to the left
           for(int j = i; j < arr.length-1; j++){
               arr[j] = arr[j+1];
           }
           System.arraycopy(arr, 0, arr2, 0, arr.length - 1);
         break;
       }
	}

	return arr2;
	
}
	public static void main(String[] args) {
	int [] arr= {1,2,3,44,44,6};
	    remD(arr);
	    System.out.println(Arrays.toString(remD(arr)));

	}

}
