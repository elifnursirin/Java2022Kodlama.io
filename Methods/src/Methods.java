public class Methods 
{
    public static void main(String[] args) 
    {
        sayiBulmaca();
        int toplam = topla(3,6,7,2,10);
        System.out.println(toplam);
    }

    public static void sayiBulmaca()
    {
        int[] numbers = {1,2,3,4,5,7,8};
        int searching = 6;

        for (int num:numbers)
        {
            if (num==searching)
            {
                System.out.println("sayı mevcut " + num);
            }
            else
            {
                System.out.println("sayı mevcut değil " + num);
            }
        }

    }

	//veriables arguments
    public static int topla(int... sayilar)
    {
        int toplam = 0;
        for(int sayi:sayilar)
        {
            toplam+=sayi;
        }
        return toplam;
    }
}

