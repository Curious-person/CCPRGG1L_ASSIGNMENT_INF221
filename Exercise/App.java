public class App {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1','1','1'}};
    
// PATTERN 1
System.out.println("1. PATTERN 1");
    
        //OUTER LOOP
        // for (int rows = 0; rows < mdArray.length; rows++){
        //     //INNER LOOP
        //     System.out.println("");
        //     for (int columns = 0; columns < 3; columns++) {
                
        //         if (rows %2 == 0){
        //             System.out.print(mdArray[rows][columns]);
        //         }
        //     }
        // }

 // PATTERN 2
 System.out.println("2. PATTERN 2");

        // //OUTER LOOP
        // for (int rows = 0; rows < mdArray.length; rows++){

        //        // INNER LOOP
        //      System.out.println("");
        //      for (int columns = 0; columns < 3; columns++) {
                    
        //           if (rows %2 == 0){
        //               System.out.print(mdArray[rows][columns]);
        //                 if (rows %2 != 0){
        //                    System.out.println("x"); 
        //             }
        //         }                      
        //     } 
        // }
// PATTERN 3
System.out.println("3. PATTERN 3");

        // //OUTER LOOP
        // for (int row = 0; row < mdArray.length; row++) {
        //         //INNER LOOP
        //     System.out.println("");

        //     for (int columns = 0; columns < 3; columns++) {
                
        //         if (row == 0 || row == 3){
        //             System.out.print(mdArray[row][columns]);
        //         }
        //         else if (row == 1 || row == 2){

        //             if(columns == 0 || columns == 2)
        //             {
        //                 System.out.print(" ");
        //             }
        //             else if (columns == 1){
        //                 System.out.print(mdArray[row][columns]);
        //             }
        //         }  
        //     }  
        // }
    
// PATTERN 4
System.out.println("");
System.out.println("4. PATTERN 4");
        // //OUTER LOOP
        // for (int row = 0; row < mdArray.length; row++) {
        //         //INNER LOOP
        //     System.out.println("");
        //     for (int columns = 0; columns <3; columns++){
        //         if (row == 1 || row == 3){
        //             System.out.print(mdArray[row][columns]);
        //         }
        //             if (row == 0 || row == 2){

        //                 if (columns == 0 || columns == 2){
        //                     System.out.print(" ");
        //                 } else {
        //                     System.out.print(mdArray[row][columns]);


        //          }

        //        }

        //     }

        // }
  
// PATTERN 5
// Get the SUM
System.out.println(" ");
System.out.println("5. PATTERN 5");

int [][] number = {{1,1,1},{1,1,1},{1,1,1}, {1, 1, 1}};

    int sum = 0;
//OUTER LOOP
System.out.println("6. SUM");
for (int row = 0; row < mdArray.length; row++) {
    
   //INNER LOOP
    System.out.println(" ");
    for (int columns = 0; columns < 3; columns++) {               
        sum += number[row][columns];
            }
        }
        System.out.println(sum);
    }   
}

