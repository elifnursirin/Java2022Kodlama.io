public class Main {
    public static void main(String[] args) {
        for (int i=2; i<101;i++)
        {
            if (i % 2 != 0)
            {
                if (i % 3 != 0)
                {
                    if (i % 5 != 0)
                    {
                        if (i % 7 != 0)
                        {
                            System.out.println(i + " asal sayıdır.");
                        }
                        else if (i==7)
                        {
                            System.out.println(i + " asal sayıdır.");
                        }
                    }
                    else if (i==5)
                    {
                        System.out.println(i + " asal sayıdır.");
                    }
                }
                else if (i==3)
                {
                    System.out.println(i + " asal sayıdır.");
                }
            }
            else if (i==2)
            {
                System.out.println(i + " asal sayıdır.");
            }


        }

    }
}
