package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class NotasMoeda {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		    
		    
		input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double valor = input.nextDouble();

         
        int troco = (int)valor;
        double moedas = valor - troco;

        int cem = troco / 100;
        troco = troco - (cem *100);

        int cinquenta = troco / 50;
        troco = troco - (cinquenta * 50);

        int vinte = troco / 20;
        troco = troco - (vinte * 20);

        int dez = troco /10;
        troco = troco -(dez * 10);

        int cinco = troco / 5;
        troco = troco - (cinco * 5);

        int dois = troco / 2;
        troco = troco - (dois * 2);
         
        //moedas
         
         
        int cinq = (int)(moedas / 0.50);
        moedas = moedas - (cinq * 0.50);
         
        int vinte5 = (int)(moedas / 0.25);
        moedas = moedas - (vinte5 * 0.25);
         
        int dez1 = (int)(moedas / 0.10);
        moedas = moedas - (dez1 * 0.10);
         
        int cinco5 = (int)(moedas / 0.05);
        moedas = moedas - (cinco5 * 0.05);
         
        int um1 = (int)(moedas / 0.01);
        moedas = moedas - (um1 * 0.01);
         
          
        System.out.println("NOTAS:");
        System.out.println(cem+" nota(s) de R$ 100.00");
        System.out.println(cinquenta+" nota(s) de R$ 50.00");
        System.out.println(vinte+" nota(s) de R$ 20.00");
        System.out.println(dez+" nota(s) de R$ 10.00");
        System.out.println(cinco+" nota(s) de R$ 5.00");
        System.out.println(dois+" nota(s) de R$ 2.00");
         
        System.out.println("MOEDAS:");
        System.out.println(troco+" moeda(s) de R$ 1.00");
        System.out.println(cinq+" moeda(s) de R$ 0.50");
        System.out.println(vinte5+" moeda(s) de R$ 0.25");
        System.out.println(dez1+" moeda(s) de R$ 0.10");
        System.out.println(cinco5+" moeda(s) de R$ 0.05");
        System.out.println(um1+" moeda(s) de R$ 0.01");
		
		/*
			input = new Scanner(System.in);
		    input.useLocale(Locale.US);
		    System.out.println("valor");
		    double valor = input.nextDouble();
		    int troco = (int) valor;
		    
		    double moedas = valor - troco;
		    double tM = moedas;

		    int cem = troco / 100;
		    troco = troco - (cem *100);

		    int cinquenta = troco / 50;
		    troco = troco - (cinquenta * 50);

		    int vinte = troco / 20;
		    troco = troco - (vinte * 20);

		    int dez = troco /10;
		    troco = troco -(dez * 10);

		    int cinco = troco / 5;
		    troco = troco - (cinco * 5);

		    int dois = troco / 2;
		    troco = troco - (dois * 2);
		    
		    double m1 = moedas/1.00;
		    moedas = moedas - (m1*1);
		    
		    double m50 = moedas/0.50;
		    moedas = moedas - (m50 * 0.50);
		    
		    double m25 = moedas/0.25;
		    moedas = moedas -(m25* 0.25);
		    
		    double m10 = moedas/0.10;
		    moedas = moedas - (m10 * 0.10);
		    
		    double m5 = moedas/0.05;
		    moedas = moedas - (m5* 0.05);
		    
		    double m01 = moedas/0.01;
		    moedas = moedas - (m01* 0.01);

		    System.out.println("NOTAS: "+valor);
		    System.out.println(cem+" nota(s) de R$ 100.00");
		    System.out.println(cinquenta+" nota(s) de R$ 50.00");
		    System.out.println(vinte+" nota(s) de R$ 20.00");
		    System.out.println(dez+" nota(s) de R$ 10.00");
		    System.out.println(cinco+" nota(s) de R$ 5.00");
		    System.out.println(dois+" nota(s) de R$ 2.00");
		    
		    
		    System.out.println("MOEDAS: "+tM);
		    System.out.println(m1+" moeda(s) de R$ 1.00");
		    System.out.println(m50+" nota(s) de R$ 0.50");
		    System.out.println(m25+" nota(s) de R$ 0.25");
		    System.out.println(m10+" nota(s) de R$ 0.10");
		    System.out.println(m5+" nota(s) de R$ 0.05");
		    System.out.println(m01+" nota(s) de R$ 0.01");
		    */
		    
		}

	}

