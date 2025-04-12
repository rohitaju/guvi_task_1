package Guvi_task_1;

public class Guvi_task_1_qn_3 {

	public static void main(String[] args) {
		int n = 876;
		int reverse = 0;
	
		while(n!=0) {
			int digit = n%10;
			reverse = reverse* 10+digit;
			n=n/10;
		}
	    System.out.println("the reverse is "+reverse);

	}

}
