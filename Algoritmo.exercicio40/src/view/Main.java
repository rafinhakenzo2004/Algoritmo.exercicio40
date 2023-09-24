package view;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("num1: ");
		int num1=leia.nextInt();
		System.out.println("num2: ");
		int num2=leia.nextInt();
		int maior, menor;
		int num;
		boolean primo;
		if(num1>num2) {
			maior=num1;
			menor=num2;
		}else {
			maior=num2;
			menor=num1;
		}
		while(maior>=menor) {
			num=maior;
			primo=primo(num);
			if(primo) System.out.println(num);
			maior--;
		}
	}

	public static boolean primo(int num) {
		if(num==1){
			return false;
		}
		for(int i=num-1;i>=2;i--) {
			if(num%i==0) {
				return false;
			}
		}
		return true;	
	}
}
