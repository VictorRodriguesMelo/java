import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número de linhas: ");
		int m = sc.nextInt();		
		System.out.println("Digite o número de colunas: ");
		int n = sc.nextInt();
		
		int [][] mt = new int [m][n];
		
		for(int linha = 0; linha <mt.length; linha++) {
			for(int coluna = 0; coluna < mt[linha].length; coluna++) {
				System.out.println("...");				
				mt [linha][coluna] = sc.nextInt();				
			}
		}
		for(int linha = 0; linha < mt.length; linha++) {
			for (int coluna = 0; coluna < mt[linha].length; coluna++) {
				System.out.printf(mt[linha][coluna] + " ");
		}
			System.out.println();
		}	
		
		sc.close();
	}

}
