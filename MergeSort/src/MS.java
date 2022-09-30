
public class MS {

	public static void conqure(int[] arr,int si,int mid,int ei) {
		int[] merge=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<=arr[idx2]) {
				merge[x++]=arr[idx1++];
				
			}else {
				merge[x++]=arr[idx2++];
			}
		}
		while(idx1<=mid) {
			merge[x++]=arr[idx1++];
		}
		while(idx2<=ei) {
			merge[x++]=arr[idx2++];
		}
		for(int i=0,j=si;i<merge.length;i++,j++) {
			arr[j]=merge[i];
		}
	}
	public static void divid(int[] arr,int si,int ei) {
		
		if(si>=ei) {
			return;
		}
		
		int mid=si+(ei-si)/2;
		divid(arr,si,mid);
		divid(arr,mid+1,ei);
		conqure(arr,si,mid,ei);
		
	}
	public static void main(String[] args) {
		int arr[]= {5,3,6,8,1,7};
		int n=arr.length;
		divid(arr,0,n-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
