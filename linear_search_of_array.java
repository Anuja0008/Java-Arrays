import java.util.Scanner;

public class linear_search_of_array {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50, 60};

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number to search:");
        int searchNumber = ob.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("Found " + searchNumber + " at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchNumber + " not found in the array.");
        }

    }
}