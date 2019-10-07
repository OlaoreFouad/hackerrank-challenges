/**
 * script
 */
public class script {

    private static int number = 5;

    public static void main(String[] args) {
        
        for(int i = 0; i < number; i++) {
            spaces(number-(i+1));
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.println("#");
                } else {
                    System.out.print("#");
                }
            }
        }

    }

    private static void spaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
    
}