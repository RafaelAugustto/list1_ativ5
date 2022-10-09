import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma medida em metros: ");
        double metros = sc.nextDouble();
        sc.close();

        //Requisito 2:Converter em centimetros e imprimir
        double centimetros = metros * 100;
        System.out.println(metros + "metros, conrresponde à " + centimetros + " centimetros.");
    }
}
