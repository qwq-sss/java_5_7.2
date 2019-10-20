package java5HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numbers = input.nextInt();
		
		System.out.print("Enter the grades of students: ");
		double[] grades = new double [numbers];
		for(int i = 0; i < numbers ; i++)
			grades[i] = input.nextDouble();
		
		input.nextLine();
		System.out.print("Enter the name of students: ");
		String[] names = new String[numbers];
		for(int i = 0; i < numbers ; i++)
			names[i] = input.nextLine();
		
		for(int i = 0; i < numbers; i++) {
			double currentMax = grades[i];
			String currentNames = names[i];
			int currentMaxIndex = i;
			for(int j = i + 1 ;j < numbers; j++) {
				if(currentMax < grades[j]) {
					currentMax = grades[j];
					currentMaxIndex = j;
					currentNames = names[j];
				}
			}
			//Swap student name and grade
			if(currentMaxIndex != i) {
				grades[currentMaxIndex] = grades[i];
				grades[i] = currentMax;
				names[currentMaxIndex] = names[i];
				names[i] = currentNames;
			}
		}
		System.out.println(Arrays.toString(names));

	}

}
