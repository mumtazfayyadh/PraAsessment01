import java.util.Scanner;

public class PRAASS03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String gender = input.next();
        int berat = input.nextInt();
        int tinggi = input.nextInt();
        
        double keMeter = tinggi / 100.00;
        double bmi = berat / (keMeter * keMeter);

        String hasil = kategori(gender , bmi);

        System.out.printf("%.2f %s", bmi , hasil );


    }
    public static String kategori(String gender, double bmi) {
        String kata = "";
        switch (gender) {
            case "Pria" :
            if (bmi < 20.50) {
                kata = "Kurus";
            }
            else if (bmi > 20.50 && bmi <26.99) {
                kata = "Ideal";
            }
            else if (bmi >=27.00) {
                kata = "Gemuk";
            }
            break;

            case "Wanita" :
            if (bmi < 18.50) {
                kata = "Kurus";
            }
            else if (bmi > 18.50 && bmi < 24.99) {
                kata = "Ideal";
            }
            else if (bmi > 25.00) {
                kata = "Gemuk";
            }
        }
        return kata;
    }

}