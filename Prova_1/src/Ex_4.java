import java.util.*;
public class Ex_4 {

	public static void main(String[] args) {
		
//		Escreva um programa em que: 
//			a)  Preencha uma matriz quadrada de ordem 4 com valores informados pelo usuário da 
//			aplicação. O preenchimento da matriz deverá ser feito em um método. 
//			b)  Gere e imprima no vídeo uma nova matriz a partir da matriz preenchida obedecendo a 
//			seguinte regra: cada posição da nova matriz é a soma de todos os elementos da linha e da 
//			coluna em que a posição se encontra. Por exemplo: 
		
		int[][] x = new int[4][4];
		System.out.println("Informe os valores da matriz: ");
		preencher(x);
		imprimir(x);
		int[][] y = gerar(x);
		imprimir(y);
	}
	public static void preencher(int[][] x) {
		Scanner tec = new Scanner(System.in);
		int c = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print((c+1) + ".");
				x[i][j] = tec.nextInt();
				c++;
				}
		}
	}
	public static void imprimir(int[][] banana) {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(banana[i][j] + "\t");
				}
			System.out.println();
		}
		System.out.println();
	}
	public static int[][] gerar(int[][] x) {	
		int[][] y = new int[4][4];
		int aux;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				y[i][j] = 0;
				for(int z = 0; z < 4; z++) { 
					y[i][j] += x[i][z] + x[z][j];
				}
				y[i][j] -= x[i][j];
			}
		}
		return y;
	}
}