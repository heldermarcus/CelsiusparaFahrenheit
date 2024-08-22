package questao5celsiusparafahrenheit;

import java.util.Scanner;

public class Questao5CelsiusparaFahrenheit {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius: ");
        float cel=ler.nextFloat();
        float fah=cel*9/5+32;
        System.out.println("sua temperatura em fahrenheit e: "+fah);
        // 9/5=1,8
        System.out.println("Agora digite a temperatura em fahrenheit: ");
        float fah1=ler.nextFloat();
        float fah2=fah1-32;
        float cel1=(float) (fah2/1.8);
        System.out.println("sua temperatura em celsius e: "+cel1);
    }
    
}
