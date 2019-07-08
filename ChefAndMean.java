import java.util.Scanner;

class ChefAndMean {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t;
        int n;
        int i;
        double mean=0,sum=0;

        t=in.nextInt();
        while (t!=0){
            //assign sum to 0 for every iteration to work properly
            sum=0;
            
            n=in.nextInt();
            double a[] = new double[n];
            for(i=0;i<n;i++){
                a[i]=in.nextDouble();
            }

            //calculating mean
            for(i=0;i<n;i++){
                sum=sum+a[i];
            }
            mean=sum/n;

            //if mean=a[i] then its possible to achieve the same mean by removing it
            for(i=0;i<n;i++){
                if(mean==a[i]){
                    System.out.println(i+1);
                    break;
                }
            }
            //if the break statement doesnt execute then there is no possiblity of ahieving the same mean
            if(i==n)
                System.out.println("Impossible");
            t--;
        }
    }
}
