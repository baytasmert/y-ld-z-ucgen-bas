import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i=0;i<n;i++){

            for (int k= 0;k<n-(2*i+1)/2;k++){
                System.out.print( " ");
            }

            for (int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i=n-1;i>=0;i--){
            for (int k= 0;k<n-(2*i+1)/2;k++){
                System.out.print( " ");
            }

            for (int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }



            System.out.println( " ");
    }
}}