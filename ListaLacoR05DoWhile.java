package listalaco02;

import java.util.Scanner;

public class ListaLacoR05DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, media = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println(" Digite um número: ");
			num = leia.nextInt();
				if (num > 0) {
					media = media + num;
				} 
			} while (num != 0);
		if (num == 0) {
			System.out.println("A soma dos números positivos é: "+ media);
		}	
	}

}
