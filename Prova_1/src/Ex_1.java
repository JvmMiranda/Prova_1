import java.util.*;
public class Ex_1 {

	public static void main(String[] args) {
		
//		Escreva um programa em Java que leia uma data no formato dd/mm/aaaa. O seu programa 
//		gerar e imprimir no vídeo a data no formato americano aaaa-dd-mm. 
		
		String data;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe uma data no formato dd/mm/aaaa: ");
		data = tec.next();
		
		americano(data);
	}
	public static void americano(String d) {
		if(d.charAt(2) != '/' || d.charAt(5) != '/') {
			System.out.println("Data em formato invalido!!");
		}else {
			for(int i = 0; i < 5; i++) {
				switch(i) {
					case 0:
						for(int a = 6; a <= 9; a++) {
							System.out.print(d.charAt(a));
						}
					break;
					case 2:
						for(int a = 0; a <= 1; a++) {
							System.out.print(d.charAt(a));
						}
					break;
					case 4:	
						for(int a = 3; a <= 4; a++) {
							System.out.print(d.charAt(a));
						}
					break;
					default:
						System.out.print("/");
				}
			}
		}
	}
	
}
