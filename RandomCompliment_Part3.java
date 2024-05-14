 import java.util.Scanner;
 import java.util.Random;
 
 public class RandomCompliment_Part3 {
     public static void main(String[] args) {
         // Initialize scanner
         Scanner scanner = new Scanner(System.in);
 
         // Print salutation
         System.out.println("Welcome to the Random Complimenter.\n");
 
         // Call process method to get compliments array
         String[] compliments = process(scanner);
 
         // Call input method to get random number generator seed
         Random random = input(scanner);
 
         // Call output method to print random compliments
         output(scanner, random, compliments);

         // Close scanner
         scanner.close();
 
         // Print valedictory 
         System.out.println("\nHave a great day!");
     }
 
     // Process user input for compliments
     public static String[] process(Scanner scanner) {
         // Initialize empty array
         String[] complimentsArray = new String[0];
         int count = 0;
         boolean continueLoop = true;
 
         while (continueLoop) {
             // Prompt for compliment
             System.out.print("Please enter compliment #" + (count + 1) +
                 " or <ENTER> to quit loading compliments:\n");
             String input = scanner.nextLine();
 
             // Check for empty string
             if (input.length() == 0) {
                 continueLoop = false;
             } else {
 
                 // Increase array size
                 String[] newArray = new String[complimentsArray.length + 1];
 
                 // Copy compliments to new array
                 for (int i = 0; i < complimentsArray.length; i++) {
                     newArray[i] = complimentsArray[i];
                 }
 
                 // Add new compliment
                 newArray[count] = input;
                 count++;
 
                 // Update array reference
                 complimentsArray = newArray;
             }
         }
 
         // Print number of compliments
         System.out.println("\nThe " + count + " compliment(s) " +
          "have been loaded.\n");
 
         return complimentsArray;
     }
 
     // Get random number generator seed
     public static Random input(Scanner scanner) {
         // Prompt for seed
         System.out.print("Enter a seed for the random " +
          "number generator (RGN).\n");
 
         // Return Random object with seed
         return new Random(scanner.nextInt());
     }
 
     // Output random compliments
     public static void output(Scanner scanner, Random random, String[] compliments) {
         boolean continueLoop = true;
 
         while (continueLoop) {
             // Prompt for number of compliments
             System.out.print("\nHow many compliments would " +
              "you like? ('0' to quit)\n");
             int quantity = scanner.nextInt();
             scanner.nextLine();
 
             if (quantity == 0) {
                 continueLoop = false;
             } else {
                 // Print random compliments
                 for (int i = 0; i < quantity; i++) {
                     int index = random.nextInt(compliments.length);
                     System.out.println(compliments[index]);
                 }
             }
         }
     }
 }
