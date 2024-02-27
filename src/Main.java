import java.util.Scanner;
//Kullancıdan veri alabilmek için Util kütüphasinden Scanner sınıfını projemize dahil ediyoruz


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Veri, ortalama toplamı ve ortalama adedi için değişkenler tanımladık
        int sayi, ortalama=0, sayac=0;



        //Kullanıcıdan veri aldık
        System.out.println("Sayı Giriniz: ");
        sayi =input.nextInt();


        //4 ve 3'e tam bölünme koşulunu oluşturuyoruz
        for (int i =1; i<=sayi; i++){

            if ( (i % 3 == 0) && (i % 4 == 0)){


                //Ortalamaları toplamak için bir değişken atıyoruz ve toplama işleme tabi tutulması için öncesinde sıfıra eşitliyrouz
                ortalama +=i;

                //Ortalama toplamını ortalama adedine bölmek için ortalama adedi sayıp o sayıya eşitlen değerimiz
                sayac++;

               System.out.print(" 3 ve 4'ün katları: " +i);


            }


        }
        ortalama /= sayac;
        System.out.println("\n3 ve 4'ün katlarının toplam ortalaması: "+ ortalama);
    }
}