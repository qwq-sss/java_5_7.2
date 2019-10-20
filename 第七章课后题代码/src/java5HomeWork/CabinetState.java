package java5HomeWork;

import java.util.Scanner;

public class CabinetState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean l[] = new boolean[100];
		for(int i = 0 ; i < 100 ; i++) {
			l[i] = true;
		}
		for(int i = 1; i < 100 ; i++) {
			if(i % 2 != 0)
				l[i] = false;
		}
		for(int i = 2; i < 100; i++) {
			for(int j = i; j < 100; j++) {
				if(j % (i + 1) == i)
					if(l[i] == true)
						l[i] =false;
					else
						l[i] = true;
			}
		}
		for(int i = 0; i < 100; i++) {
			if(l[i] == true)
				System.out.print("L" + (i) + " ");
		}

	}

}
