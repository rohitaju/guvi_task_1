package Guvi_task_1;
import java.util.Scanner;
public class Guvi_task_1_qn_5 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        
		System.out.println("Enter the amount");
		int purchase =  obj.nextInt();
		if(purchase<500) {
			System.out.println("no discount is applied");
		}else if(purchase>1000) {
			System.out.println("20 %discount is applied");
		}else {
			System.out.println("10%  discount is applied");
		}
	
	
	
	
	
	
	
	
	}
	
	

}
