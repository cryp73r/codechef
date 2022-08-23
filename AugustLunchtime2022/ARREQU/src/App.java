import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            int array[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (n==2) {
                if (array[0]!=array[1]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            HashSet<Integer> hashSet=new HashSet<>();
            HashMap<Integer, Integer> hashMap=new HashMap<>();
            for (int i=0; i<n; i++) {
                hashSet.add(array[i]);
                hashMap.put(array[i], hashMap.getOrDefault(array[i], 0)+1);
            }
            int max=Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
                if (e.getValue()>max) {
                    max=e.getValue();
                }
            }
            if (n%2==0 && max<=(n/2) && hashMap.size()>=2) {
                System.out.println("YES");
            } else if (n%2!=0 && max<=((n/2)+1) && hashMap.size()>=2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
