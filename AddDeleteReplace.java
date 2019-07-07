package AddDeleteReplace;

public class AddDeleteReplace {
	static boolean flag = false;
	static int index = -1;
	static int operation = 1;
	static int ArrayIndex = 1;
	static int[] newArray1;
	static int[] newArray2;
	
	public static int[] hashAdd(int[] theArray1, int[] theArray2, int ArrayInd, int op, int val, int val2) {
		if (op == 1){                         // insert
			if (ArrayInd == 1) {
				if (!inArray(theArray1, val)) {
					int[] sort_Array1 = sort(theArray1);
					newArray1 = insert(sort_Array1, val);
					flag = true;
				}else{
					newArray1 = theArray1;
					flag = false;
				}
				return newArray1;
			} else { 
				ArrayIndex = ArrayInd;
				if (!inArray(theArray2, val)) {
					int[] sort_Array2 = sort(theArray2);
					newArray2 = insert(sort_Array2, val);
					flag = true;
				}else{
					newArray2 = theArray2;
					flag = false;
				}
				return newArray2;
			}
		} else if (op == 2){                            // remove
			operation = op;
			if (ArrayInd == 1){
				if (inArray(theArray1, val)) {
					int numVal = find(theArray1, val);
					if (numVal > theArray1.length){
						flag = false;
						newArray1 = theArray1;
					}
					newArray1 = remove(theArray1, val, numVal);
					flag = true;
				}else{
					newArray1 = theArray1;
					flag = false;
				}
				return newArray1;
			} else {
				ArrayIndex = ArrayInd;
				if (inArray(theArray2, val)) {
					int numVal = find(theArray2, val);
					if (numVal > theArray2.length){
						flag = false;
						newArray2 = theArray2;
					}
					newArray2 = remove(theArray2, val, numVal);
					flag = true;
				}else{
					newArray2 = theArray2;
					flag = false;
				}
				return newArray2;
			}
		} else {                                      // replace
			operation = op;
			if (ArrayInd == 1){
				if (inArray(theArray1, val)){
					int numVal = find(theArray1, val);
					if (numVal > theArray1.length){
						flag = false;
						newArray1 = theArray1;
					}
					newArray1 = replace(theArray1, val, val2, numVal);
					flag = true;
				} else {
					newArray1 = theArray1;flag = false;
				}
				return newArray1;
			} else {
				ArrayIndex = ArrayInd;
				if (inArray(theArray2, val)){
					int numVal = find(theArray2, val);
					if (numVal > theArray2.length){
						flag = false;
						newArray2 = theArray2;
					}
					newArray2 = replace(theArray2, val, val2, numVal);
					flag = true;
				} else {
					newArray2 = theArray2;flag = false;
				}
				return newArray2;
			}
		}
	}

	public static boolean inArray(int[] theArray, int val) {
		int ArrLen = theArray.length;
		if (ArrLen > 0) {
			for (int i = 0; i < ArrLen; i++) {
				if (theArray[i] == val) {
					return true;
				}
			}
		}
		return false;
	}

	public static int[] sort(int[] theArray){
		int[] array = theArray.clone();
		if (array.length == 0){
			return null;
		}
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length - 1 - i; j++){
				if (array[j + 1] < array[j]){
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] insert(int[] theArray, int val){
		index = -1;
		int[] theArray2 = theArray.clone(); 
		int[] newArray = new int[theArray2.length + 1];
		if (theArray2.length == 0){
			newArray[0] = val;
			return newArray;
		} else {
			for (int i = 0; i < theArray2.length; i++){
				if (theArray2[i] < val){
					newArray[i] = theArray2[i];
					index = i;
				}
			}
			if(index == -1){
				index = 0;
			} else {
				index++;
			}
			newArray[index] = val;
			for (int j = index + 1; j < newArray.length; j++){
				newArray[j] = theArray2[j-1];
			}
		}
		return newArray;
	}
	
	public static int find(int[] theArray, int val){
		int num = 0;
		if (theArray!=null && theArray.length > 0){
			for (int i = 0; i < theArray.length; i++){
				if (theArray[i] == val){
					num++;
				}
			}
		}
		return num;
		
	}

	public static int[] remove(int[] theArray, int val, int num){
		int [] theArray2 = theArray.clone(); 
		int[] newArray = new int[theArray2.length - num];
		if (num<=0 || num != find(theArray2, val)){
			return theArray2;
		}else {
			int j = 0;
			for (int i = 0; i < theArray2.length; i++){
				if (theArray2[i] != val){
					newArray[j] = theArray2[i];
					j++;
				}
			}
			return newArray;
		}
		
	}
	
	public static int[] replace(int[] theArray, int val, int val2, int num) {
		int[] array = theArray.clone();
		int r = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == val) {
				array[i] = val2;
				r++;
			}
		}
		if (r == num){
			return array;
		} else {
			return null;
		}
	}
}
