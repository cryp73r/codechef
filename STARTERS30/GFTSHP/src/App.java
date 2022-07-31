import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// WRONG LOGIC
public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, n, k, i, count;
        String[] argus;
        int[] costOfItem;
        t = Integer.parseInt(br.readLine());
        while (t!=0) {
            count=0;
            argus=br.readLine().split(" ");
            n = Integer.parseInt(argus[0]);
            k = Integer.parseInt(argus[1]);
            costOfItem = new int[n];
            argus=br.readLine().split(" ");
            for (i=0; i<n; i++) {
                costOfItem[i] = Integer.parseInt(argus[i]);
            }
            Arrays.sort(costOfItem);
            i=0;
            while (k>0) {
                count++;
                if (k-costOfItem[i]>=0) {
                    k -= costOfItem[i];
                } else if (k==(int)Math.round(costOfItem[i]/2)) {
                    count++;
                    break;
                } else {
                    break;
                }
                i++;
                if (i==n) {
                    break;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
