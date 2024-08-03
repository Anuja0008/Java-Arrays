public class ArrayShift {
    public static void main(String[] args) {
       
        int[] originalArray = {1, 2, 3, 4, 5};

      
        int[] newArray = new int[originalArray.length + 1];

    
        int newElement = 10;

        
        int insertPosition = 4; 
        
        for (int i = 0; i < insertPosition; i++) 
        {
            newArray[i] = originalArray[i];
        }

      
        newArray[insertPosition] = newElement;

        
        for (int i = insertPosition; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        
        System.out.println("New Array:");
        for (int num : newArray)
         {
            System.out.print(num + " ");
        }
    }
}
