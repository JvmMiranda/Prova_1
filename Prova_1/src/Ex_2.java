import java.util.*;
public class Ex_2 {

	public static void main(String[] args) {
//		Escreva um programa em Java que declare uma vari�vel para representar uma planta��o de caf� 
//		com x linhas e y colunas. O valor de x e de y dever�o ser informados pelo usu�rio da aplica��o. O 
//		programa dever�: 
//		 
//		a)  Preencher as c�lulas da vari�vel declarada com zeros (falha no plantio) ou uns (regi�o com 
//		plantio). O preenchimento deve ser feito em um m�todo. 
//		 
//		b)  Imprima os dados da vari�vel no v�deo. A impress�o deve ser no formato de uma tabela. A 
//		impress�o deve ser feita em um m�todo. 
//		 
//		c)  contar e retornar o total de regi�es que tem falha no plantio. A contagem deve ser feita por 
//		um m�todo. 
		
		
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
		System.out.println("A planta��o tem "+ dr +" falhas e "+ db +" partes boas.");
		
	}
}
