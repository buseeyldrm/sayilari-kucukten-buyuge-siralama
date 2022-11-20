import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("1.sayıyı gir: ");
        int a= klavye.nextInt();
        System.out.print("2.sayıyı gir: ");
        int b= klavye.nextInt();
        System.out.print("3.sayıyı gir: ");
        int c= klavye.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("sayıların küçükten büyüğe sıralanışı: " +(a+"<"+b+"<"+c));
            }
            else {
                System.out.println("sayıların küçükten büyüğe sıralanışı: " +(a+"<"+c+"<"+b));

            }}

            else if (b<c && b<a){
                if (c<a){
                    System.out.println("sayıların küçükten büyüğe sıralanışı: " +(b+"<"+c+"<"+a));

                }
                else {
                    System.out.println("sayıların küçükten büyüğe sıralanışı: " +(b+"<"+a+"<"+c));
                }

        } else if (c<a && c<b) {
                if (a<b){
                    System.out.println("sayıların küçükten büyüğe  sıralanışı: " +(c+"<"+a+"<"+b));

                }
                else {
                    System.out.println("sayıların küçükten büyüğe  sıralanışı: " +(c+"<"+b+"<"+a));
                }

        }
    }
}