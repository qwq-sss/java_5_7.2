package java5HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = input.nextLine();
		s = s.toLowerCase();
		System.out.println("After sort, the string is " + sort(s));

	}
	public static String sort(String s) {
		 char[] chs1 = s.toCharArray();
		 char temp = ' ';
//		 for(int i = 0 ; i < s.length() ; i++) {
//				for(int j = 0; j < s.length() - i - 1 ; j++) { //注意内循环的次数，写错会造成下标越界错误
//					if(chs1[j] > chs1[j + 1]) {
//						temp = chs1[j];
//						chs1[j] = chs1[j + 1];
//						chs1[j + 1] = temp;
//					}
//				}
//			}
		 java.util.Arrays.sort(chs1);  //数组的排序方法 也可以用在字符串数组的排序当中
		 return String.valueOf(chs1);
		}
	}

