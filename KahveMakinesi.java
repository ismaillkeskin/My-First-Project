package kahvemakinesiprojesi;
import java.util.Scanner;
public class KahveMakinesi {

        static Scanner input = new Scanner(System.in);
        static String sut;
        static String boyut;
        static int seker;
        static String hangiKahve = "";
        public static void main(String[] args) {

            menu();
        }
        public static void menu() {
            System.out.println("Hangi Kahveyi Istersiniz? \n" +
                    "1-Turk Kahvesi  \n" +
                    "2-Filtre Kahve  \n" +
                    "3-Espresso ");
            hangiKahve = input.nextLine();
            if (hangiKahve.equalsIgnoreCase("Turk Kahvesi")){
                System.out.println("Turk Kahvesi Hazirlaniyor...");
            }  else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
                System.out.println("Filtre Kahve Hazirlaniyor...");
            }  else if (hangiKahve.equalsIgnoreCase("Espresso")) {
                System.out.println("Espresso Hazirlaniyor...");
            } else {
                System.out.println("Hatali Secim!!!");
                menu();
            }
            sutEkle();
            seker();
            boyut();
        }
        public static void sutEkle () {
            System.out.println("Kahvenize Sut Eklemek Ister Misiniz?");
            String sut = input.next();
            if (sut.equalsIgnoreCase("Evet")) {
                System.out.println("Kahvenize Sut Ekleniyor...");
            } else if (sut.equalsIgnoreCase("Hayir")) {
                System.out.println("Kahveniz Sut Eklenmiyor...");
            } else {
                System.out.println("Lutfen Gecerli Bir Deger Giriniz!!!");
                sutEkle();
            }
        }
        public static void seker () {
            System.out.println("Kahvenize Seker Ister Misiniz?");
            String seker = input.next();
            if (seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kac Seker Istersiniz?");
                int kacSeker = input.nextInt();
                System.out.println("Kahvenize " + kacSeker + " Seker Ekleniyor...");
            } else if (seker.equalsIgnoreCase("Hayir")) {
                System.out.println("Kahveniz Seker Eklenmeden Hazirlaniyor...");
            }else {
                System.out.println("Lutfen Gecerli Bir Deger Giriniz!!!");
                seker();
            }
        }
        public static void boyut () {
            System.out.println("Kahveniz Hangi Boyutta Olsun?");
            String boyut = input.next();
            if (boyut.equalsIgnoreCase("Buyuk")) {
                System.out.println("Kahveniz " + boyut + " Boy Olarak Hazirlaniyor...");
            } else if (boyut.equalsIgnoreCase("Orta")) {
                System.out.println("Kahveniz " + boyut + " Boy Olarak Hazirlaniyor...");
            } else if (boyut.equalsIgnoreCase("Kucuk")) {
                System.out.println("Kahveniz " + boyut + " Boy Olarak Hazirlaniyor...");
            }else {
                System.out.println("Lutfen Gecerli Bir Deger Giriniz!!!");
                boyut();
            }
            System.out.println(hangiKahve +" "+ boyut + " boy olarak hazirlanmistir");
        }
}
