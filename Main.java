/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(ConvertFromBase10(2023, 7));
    }

    public static String ConvertFromBase10(int number, int newBase)
    {
        String result = "";
        
        while (number > 0)
        {
            int digit = number % newBase; // number modulo new base
            if (digit > 10)
                result = digit + result; // add digit to the beginning of result string
            else
            {
                result = (char)(digit-10+'A') + result;
            }
            
            number /= newBase; // divide number by new base
        }

        return result;
    }
}