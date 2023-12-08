package listalaco02;

import java.util.Scanner;

public class ListaLacoR02FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// valor de repetição for == para
		// para(ValorInicio; condicao de parada; contador)
		int num, i, impar = 0, par = 0;
		Scanner leia = new Scanner(System.in);
		
		for (i = 0; i < 10; i++) {
			System.out.println(" Digite um número: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar ++;
			}
			if (i == 9) {System.out.println("Total de número pares: "+ par);
			System.out.println("Total de número pares: "+ impar);
			}
		}
		
	}

}
