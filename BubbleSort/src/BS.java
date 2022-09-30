
public class BS {
 public static void main(String[] args) {
   int 	arr[]= {1,5,3,8,4};
   //TC=O(n^2)
   //bubble sort
   for(int i=0;i<arr.length-1;i++) {
	   for(int j=0;j<arr.length-i-1;j++) {
		   if(arr[j]>arr[j+1]) {
			   int temp=arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1]=temp;
		   }
	   }
   }
   for(int i=0;i<arr.length;i++) {
	   System.out.println(arr[i]);
   }
}
}
