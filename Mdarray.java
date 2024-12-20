/*public class Mdarray{
    public static void main(String[] args) {
        int[][] myNumbers={

        //   0   1  2   3  (columns)
            {12,16,20,24},  //0th row
            {28,32,36,40},   //1st row
            {12,17,19}      //2nd row
        };
        
        System.out.println(myNumbers.length);

        //accessing second element of second array
        System.out.println(myNumbers[1][1]);
       // System.out.println(myNumbers[2][3]); //error index 3 out of bound
       System.out.println(myNumbers[0][3]);
       System.out.println(myNumbers[2][0]);  //output: 12

       System.out.println("---------------------");


       //PRINTING ELEMENTS USING FOR LOOP
       for(int i=0;i<myNumbers.length;i++){  //iterate over rows
        for(int j=0;j<myNumbers[i].length;j++){   //iterate over columns
            System.out.print(myNumbers[i][j] + " ");
        }      // 1st time (1:  [0][0]   2: [0][1]   3: [0][2]    4: [0][3])
               //2nd time  (1:  [1][0]   2: [1][1]   3:  [1][2]   4:  [1][3] )
               //3rd time  (1:   [2][0]  2: [2][1]   3:  [2][2])
       }

       //PRINTING ELEMENTS USING FOR-EACH

       for(int[] row:myNumbers){
         for(int i:row){
            System.out.println(i+" ");
         }
       }
        
    }
}*/

//JAGGED ARRAY --- 2D array where each row can have a different number of columns. 

/*import java.util.Arrays;

public class Mdarray{
    public static void main(String[] args) {
                     
        int[][] GPs=new int[3][];  //GPs is declared as a 2D array with 3 rows
        GPs[0]=new int[]{1,2};  // Row 0 i.e first row has 2 elements: 1 and 2.
        GPs[1]=new int[]{3,6,8,10};  // Row 1 i.e second row has 4 elements: 3, 6, 8, 10.
        GPs[2]=new int[]{11};

      //  GPs[3]=new int[]{0,1,4,7,9};  // will throw an ArrayIndexOutOfBounds Exception

        int value=GPs[0][1];
        int value1=GPs[2][0];
        int value2=GPs[3][3];
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);


        // to print entire arrays as string
        for(int i=0;i<GPs.length;i++){
            System.out.println(Arrays.toString(GPs[i]));

        }
    }
}*/

//ADDING TWO MATRICES
public class Mdarray {
    public static void main(String[] args) {
        int[][] matrixA = {
            {12, 23},
            {21, 89},
        };
        int[][] matrixB = {
            {12, 1},
            {104, 23},
        };

        int[][] result = addMatrices(matrixA, matrixB);

        // Print the resulting matrix
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // To move to the next line for each row
        }
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        // check matrix dimensions
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Dimensions must match");
        }

        int rows = a.length;  
        int columns = a[0].length;

        int[][] sum = new int[rows][columns];

        //loop to perform sum:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum;
    }
}
