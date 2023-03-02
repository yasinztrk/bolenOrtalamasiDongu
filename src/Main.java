import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k,number=0,total=0,ort;
        System.out.print("Sayıyı Giriniz :");
        k = inp.nextInt();
        for (int i = 0; i <= k; i++) {
            if ((i % 12)==0){
                System.out.println(i);
                number++;
                total+=i;


            }

        } ort=total/number;
        System.out.println("Ortalamanız :"+ort);
    }
}