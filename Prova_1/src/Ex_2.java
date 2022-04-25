import java.util.*;
public class Ex_2 {

	public static void main(String[] args) {
//		Escreva um programa em Java que declare uma variável para representar uma plantação de café 
//		com x linhas e y colunas. O valor de x e de y deverão ser informados pelo usuário da aplicação. O 
//		programa deverá: 
//		 
//		a)  Preencher as células da variável declarada com zeros (falha no plantio) ou uns (região com 
//		plantio). O preenchimento deve ser feito em um método. 
//		 
//		b)  Imprima os dados da variável no vídeo. A impressão deve ser no formato de uma tabela. A 
//		impressão deve ser feita em um método. 
//		 
//		c)  contar e retornar o total de regiões que tem falha no plantio. A contagem deve ser feita por 
//		um método. 
		
		
		Scanner tec = new Scanner(System.in);
		int l, c;
		
		
		System.out.print("Inform o numero de linhas: ");
		l = tec.nextInt();
		System.out.print("Inform o numero de colunas: ");
		c = tec.nextInt();
		
		int[][] p = new int[l][c];
		
		preencher(l,c,p);
		imprimir(l,c,p);
		verificar(l,c,p);
	} 
	public static void preencher(int l, int c, int[][] p) {
			Random gen = new Random();
			for(int i = 0; i < l; i++) {
				for(int j = 0; j < c; j++) {
					p[i][j] = gen.nextInt(2);
				}
			}
	}
	public static void imprimir(int l, int c, int[][] p) {
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void verificar(int l, int c, int[][] p) {
		int db = 0, dr = 0;
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				if(p[i][j] == 0) {
					dr++;
				}else {
					db++;
				}
			}
		}
		System.out.println();
		System.out.println("A plantação tem "+ dr +" falhas e "+ db +" partes boas.");
		
	}
}
