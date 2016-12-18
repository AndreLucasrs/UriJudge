package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class CorvoContador{
    public static void main (String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int corvocount = 0;
        while(count < 3){
            String e = input.readLine();
            
            if(e.equals("--*")){
                corvocount +=1;
            }
            else if(e.equals("-*-")){
                corvocount +=2;
            }
            else if(e.equals("-**")){
                corvocount +=3;
            }
            else if(e.equals("*--")){
                corvocount +=4;
            }
            else if(e.equals("*-*")){
                corvocount +=5;
            }
            else if(e.equals("**-")){
                corvocount +=6;
            }
            else if(e.equals("***")){
                corvocount +=7;
            }
            else if(e.equals("caw caw")){
                System.out.println(corvocount);
                corvocount = 0;
                count++;
            }
            
        }
        
    }
}