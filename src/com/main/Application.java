package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int sayi,sum=0,temp=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayi Giriniz");
		sayi = scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			
			if(i%12==0 && !(i==0)) {
				sum+=i;
				temp++;
				System.out.println(temp);
				System.out.println(sum);
			}
			
		}
		
		System.out.println("Ortalama: "+(sum/temp));

	}

}
