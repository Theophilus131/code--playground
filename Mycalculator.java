        public class Mycalculator{
	public static void main(String[] args) {
        Calculator calc = new Calculator();  // Create an object of Calculator

        // Calling the add method on the calc object
        int result = calc.add(5, 3);
        System.out.println("The sum is: " + result); // Output: The sum is: 8
    }
}