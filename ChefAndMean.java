import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

class ChefAndMean {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t;
        int n;
        int i;
        float mean=0,sum=0,mean2=0,temp;

        t=in.nextInt();
        while (t!=0){

            n=in.nextInt();
            int a[] = new int[n];
            for(i=0;i<n;i++){
                a[i]=in.nextInt();
            }

            //calculating mean
            for(i=0;i<n;i++){
                sum=sum+a[i];
            }
            mean=sum/n;

            //System.out.println("sum is"+sum);
           // System.out.println("mean is"+mean);

            //removing each coin and verifying the mean
            for(i=0;i<n;i++){
                temp=sum;
                temp=temp-a[i];
                mean2=temp/(n-1);
                //System.out.println("temp is"+temp);
                //System.out.println("mean2 is"+mean2);
                //if(Math.round(mean*1.00000)/1.00000==Math.round(mean2*1.0)/1.0){
                if(mean==mean2){
                    System.out.println(i+1);
                    break;
                }
            }
            System.out.println(i);
            if(i==n)
                System.out.println("Impossible");
            t--;
        }

    }
}
