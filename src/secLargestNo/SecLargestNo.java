package secLargestNo;

public class SecLargestNo {

	public static int secLargest(int [] arr) {
		int temp;  
		for (int i = 0; i <arr.length; i++)   
		        {  
		            for (int j = i + 1; j <arr.length; j++)   
		            {  
		                if (arr[i] > arr[j])   
		                {  
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		       return arr[arr.length-2];  
		
	}

	
		public static void main(String[] args) {
			int [] arr= {11,22,33,44,55,1,54,99};
	      System.out.println("2nd largest number : "+secLargest(arr));
	  
		}
}
