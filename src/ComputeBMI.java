
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
         Scanner in = new Scanner (System.in);
            System.out.println("informe seu peso em libras");
            double weight =in.nextDouble();
            System.out.println("informe sua altura e polegadas");
            double height= in.nextDouble();
            double bmi=(weight/Math.pow(height,2))*703;
            System.out.println("seu indice de massa corporal é"+Math.round(bmi));
                   
        
        }
}
