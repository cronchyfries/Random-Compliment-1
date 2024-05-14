 import java.util.Random;
 import java.util.Scanner;
 
 public class RandomCompliment_Part2 {
     public static void main(String[] args) {
         // 1. Salutation
         System.out.println("Welcome to the Random Complimenter.\n");
 
         // 2. Scanner instantiation
         Scanner scanner = new Scanner(System.in);
 
         // 3. Call method to get compliments
         String[] compliments = getCompliments(scanner);
 
         // 4. Call method to get Random object
         Random random = getRandom(scanner);
 
         // 5. Call method to output compliments
         outputCompliments(scanner, random, compliments);
 
         // 6. Valedictory
         System.out.println("\nHave a great day!");
 
         // 7. Close Scanner
         scanner.close();
     }
 
     // Get compliments array
     public static String[] getCompliments(Scanner scanner) {
         System.out.println("How many compliments would you like to add?");
         int numCompliments = getInput(scanner);
 
         // Create compliments array
         String[] compliments = new String[numCompliments];
 
         for (int i = 0; i < numCompliments; i++) {
             System.out.println("Please enter compliment #" + (i + 1) + ":");
             compliments[i] = scanner.nextLine();
         }
 
         // Print message indicating compliments have been loaded
         System.out.println("\nThe " + numCompliments + " compliments have been loaded.");
 
         // Return the compliments array
         return compliments;
     }
 
     // Get Random object
     public static Random getRandom(Scanner scanner) {
         System.out.println("\nEnter a seed for the random number generator (RGN).");
         int seed = getInput(scanner);
 
         // Return the Random object with the provided seed
         return new Random(seed);
     }
 
     // Output random compliments
     public static void outputCompliments(Scanner scanner, Random random, String[] compliments) {
         // Get number of compliments
         int numCompliments;
 
         do {
             System.out.println("\nHow many compliments would you like? ('0' to quit)");
             numCompliments = getInput(scanner);
 
             for (int i = 0; i < numCompliments; i++) {
                 System.out.println(compliments[random.nextInt(compliments.length)]);
             }
         } while (numCompliments != 0);
     }
 
     // Get integer input
     public static int getInput(Scanner scanner) {
         return Integer.parseInt(scanner.nextLine());
     }
 }
 
