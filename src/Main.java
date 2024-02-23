import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Gerekli degiskenler tanimlandi.
        String userName = "", password = "", uName = "patika", pWord = "java123";
        int counter = 1, selected = 0, balance = 1500, dBalance = 0;

        // Scanner sinifina ait degiskeni projeye dahil ettik.
        Scanner input = new Scanner(System.in);

        // While dongusu ile beraber gerekli mantiksal karsilastirmalar, matematiksel islemler ve kullaniciya geribildirimde bulunduk.
        while (counter <= 3) {
            System.out.print("Kullanici adinizi giriniz: ");
            userName = input.nextLine();

            System.out.print("Sifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals(uName) && password.equals(pWord)) {
                System.out.print("Giris basarili !!!");

                System.out.println("\n1- Para Yatirma.");
                System.out.println("2- Para Cekme.");
                System.out.println("3- Bakiye Kontrol Etme.");
                System.out.println("4- Cikis.");
                System.out.print("Yapmak istediginiz islemi seciniz lutfen: ");

                selected = input.nextInt();

                switch (selected){
                    case 1:
                        System.out.print("\nYatirmak istediginiz tutari giriniz: ");
                        balance += input.nextInt();
                        System.out.println("Bakiyeniz guncellendi.\nYeni bakiyeniz: "+ balance);
                        counter += 3;
                        break;
                    case 2:
                        System.out.print("\nCekmek istediginiz tutari giriniz: ");
                        dBalance = 0;
                        dBalance = input.nextInt();
                        if (balance < dBalance){
                            System.out.println("Bakiyeniz yetersizdir.");
                            counter += 3;
                        }else{
                            balance -= dBalance;
                            System.out.println("Bakiyeniz guncellendi.\nYeni bakiyeniz: "+ balance);
                            counter += 3;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        counter += 3;
                        break;
                    case 4:
                        counter += 3;
                        break;
                    default:
                        System.out.println("Hatali giris yaptiniz.");
                        counter += 3;
                }

            } else {
                if (counter >= 3) {
                    System.out.println("Cok fazla hatali denemede bulundunuz. Hesabiniz bloke edildi!!!");
                } else {
                    System.out.println("Kullanici adi veya sifreni hatali girdin!");
                    System.out.println("Tekrar dene!");
                }
                counter++;
            }
        }
    }
}