
public class CountPair {
  public static void main(String[] args) {
	int[] a= {1,2,3,4,6};
	int data=7;
	int i=0;
	int j=a.length-1;
	int c=0,k=0;
	while(i<=j) {
		int sum=a[i]+a[j];
		
	    if(sum>data) {
	    	j--;
	    }
	    if(sum==data) {
	    	System.out.println(a[i]+""+a[j]);
	    	System.out.println();
	    	c++;
	    	i++;
	    	
	    
	    }
		
	   /* while(k>i && k<j)
	    {
	    if(sum+a[k]==data)
	    {
	    	System.out.println(a[i]+""+a[j]+""+a[k]);
	    	k++;
	    }
	    break;	
	    
	    }*/

	    }
	System.out.println(c);
	
  }
}
