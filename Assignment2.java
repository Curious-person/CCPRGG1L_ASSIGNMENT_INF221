public class App {
    public static void main(String[] args) throws Exception {
        //FOR LOOP
        for (int i = 5; i != 0; i--) {
           
            
            if (i == 4) {
                System.out.println("break time");
                break;
            }
             System.out.println("John Kevin");
        }
        
        //WHILE LOOP
        int  nicknameCount = 5;
        while ( nicknameCount != 0) {
            
            nicknameCount--;
            if (nicknameCount == 3) {
                System.out.println("Go ahead i will skip this third loop. i will continue");
                continue;
            }
            System.out.println("kej");
        } 
        
        //DO WHILE LOOP
        int nameCount = 5;
        do {
            System.out.println("abgao");
            nameCount--;
        } while (nameCount != 0);
    }
    
    }
