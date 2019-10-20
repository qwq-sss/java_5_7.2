package java5HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int number1 = input.nextInt();
		int[] list1 = new int[number1];
		for(int i = 0 ; i < number1; i++)
			list1[i] = input.nextInt();
		
		System.out.print("Enter list2: ");
		int number2 = input.nextInt();
		int[] list2 = new int[number2];
		for(int i = 0 ; i < number2; i++)
			list2[i] = input.nextInt();
		System.out.print(Arrays.toString(merge(list1,list2)));
	}
	public static int[] merge(int[] list1, int[] list2) {
		int[] list3 = new int[list1.length + list2.length];
		System.arraycopy(list1, 0, list3, 0, list1.length);
		System.arraycopy(list2, 0, list3, list1.length, list2.length);
		java.util.Arrays.sort(list3);
		return list3;
	}

}
