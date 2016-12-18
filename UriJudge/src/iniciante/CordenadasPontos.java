package iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
 
public class CordenadasPontos {
 
    private static Scanner ler;
	
    public static void main(String[] args) {
    //Define o formato do float como uma casa depois da v�rgula
    Locale.setDefault(Locale.US);
    DecimalFormat df = new DecimalFormat("0.0");
     
     
    ler = new Scanner(System.in);
    float x, y;
     
    //Formata o float para o padr�o estabelecido e tranforma de volta para float
    x = Float.parseFloat(df.format(ler.nextFloat()));
    y = Float.parseFloat(df.format(ler.nextFloat()));
     
    //Verifica se o ponto est� nos quadrantes, ou no eixo x, y, ou na origem
    if((x!=0)&&(y!=0)){
        //Verifica o quadrante a que o ponto pertence 
        if(x>0){
            if(y>0){
                System.out.println("Q1");
            }else{
                System.out.println("Q4");
            }
        }else{
            if(y>0){
                System.out.println("Q2");
            }else{
                System.out.println("Q3");
            }
        }
    }else{
        //Verifica se o ponto est� no ponto de origem(0,0) ou nos eixos
        if((x==0)&&(y==0)){
            System.out.println("Origem");
        }else{
            //Verifica em qual eixo o ponto se encontra
            if(x==0){
                System.out.println("Eixo Y");
            }else{
                System.out.println("Eixo X");
            }
        }
    }
     
     
    }
}
