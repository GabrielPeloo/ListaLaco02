package listalaco02;

import java.util.Scanner;

public class ListaLacoR03FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, maior = 0, menor = 0;
		Scanner leia = new Scanner(System.in);
		
		while (num >= 0) {
			System.out.println(" Digite um número: ");
			num = leia.nextInt();
			if (num > 50) {
				maior++;
			} else { if (num < 21 && num >= 0) {
				menor ++;	
			}
			}
			if (num < 0) {System.out.println("Total de pessoas menores de 21 anos: "+ maior);
			System.out.println("Total de pessoas maiores de 50 anos: "+ menor);
			}
		}
	}

}
