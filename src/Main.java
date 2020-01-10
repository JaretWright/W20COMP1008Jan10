public class Main {
    public static void main(String[] args)
    {
        for (int counter = 100; counter>=0; counter-=5)
        {
            System.out.printf("%d%s", counter, (counter==0)?"\n":",");
        }

        for (int counter = 0; counter <= 100; counter+= 10)
        {
            System.out.printf("%d%s", counter, (counter==100)?"\n":",");
        }

        for (int counter = 0; counter <= 100; counter+= 10)
        {
            System.out.printf("%d%s", counter, (counter%20==0)?" Java, ":", ");
        }
    }
}
