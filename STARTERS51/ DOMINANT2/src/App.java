import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            String argus[]=br.readLine().split(" ");
            int array[]=new int[n];
            for (int i=0; i<n; i++) {
                array[i]=Integer.parseInt(argus[i]);
            }
            int max=Integer.MIN_VALUE;
            for (int i=0; i<n; i++) {
                if (max<array[i]) {
                    max=array[i];
                }
            }
            int freq[]=new int[max+1];
            for (int i=0; i<n; i++) {
                freq[array[i]]++;
            }
            int flag=0, high=0;
            for (int i=0; i<max+1; i++) {
                if (high<freq[i]) {
                    high=freq[i];
                }
            }
            for (int i=0; i<max+1; i++) {
                if (high==freq[i]) {
                    flag++;
                }
            }
            if (flag==1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
