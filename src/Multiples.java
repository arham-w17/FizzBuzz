public class Multiples
{
    public static void main(String[] args)
    {
        int ctr = 0;
        for(int i = 1; i <= 1000; i++)
        {
            if (i % 3 == 0)
            {
                ctr++;
            }
            else if (i % 5 == 0)
            {
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}
