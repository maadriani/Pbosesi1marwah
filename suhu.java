import java.util.Scanner;

public class suhu {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        System.out.println("Masukan suhu rearmur");
        Double rearmur = scanner.nextDouble();

        //Rumus
        double calcius = 5.00/4 *rearmur;
        double farhenheint = 9.00/5 + calcius +32;
        double kelvin = calcius + 237;

        //print
        System.out.println("suhu Calcius: " + calcius);   
        System.out.println("suhu faarhenheint: " + farhenheint);   
        System.out.println("suhu kelvin: " + kelvin);   

    } 
}
