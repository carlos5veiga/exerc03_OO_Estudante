package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		double media = student.media();
		
		System.out.printf("FINAL GRADE = %.2f%n", media);
		if (media>=60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
			System.out.printf("MISSING %.2f POINTS", 60-media);
		}
		
		sc.close();
	}

}
