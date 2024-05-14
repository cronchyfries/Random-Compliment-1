 import java.util.Random;
 import java.util.Scanner;
 
 public class RandomCompliment_Part1 {
     public static void main(String[] args) {
         // Print welcome message
         System.out.println("Welcome to the Random Complimenter program.\n");
 
         // Create Scanner to get user input
         Scanner scanner = new Scanner(System.in);
 
         // Call outputCompliments method to generate compliments
         outputCompliments(scanner);
 
         // Print goodbye message
         System.out.println("Have a great day!");
 
         // Close Scanner
         scanner.close();
     }
 
     // Method to handle outputting compliments
     public static void outputCompliments(Scanner scanner) {
         // Create Random object to generate random numbers
         Random random = new Random();
 
         // Get seed input from user
         int seed = getInput(scanner, "Enter a seed for the random " +
          "number generator.\n");
 
         // Set seed on Random object
         random.setSeed(seed);
 
         System.out.println(); // Blank line
 
         // Variable to hold number of compliments
         int numCompliments;
 
         // Loop until user enters 0 compliments
         do {
             // Get number of compliments from user
             numCompliments = getInput(scanner, "How many compliments " +
              "would you like? ('0' to quit)\n");
 
             // Loop to output number of compliments
             for (int i = 0; i < numCompliments; i++) {
                 // Print random compliment
                 System.out.println(getRandomCompliment(random));
             }
 
             // Blank line after compliments  
             System.out.println();
 
             // Repeat while user hasn't entered 0  
         } while (numCompliments != 0);
     }
 
     // Method to get integer input from user
     public static int getInput(Scanner scanner, String prompt) {
         // Print prompt 
         System.out.print(prompt);
 
         // Return user input
         return scanner.nextInt();
     }
 
     // Method to return random compliment
     public static String getRandomCompliment(Random random) {
         // Generate random number 0-2   
         int index = random.nextInt(3);
 
         // Return compliment based on index
         switch (index) {
             case 0:
                 return "You are soooooo good looking.";
             case 1:
                 return "You ... are ... #1.";
             default:
                 return "You're pretty awesome.";
         }
     }
 }
 
