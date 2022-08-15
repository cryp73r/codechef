import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            int p[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a[]=new int[n];
            a[0]=0;
            int b[]=new int[n];
            b[0]=0;
            int sum=0;
            for (int i=1; i<n; i++) {
                a[i]=p[i-1];
                sum+=a[i];
                b[i]=a[i];
                a[i]=sum;
            }
            int differ=0;
            int i=0;
            for (i=0; i<n-1; i++) {
                differ=a[i+1]-b[i];
                if (differ>0) {
                    b[i+1]+=b[i]+differ;
                } else {
                    b[i+1]+=b[i];
                }
            }
            System.out.println(b[i]);
        }
    }
}
