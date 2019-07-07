package TriSquare;

public class TriSquare {
	private static float area=-1;
	
	public static float squArea(int a,int b,int c){
    	if(a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0){
    		if(a==b&&b==c){
        		area=(float) ((Math.sqrt(3)/4)*(Math.pow(a, 2)));
        	}else if(a==b&&a!=c){
        		float p= (float)c;
        		area=(float)((p/2)*(Math.sqrt(Math.pow(a, 2)-Math.pow(p/2, 2))));
        	}else if(a==c&&a!=b){
        		float p= (float)b;
        		area=(float)((p/2)*(Math.sqrt(Math.pow(a, 2)-Math.pow(p/2, 2))));
        	}else if(b==c&&b!=a){
        		float p= (float)a;
        		area=(float)((p/2)*(Math.sqrt(Math.pow(b, 2)-Math.pow(p/2, 2))));
        	}else{
        	    float p=(float)(a+b+c)/2;
        	    area=(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        	} 
    		return area;
    	}else{
    		return 0;
    	}    	   
    }
}
