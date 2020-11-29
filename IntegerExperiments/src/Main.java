import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        container.count = in.nextInt();

        System.out.println(sumDigits(container.count));
        System.out.println(sumDigits2(container.count));

    }

    public static Integer sumDigits(Integer number)
    {
        Integer sum = 0;
        String  s   = "";

        String str = number.toString();
        char[] letter = str.toCharArray();

        for(int i = 0; i < letter.length; i++)
        {
            s = Character.toString(letter[i]);
            sum = sum + Integer.parseInt(s);
        }

        return sum;
    }

    public static Integer sumDigits2(Integer number)
    {
        Integer sum = 0;

        String str = number.toString();
        char[] letter = str.toCharArray();

        for(int i = 0; i < letter.length; i++)
        {
            Character ch = letter[i];
            sum += Character.digit(ch, 10);
        }

        return sum;
    }
}
