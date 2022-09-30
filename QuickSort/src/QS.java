
public class QS {

	public static int partition(int[] arr,int low,int high) {
		
		int pivot=arr[high];
		
		int i=low-1;
		//int temp=0;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//swap with pivot
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		
		return i;
		
	}
	public static void quickSort(int arr[],int low,int high) {
		
		if(low<high) {
			int pvtindex=partition(arr,low,high);
			quickSort(arr,low,pvtindex-1);
			quickSort(arr,pvtindex+1,high);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int arr[]= {5,7,2,4,9,8};
		int n=arr.length;
		
		quickSort(arr,0,n-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
