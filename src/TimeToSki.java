public class TimeToSki {
    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth>30;
    }

    public static void main(String[] args)
    {
        System.out.printf("Snow = 31 time to ski? %b%n", timeToSki(31));
        System.out.printf("Snow = 30 time to ski? %b%n", timeToSki(30));

    }
}
