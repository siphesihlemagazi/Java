public class Main {
    public static void main(String[] args) {
        decimalToHex(13);
    }
    static void decimalToHex(int number)
    {
        int[] hexNumber = new int[10000];
        int i = 0;
        while (number > 0) {
            hexNumber[i] = number % 16;
            number = number / 16;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            if (hexNumber[j] > 9)
                System.out.print((char)(55 + hexNumber[j]));
            else
                System.out.print(hexNumber[j]);
        }
    }
}