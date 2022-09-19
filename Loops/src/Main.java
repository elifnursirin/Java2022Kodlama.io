public class Main {
    public static void main(String[] args)
    {

        //For Loop
        for (int i=2; i<10; i+=2)
        {
            System.out.println(i);
        }

        //While Loop
        int k=0;
        while (k<10)
        {
            k+=1;
            System.out.println(k);
            k++;
        }

        //Do - While Loop
        int j=1;
        do {
            System.out.println(j);
            j++;
        }
        while (j<10);
    }
}
