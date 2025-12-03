import java.util.Scanner;
public class Exercise4_1 {

   public class TarihYazdirma {
    public static void printAmerican ( String day ,int date , String month , int year ) {

    System.out.print(day+", "+month+" "+date+", "+year);

    }

    public static void printEuropean ( String day ,int date , String month , int year ) {

    System.out.print(date+", "+month+" "+year+", "+day);

    }
    

 public static String günKontrol(int günSayısı){ //Seçilen günü geri döndürüyor
    switch (günSayısı) {
        case 1:
            return "Pazartesi";
        case 2:
            return "Salı";
        case 3:
            return "Çarşamba";
        case 4:
            return "Perşembe";
        case 5:
            return "Cuma";
        case 6:
            return "Cumartesi";
        case 7:
            return "Pazar";
        default:
            return "Hata";
    }
    }

    public static String ayKontrol(int ay){ //Seçilen ayı geri döndürüyor
    switch (ay) {
        case 1:
            return "Ocak";
        case 2:
            return "Şubat";
        case 3:
            return "Mart";
        case 4:
            return "Nisan";
        case 5:
            return "Mayıs";
        case 6:
            return "Haziran";
        case 7:
            return "Temmuz";
        case 8:
            return "Ağustos";
        case 9:
            return "Eylül";
        case 10:
            return "Ekim";
        case 11:
            return "Kasım";
        case 12:
            return "Aralık";
        default:
            return "Hata";
    }
}   

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String hGün,month;
    int haftaGün,ay,yıl,gün;
    System.out.println("\n====== Haftanın Günü =======");
    System.out.println("1-Pazartesi");
    System.out.println("2-Salı");
    System.out.println("3-Çarşamba");
    System.out.println("4-Perşembe");
    System.out.println("5-Cuma");
    System.out.println("6-Cumartesi");
    System.out.println("7-Pazar");
    System.out.print("Haftanın Gününü Giriniz(1-7) : ");
    haftaGün=input.nextInt();

    System.out.println("\n====== Ay =======");
    System.out.println("1-Ocak");
    System.out.println("2-Şubat");
    System.out.println("3-Mart");
    System.out.println("4-Nisan");
    System.out.println("5-Mayıs");
    System.out.println("6-Haziran");
    System.out.println("7-Temmuz");
    System.out.println("8-Ağustos");
    System.out.println("9-Eylül");
    System.out.println("10-Ekim");
    System.out.println("11-Kasım");
    System.out.println("12-Aralık");
    System.out.print("Ayı Giriniz(1-12) : ");
    ay=input.nextInt();

    System.out.println("\n====== gün =======");
    System.out.print("Günü Giriniz(1-31) : ");
    gün=input.nextInt();

    System.out.println("\n====== Yıl =======");
    System.out.print("Yılı Giriniz(0-2025) : ");
    yıl=input.nextInt();
    
    hGün=günKontrol(haftaGün);
    month=ayKontrol(ay);

    System.out.print("\nAmerikan Formatı : ");
    printAmerican(hGün, ay, month, yıl);

    System.out.print("\nAvrupa Formatı   : ");
    printEuropean(hGün, ay, month, yıl);

        input.close();
    }
}
