import java.util.Scanner;

public class PrimeFactors {

    public static void primeFactors(int n)
    {

        int factors[]=new int[n/2];
        for(int i=0;i<factors.length;i++)
            factors[i]=0;
        factors[0]=1;
        for(int i=2;i<=n/2;i++)
            if(factors[i-1]==1)
                continue;
            else
                for(int p=2*i;p<=n/2;p+=i)
                    factors[p-1]=1;

        for(int i=1;i<factors.length;i++)
            if(factors[i]==0)
                if(n%(i+1)==0)
                    System.out.println(i+1);
    }


    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
