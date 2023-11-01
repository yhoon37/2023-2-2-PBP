public class MathMain {
    public static void main(String[] args) {

        int begin = 2;
        int end = 10;

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);
        printSumBetween(begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end,
                product);
        printProductBetween(begin, end, product);
    }
	private static long getSumBetween(final int begin, final int end) {
        long sum = 0;
        for(int i=begin; i<=end; i++) {
            sum += i;
        }
        return sum;
    }
    private static void printSumBetween(final int begin, final int end, final long sum) {
        for(int i = begin; i<end; i++){
            System.out.print(i + "+");
        }
        System.out.println(end + " = " + sum);
    }

    private static long getProductBetween(final int begin, final int end) {
        long product = 1;
        for(int i=begin; i<=end; i++) {
            product *= i;
        }
        return product;
    }

    private static void printProductBetween(final int begin, final int end, final long product) {
        for(int i = begin; i<end; i++){
            System.out.print(i + "*");
        }
        System.out.printf("%d = %,d%n", end, product);
    }

}
