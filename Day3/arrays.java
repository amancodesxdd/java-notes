package Day3;

public class arrays {
    public static void main(String[] args) {
        
        // Declaring an 1-D array:
        int[] numbers = {10,20,30,40,50};
        
        // Accessing diff elements of an array:
        System.out.println("First: "+ numbers[0]);
        System.out.println("Last :" + numbers[numbers.length-1]);

        // Printing All Elements of Array:
        System.out.println("All Numbers:");
        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();

        // Enhanced For Loop (for-each) [READ-ONLY]

        System.out.println("All Numbers:");
        for(int num : numbers){
            System.out.println(num + " ");
        }
        System.out.println();



        // 2-D Array (Declaration)
        int[][] matrix = {
            {1,2,3},
            {4,7,9},
            {3,6,8}
        };
        
        // Accessing different elements
        System.out.println("Matrix[1][1]: "+ matrix[1][1]);

        // Printing all elements
        for(int i = 0; i < 3; i++){
            for (int j=0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
