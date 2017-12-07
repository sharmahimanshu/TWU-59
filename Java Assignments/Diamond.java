import java.util.Scanner;

public class Diamond {
    public static void isocelesTriangle(int n){
            for(int i=0;i<n;i++)
            {
                for(int space=n-1-i;space>0;space--)
                    System.out.print(" ");
                for(int stars=1;stars<=2*i+1;stars++)
                    System.out.print("*");
                System.out.println();
            }

    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)

            {
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void diamondWithName(int n){
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n-i;j++)

            {
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("Himanshu");
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isocelesTriangle(n);
        diamond(n);
        diamondWithName(n);

    }
}
