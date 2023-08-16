/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(ConvertFromBase10(2023, 16));
        System.out.println(ConvertToBase10("7E7", 16));
    }

    public static String ConvertFromBase10(int number, int newBase)
    {
        String result = "";
        
        while (number > 0) // continue running until number = 0 when performing number /= newBase
        {
            int digit = number % newBase; // get remainder of number modulo newBase
            
            if (digit < 10) // if remainder is a digit
                result = digit + result; // add digit to the beginning of result string
            else // else if remainder is 10 or more
                result = (char)(digit - 10 + 'A') + result; // add letter character
            
            number /= newBase; // divide number by new base
        }

        return result;
    }

    public static int ConvertToBase10(String number, int oldBase)
    {
        int result = 0;

        for (char c : number.toCharArray()) // traverse the input number
        {
            result *= oldBase;
            if (c >= '0' && c <= '9')
                result += c - '0';
            else
                result += (c - 'A' + 10);
        }

        return result;
    }
}