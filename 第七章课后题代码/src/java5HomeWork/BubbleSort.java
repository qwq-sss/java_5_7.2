package java5HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		int temp = 0;
		for(int i = 0 ; i < 10 ;i++)
			numbers[i] = input.nextInt();
		
		//bubble sort
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0; j < 10 - i - 1 ; j++) { //注意内循环的次数，写错会造成下标越界错误
				if(numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

}
