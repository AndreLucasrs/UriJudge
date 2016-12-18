package string;

import java.util.Scanner;

class Led{
    public static void main(String[] args)  {
        Scanner br = new Scanner(System.in);
        int entrada = br.nextInt();
        
        for(int i = 0; i < entrada; i ++){
            String num = br.next();
            int leds = 0;
            for(int j = 0; j < num.length(); j++){
                    
                if(num.charAt(j) == '1'){
                    leds += 2;
                }    
                if(num.charAt(j) == '2'){
                    leds += 5;
                }    
                if(num.charAt(j) == '3'){
                    leds += 5;
                }    
                if(num.charAt(j) == '4'){
                    leds += 4;
                }    
                if(num.charAt(j) == '5'){
                    leds += 5;
                }    
                if(num.charAt(j) == '6'){
                    leds += 6;
                }    
                if(num.charAt(j) == '7'){
                    leds += 3;
                }    
                if(num.charAt(j) == '8'){
                    leds += 7;
                }    
                if(num.charAt(j) == '9'){
                    leds += 6;
                }    
                if(num.charAt(j) == '0'){
                    leds += 6;
                }    
                       
            }
            System.out.println(leds + " leds");
        }
    }
} 
