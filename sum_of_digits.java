package program;

import java.util.Scanner;

public class sum_of_digits {
public static void main(String arg[]) {
	int digit,sum=0;
	Scanner s =new Scanner(System.in);
	int number1=s.nextInt();
	while(number1>0) {
		digit=number1%10;
		sum=sum+digit;
		number1=number1/10;
	                }
	System.out.println(sum);
}
}

