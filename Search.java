package Search;

public class Search {
	static boolean flag = false;
	public static int search(int[] array,int key){
		flag = false;
		int p = -1;
		if (array.length > 0) {  
	           for (int i = 0; i < array.length; i++) {  
	               if (array[i] == key) {  
	            	   flag = true;
	                   p = i;  
	               }  
	           }  
	       }  
		if(flag){
			   return p;
		}else{
			   return -1;  
		}
	}
}
