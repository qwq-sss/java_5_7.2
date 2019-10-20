package java5HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class SortJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int number = input.nextInt();
		int [] numbers = new int[number];
		for(int i = 0 ; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		if(isSorted(numbers) == true)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");

	}
	public static boolean isSorted(int[] list) {
		int[] sorts = new int[list.length];
		int[] x = new int[list.length];
		int flag = 0;
		sorts = Arrays.copyOf(list,list.length);
		java.util.Arrays.sort(sorts);     //sort����ֻ�ܽ�������������
		for(int i = 0 ; i < list.length; i++)
			if(sorts[i] != list[i])
				flag = 1;
		if(flag == 0)
			return true;
		reverse(list);
		for(int i = 0; i < list.length ;i++)
			if(sorts[i] != list[i])
				return false;
		return true;
	}
	public static void reverse(int[] list) { //��reverse������������ֱ�Ϊ�����ڽ��бȽϣ���������Ҳ�����ź��������
		int len = list.length;
		for(int i = 0 ; i < len / 2 ;i++) {
			int temp = list[i];
			list[i] = list[len - i - 1];
			list[len - i - 1] = temp;
		}
		}
	}

