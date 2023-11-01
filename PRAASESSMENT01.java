import java.util.Scanner;
public class PRAASESSMENT01 {

    public static void main(final String[] args){
        Scanner s = new Scanner(System.in);

        int N1 = s.nextInt();
        int N2 = s.nextInt();
        int N3 = s.nextInt();

        konversi(N1);
        konversi(N2);
        konversi(N3);
        
    }    
    
        private static void konversi(int angka){
            
        int digit1 = (angka / 1000 + 5) % 10;
        int digit2 = (angka / 100  + 5) % 10;
        int digit3 = (angka / 10 + 5) % 10;
        int digit4 = (angka + 5) % 10;
          
        System.out.printf("%1d%1d%1d%1d\n", digit1, digit4, digit3, digit2);
    }
}
