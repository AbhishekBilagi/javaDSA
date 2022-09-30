
public class Binary_Search {
  public static void main(String[] args) {
	int[] a= {10,20,30,40,50,70};
	int search=70;
	
	boolean flag=false;
	
	int start=0;
	int end=a.length-1;
	
	int firstindex=0;
	int lastindex=a.length-1;
	
	
    while (firstindex <= lastindex) {
        int mid = (firstindex+lastindex) / 2;
 
        
        if (a[mid] == search)
            flag=true;
 
        
        if (a[mid] < search)
        	firstindex= mid + 1;
 
        
        else
        	lastindex = mid - 1;
    }
	
    if(flag==true) {
    	System.out.println("found");
    }
    else {
    	System.out.println("Not found");
    }
	
	recursive(a,start,end,search);
	
	
	
	
	
 }
  public static void recursive(int[] a,int start,int end,int search) {
	  
	 
	  int mid=(start+end)/2;
	  if(a[mid]==search) {
		  System.out.println(mid);
		  return;
	  }else if(a[mid] < search) {
		  start=mid+1;
		  recursive(a,start,end,search);
	  }
	  else {
		  end=mid-1;
		  recursive(a,start,end,search);
	  }
	  
  }
}
