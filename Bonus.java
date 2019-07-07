package Bonus;

public class Bonus {
	public static float Bonus(int c, int region){  //region:0---EUROPE,  !0---!EUROPE
		float bonus = -1;
		if(c<500){
			if(region==0){
				bonus = f(c);
			}else{
				bonus = g(c);
		    }
		}else if(c>=500&&c<1500){
			if(region==0){
				bonus = 30;
			}else{
				bonus = (float) (c*0.015);
			}
		}else{
			if(region==0){
				bonus = 50;
			}else{
				bonus = (float) (c*0.02);
		    }
		}
		return bonus;
	}
	
	public static int f(int cval){
		if( cval<200){
			return 0;
		}else if (cval<300){
			return 2;
		}else{
			return 5;
		}
	}
	
	public static int g(int cval){
		if( cval<210){
			return 0;
		}else if (cval<310){
			return 2;
		}else{
			return 5;
		}
	}
}
