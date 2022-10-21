package Giris;
import java.util.Scanner;
public class cinBurcu {
    public static void main(String[] args) {
        int dyili,burc;
        Scanner input =new Scanner(System.in);

        System.out.print("Lütfen Doğum Tarihinizi giriniz :");
        dyili=input.nextInt();
        burc=dyili%12;

        switch (burc){
            case 0:
                System.out.println("Çin zodyağı burcunuz 'Maymun' olarak bulunmuştur");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz 'Horoz' olarak bulunmuştur");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz 'Köpek' olarak bulunmuştur");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz 'Domuz' olarak bulunmuştur");
                break;
            case 4:
                System.out.println("Çin zodyağı burcunuz 'fare' olarak bulunmuştur");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz 'Öküz' olarak bulunmuştur");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz 'Kaplan' olarak bulunmuştur");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz 'Tavşan' olarak bulunmuştur");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz 'Ejderha' olarak bulunmuştur");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz 'Yılan olarak bulunmuştur");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz 'At' olarak bulunmuştur");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz 'Koyun' olarak bulunmuştur");
                break;
            default:
                System.out.println("Hesaplamada bir hata olmuştur");











        }


    }
}
