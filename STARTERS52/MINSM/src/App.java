// Wrong Answer

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static HashMap<String, Long> hash=new HashMap<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            long array[]=Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            Arrays.sort(array);
            for (int i=n-1; i>=0; i--) {
                if (hash.containsKey(array[i]+"*"+array[0])) {
                    array[i]=hash.get(array[i]+"*"+array[0]);
                } else {
                    long hcf=gcd(array[i], array[0]);
                    array[i]=hcf;
                    hash.put(array[i]+"*"+array[0], hcf);
                }
            }
            long sum=0;
            for (int k=0; k<n; k++) {
                sum+=array[k];
            }
            System.out.println(sum);
        }
    }

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
      
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a-b, b);
        }
        return gcd(a, b-a);
    }
}
