public class Triangle {
    public static void drawTriangle(int numOfRows)
    {
        for (int row = numOfRows; row>0; row--)
        {
            for (int col=1; col<=row; col++)
                System.out.printf("*");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        drawTriangle(5);
        drawTriangle(20);
    }
}
