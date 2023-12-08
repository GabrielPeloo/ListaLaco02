package listalaco02;

import java.util.Scanner;

public class ListaLacoR01FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// valor de repetição for == para
		// para(ValorInicio; condicao de parada; contador)
		int num, mul, multi, multi2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		multi = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		multi2 = leia.nextInt();
		
		if (multi > multi2) {
			System.out.println(" Intervalo inválido! ");
		} else {
		for (mul=multi; mul <= multi2; mul++) {
			
				if (multi % 3 == 0 && multi % 5 == 0)
					
					System.out.println(multi + " é múltiplo de 3 e 5");
					multi ++;
			}
		}
	}

}
