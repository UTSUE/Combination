package combination;

public class Combination_lib {
	
	public int getFactorial(int n) { //n‚ÌŠKæ
		int f = 1;
		//ŠKæŒvZ
	for(int i = 1;i <= n;i++) {
		f = f * i;
	}
	
		return f ;
	}

}
