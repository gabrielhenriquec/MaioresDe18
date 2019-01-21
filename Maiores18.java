import java.util.Scanner;

public class Maiores18 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, cont = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Informe a sua idade: ");

			idade = leia.nextInt();

			if (idade >= 18) { // MOSTRAR A QUANTIDADE DE PESSOAS COM MAIS DE 18 ANOS
				cont++;
			}
		}
		
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("A quantidade de pessoas maiores de 18 anos é:" + cont);
	}

}
