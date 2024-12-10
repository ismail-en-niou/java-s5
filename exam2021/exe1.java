public class exe1 {
    public static void main(String[] args) {
        int result = 0;
        int[] numbers = new int[args.length];

        if (args.length > 0) {
            System.out.println("Arguments provided:");
            int j = 0;
            for (int i = 0; i < args.length; i++) {
                try {
                    numbers[j] = Integer.parseInt(args[i]); // Convert to integer
                    result += numbers[j]; // Add to result
                    j++;
                } catch (NumberFormatException e) {
                    
                }
            }
        } else {
            System.out.println("No arguments provided.");
        }
        System.out.println("Sum of valid integers: " + result);
    }
}
