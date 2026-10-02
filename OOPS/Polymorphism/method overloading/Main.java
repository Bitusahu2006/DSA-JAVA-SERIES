public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));

        System.out.println(calc.add(10, 20, 30));

        System.out.println(calc.add(10.5, 20.5));

        System.out.println(calc.subtract(20, 10));

        System.out.println(calc.multiply(5, 4));
    }
}