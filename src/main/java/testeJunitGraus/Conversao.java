package testeJunitGraus;

import java.util.Scanner;

public class Conversao {
	  Scanner sc = new Scanner(System.in);
		public double conversion() {
			
			 	double temp, tempc;
		        //entradaa
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Sistema de conversão de Fahrenheit para centígrados : ");
		        System.out.println("Informe o valor em Fahrenheit");
		        temp = sc.nextDouble();
		        
		        tempc = (temp - 32)/1.8;
		        sc.close();
		        return tempc;
		        
		}

}
