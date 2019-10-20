package java5HomeWork;

import java.util.Scanner;

public class DifferentNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter tem numbers: ");
	    int differentCount = 0;
	    int [] numbers = new int[10];
	    for(int i = 0 ; i < 10 ; i++){
	    	numbers[i] = input.nextInt();
	    }
	    int flag = 0, k = 0;
	    int [] count = new int[10];
	    for(int i = 0; i < 10 ;i++) {
	    	for(int j = 0 ; j < i; j++)
	    		if(numbers[i] == numbers[j]) {
	    			flag = 1;
	    			break;
	    		}
	    	if(flag == 0) {
	    		differentCount++;
	    		count[k] = numbers[i];
	    		k++;
	    		
	    	}
	    	flag = 0;
	    		
	    }
	    System.out.println("The number of distinct number is " + differentCount);
	    System.out.print("The distinct numbers are : ");
	    for(int i = 0; i < differentCount; i++) {
	    	System.out.print(count[i] +" ");
	    }

	   }
	}


