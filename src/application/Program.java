package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Bob", "maria@gmail.com");
		Client c4 = new Client("Maria", "maria2@gmail.com");
		Client c5 = new Client("Maria", "maria@gmail.com");
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		System.out.println("C1 = " + c1.getName() + " = " + c1.hashCode());
		System.out.println("C2 = " + c2.getName() + " = " + c2.hashCode());
		System.out.println("C3 = " + c3.getName() + " = " + c3.hashCode());
		System.out.println("C4 = " + c4.getName() + " = " + c4.hashCode());
		System.out.println("C5 = " + c5.getName() + " = " + c5.hashCode());
		System.out.println();
		System.out.println("C1: " + c1.getName() + " equals C2: " + c2.getName() + " = " + c1.equals(c2));
		System.out.println("C1: " + c1.getName() + " equals C3: " + c3.getName() + " = " + c1.equals(c3));
		System.out.println("C1: " + c1.getName() + " equals C4: " + c4.getName() + " = " + c1.equals(c4));
		System.out.println("C1: " + c1.getName() + " equals C5: " + c5.getName() + " = " + c1.equals(c5));
		System.out.print("C1 == C5 = ");
		System.out.println(c1 == c5); //-> compara referencias de memoria => result = false
		System.out.print("S1 == S2 = ");
		System.out.println(s1 == s2);
	}

}
