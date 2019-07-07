package Decision;

public class Decision {
	public static int decision(int x, int y,int z) {
		int dec=0;
		if (x>0){
			if(y>0){
				if(z>0){
					dec=1;
				}
				else{
					dec=2;
				}
			}
			else{
				if(z>0){
					dec=3;
				}
				else{
					dec=4;
				}
			}
		}
		else{
			if(y>0){
				if(z>0){
					dec=5;
				}
				else{
					dec=6;
				}
			}
			else{
				if(z>0){
					dec=7;
				}
				else if(z==0){
					dec=8;
				}
				else{
					dec=9;
				}
			}
		}		
		return dec;
	}
}
