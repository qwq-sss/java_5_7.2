package java5HomeWork;

import java.util.Scanner;

public class numberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int count[] = new int[101];
		for(int i = 0; i <= 100; i++ ){
			count[i] = 0 ;
		}
		System.out.print("Enter the integerss between 1 and 100:");
		while (true){
			
			int number = input.nextInt();
			if(number == 0)
				break;
			else
				count[number]++;
			
		}
		for(int i = 0;i <= 100; i++){
			if(count[i] != 0)
				System.out.println(i + " occurs " + count[i] + " times");
		}

	}

}
