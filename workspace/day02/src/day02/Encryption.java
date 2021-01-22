package day02;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		String pw = null;
		System.out.println("PW:");
		pw = new Scanner(System.in). next();
		
		System.out.print("¾ÏÈ£È­: ");
		for(int i=0; i< pw.length(); i++)
			{
			System.out.printf("%c", pw.charAt(i)*3);
			}
	}

}
