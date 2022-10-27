import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int positivos = 0; 
		
		System.out.println("Digite o número de linhas: ");
		int m = sc.nextInt();		
		System.out.println("Digite o número de colunas: ");
		int n = sc.nextInt();
		
		int [][] mt = new int [m][n];
		
		for(int linha = 0; linha <mt.length; linha++) {
			for(int coluna = 0; coluna < mt[linha].length; coluna++) {
				System.out.println("Outro: ");				
				mt [linha][coluna] = sc.nextInt();				
			}
		}
		for(int linha = 0; linha < mt.length; linha++) {
			for (int coluna = 0; coluna < mt[linha].length; coluna++) {
				System.out.printf(mt[linha][coluna] + " ");
				if (mt [linha] [coluna] > 0 ) {
					positivos ++;
				}
		}
			System.out.println();
		}		
		System.out.println("Positivos : " + positivos);
		System.out.println("Digite uma posição: ");
		int entrada = sc.nextInt();
		
		for(int linha = 0; linha < mt.length; linha++) {
			for (int coluna = 0; coluna < mt[linha].length; coluna++) {
				if (mt[linha] [coluna] == entrada) {
					if(linha > 0) {
						//esquerdo
						System.out.println(mt [linha - 1][coluna]);						
					}
						if (linha < mt.length);{
							//direito
							System.out.println(mt[linha + 1][coluna]);
						}
							if (coluna > 0) {
								//em cima
								System.out.println(mt[linha][coluna - 1]);
							}
								if (coluna < mt.length) {
									// em baixo
									System.out.println(mt[linha][coluna + 1]);
								}
								
					
							
				
				
				
				
				
				
				
				}
				}
				
				
				
				
				
				
				
				
				
		}
		
		
		
		
	
		sc.close();
	}

}
