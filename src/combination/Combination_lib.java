package combination;

public class Combination_lib {
	
	public int getFactorial(int n) { //n�̊K��
		int f = 1;
		//�K��v�Z
	for(int i = 1;i <= n;i++) {
		f = f * i;
	}
	
		return f ;
	}

}
