
public class Esercizio {
	public static void main(String[] args){
		
		int[] testInt = {1,2,3,4,5,-5,9,7,9,8};
				
		
		System.out.println("sumPos(): " + sumPos(testInt));
		System.out.println("sumOdd(): " + sumOdd(5));
		System.out.println("sumRange(): " + sumRange(3,5));
		System.out.println("avarage(): " + avarage(testInt));
	}
	
	static int sumPos(int[] a){
		int i = 0;
		int res = 0;
		while(a[i] > 0){
			res += a[i];
			i++;
		}
		return res;
	}
	
	static int sumOdd(int n){
		int res=0;
		for(int i=0;i<n;i++){
			res += 2*i+1;
		}
		return res;
	}
	
	static int sumRange(int a, int b){
		if(a>b){
			int temp = a;
			a = b;
			b = temp;
		}
	    int tot = 0;
	    for(int i = a; i <= b; i++) {
	        tot += i;
	    }
	    return tot;
	}
	
	static double avarage(int[] a){
		double result = 0;
		for(int x: a){
			result += x;
		}
		return result/a.length;
	}
}
