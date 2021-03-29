package test;

import java.util.Scanner;

public class Stg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,h;
		double S;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai canh day:");
		a = sc.nextInt();
		System.out.println("Nhap chieu cao");
		h = sc.nextInt();
		S = (a*h)/2;
		System.out.println("Dien tich tam giac la:" + S);
	}

}
