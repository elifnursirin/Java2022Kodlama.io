public class Conditionals {
    public static void main(String[] args) {

       // int sayi = 20;
        //if (sayi < 20)
        //{
          //  System.out.println("sayi 20'den küçüktür.");
        //}
        //else if (sayi==20)
        //{
          //  System.out.println("sayı 20'ye eşittir");
        //}
        //else
        //{
          //  System.out.println("sayı 20'den büyüktür");
        //}

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2)
        {
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3)
        {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayi = "+enBuyuk);
    }
}
