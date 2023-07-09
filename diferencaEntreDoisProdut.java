import java.util.Scanner;

class Ex3 {

	public static void main(String[] args) {
		Scanner dt = new Scanner(System.in);
		
		double A,B,C,D,diferenca;
		
		System.out.println("Esse programa vai calcular a diferença do produto entre ponto (A e B) e (C e D)");
		System.out.println("Qual o valor do ponto A?");
		A = dt.nextDouble();
		System.out.println("Qual o valor do ponto B?");
		B = dt.nextDouble();
		System.out.println("Qual o valor do ponto C?");
		C = dt.nextDouble();
		System.out.println("Qual o valor do ponto D?");
		D = dt.nextDouble();
		
		diferenca = A * B - C * D;
		System.out.println("A diferencca é " + diferenca);

		dt.close();
	}

}
