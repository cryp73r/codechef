import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, n, i;
        String[] argus;
        int[] array, sumarray;
        t = Integer.parseInt(br.readLine());
        while (t!=0) {
            n = Integer.parseInt(br.readLine());
            array = new int[n];
            if (n%2==0) {
                sumarray=new int[n/2];
            } else {
                sumarray=new int[(n+1)/2];
            }
            argus = br.readLine().split(" ");
            for (i=0; i<n; i++) {
                array[i] = Integer.parseInt(argus[i]);
            }
            for (i=0; i<n; i+=2) {
                if (i!=n-1) {
                    sumarray[i]=array[i]+array[i+1];
                } else {
                    sumarray[i]=array[i];
                }
            }
            t--;
        }
    }
}
