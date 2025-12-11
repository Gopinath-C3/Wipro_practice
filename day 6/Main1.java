public class Main1 {

    static class Test<T extends Number> {
        private T num1;
        private T num2;

        Test(T num1, T num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        double getSum() {
            return num1.doubleValue() + num2.doubleValue();
        }
    }

    public static void main(String[] args) {
        Test<Integer> t = new Test<>(20, 30);
        System.out.println("the sum is = " + t.getSum());
    }
}