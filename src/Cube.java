import java.util.*;


public class Cube {

    private int side;
    private int volume;

    public Cube (int side)
    {
        this.side = side;
        volume = side * side * side;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number of cubes");

        int cubeNumber = in.nextInt();

        for (int i = 1; i <= cubeNumber; i++)
        {
            System.out.println("Enter a side length for cube " + i);

            int side = in.nextInt();

            Cube c1 = new Cube (side);
            System.out.println(c1.volume);
        }
    }
}


