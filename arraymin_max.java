import java.util.Scanner;
public class arraymin_max
{
	int[] arr = { 4, 1, 9, 3, 5 };

// Initialize min and max to the first element of the array
int min = arr[0];
int max = arr[0];

// Iterate through the rest of the array
for (int i = 1; i < arr.length; i++) {
    // If the current element is smaller than the current minimum, update the minimum
    if (arr[i] < min) {
        min = arr[i];
    }
    // If the current element is larger than the current maximum, update the maximum
    if (arr[i] > max) {
        max = arr[i];
    }
}

// Print the minimum and maximum values
System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
	
	
	
	}
}

