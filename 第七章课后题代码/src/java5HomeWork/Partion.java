package java5HomeWork;

import java.util.Scanner;

public class Partion {
	
	 public static void swap(int[] nums, int i , int j) {
         int tmp = nums[i];
         nums[i] = nums[j];
         nums[j] = tmp;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int number = input.nextInt();
		int[] list = new int[number];
		for(int i = 0; i < number; i++) {
			list[i] = input.nextInt();
		}
		int p = partition(list);
		System.out.print("After the partiton, the list is " );
		for( int e : list)
			System.out.print(e + " ");

	}
	public static int partition(int[] list) {
		int i = 1,j = list.length - 1;
		int p = list[0];
		int left = 0,right = list.length - 1;
		while(true) {
			while(i <= right && list[i] < p) i++;
			while(j >= left + 1 && list[j] > p) j--;
			if(i >= j) {
				break;
			}
			swap(list,i,j);
			
			i++;
			j--;
		}
		swap(list,left,j);
		return j;
		
	}

}
