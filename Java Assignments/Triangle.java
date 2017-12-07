import java.util.Scanner;

public class Triangle {
    public static void easiestExercise(){
        System.out.print("*");
    }
    public static void horizontalLine(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
    public static void verticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }
    public static void rightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        easiestExercise();
        horizontalLine(n);
        verticalLine(n);
        rightTriangle(n);
    }


}
