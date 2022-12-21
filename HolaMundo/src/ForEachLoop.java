public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int number:numbers) {
            System.out.println(number);
        }


        int[] prices = new int[4];

        prices[0] = 10000;
        prices[1] = 20000;
        prices[2] = 30000;
        prices[3] = 40000;

        for ( int price : prices) {
            System.out.println(price);
        }

    }
}
