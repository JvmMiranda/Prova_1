
import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		
//		Escreva um programa em Java que preencha um vetor com 10 números inteiros informados via 
//		teclado. O seu programa deverá calcular e imprimir no vídeo o valor do desvio padrão do conjunto 
//		seguindo as instruções dadas acima. O programa deverá ter obrigatoriamente um método para 
//		calcular e retornar a média aritmética do conjunto e outro método para calcular e retornar o desvio 
//		padrão do conjunto. 
		
		double[] x = new double[10];
		double m;
		System.out.println("Por favor informe os valores para o calculo. ");
		preencher(x);
		m = media(x);
		desvio(x,m);
	}
	public static void preencher(double[] x) {
		Scanner tec = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1)+".");
			x[i] = tec.nextDouble();
		}
		
	}
	public static double media(double[] x) {
		double aux = x[0];
		for(int i = 1; i < 10; i++) {
			aux += x[i]; 
		}
		aux /= 10;
		System.out.println("Media "+ Math.round(aux * 100.0)/100.0);
		return aux;
	}
	public static void desvio(double[] x, double m) {
		double des, aux = x[0], auxx = 0;
		for(int i = 0; i < 10; i++) {
			x[i] = Math.round((x[i]-m) * 100.0)/100.0;
			x[i] = Math.round((x[i]*x[i]) * 100.0)/100.0;
			System.out.println(x[i]);
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			auxx += x[i]; 
		}
		auxx /= 10;
		auxx = Math.sqrt(auxx);
		System.out.println("O desvio padrão é de: "+auxx);
				
	}
}

