 import static java.lang.Math.sqrt;
 import static java.lang.Math.pow;
import java.util.Scanner;
public class Prog05
{
   public static void main(String[] args) {
    
     //leitura de variaveis//
      Scanner ent = new Scanner(System.in);
      System.out.print("Digite o angulo: ");
      float a = ent.nextFloat();
      System.out.print("Digite o raio: ");
      float r = ent.nextFloat();
     
      //calculo área de um setor circular//
      double pi = 3.14;
      double raio= pow(r,2);
      double area= (a*pi*raio)/360;
   
      System.out.print("A distancia euclediana e : "+area);
   }
}
