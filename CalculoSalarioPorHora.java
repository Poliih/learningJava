

import java.util.Scanner;

class Ex4 {

	public static void main(String[] args) {
		Scanner sl = new Scanner(System.in);
		
		int codF;
		double hrs,valorH, resultado;
		
		System.out.println("Qual o numero do funcionario? ");
		codF = sl.nextInt();
		System.out.println("Qual o valor por hora do funcionario? ");
		hrs = sl.nextDouble();
		System.out.println("Quantas horas foram trabalhadas? ");
		valorH = sl.nextDouble();
		
		resultado = valorH * hrs;
		
		System.out.printf("Numero do funcionario %d\nSalario = U$ %.2f%n", codF,resultado);
	
		sl.close();
		
	}

}
