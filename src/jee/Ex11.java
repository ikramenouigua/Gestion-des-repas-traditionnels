package jee;
import java.util.Scanner;
public class Ex11 {
	 
public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in); 
	int x=5;
	int fact=1;
	int x1 = myObj.nextInt(); 
	for(int i=x1;i>0;i--) {
		fact*=i;
	}
	System.out.println(fact);
}
}
