import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Character> hash = new HashMap<Integer, Character>();
        int t, n, i;
        String argus;
        char[] argusCharArray;
        t = Integer.parseInt(br.readLine());
        while (t!=0) {
            n = Integer.parseInt(br.readLine());
            argus = br.readLine();
            argusCharArray = argus.toCharArray();
            Arrays.sort(argusCharArray);
            for (i=0; i<n; i++) {
                hash.put(i, argusCharArray[i]);
            }
            // hash.get(argus.charAt(hash.get(argus.charAt(i))))==i
            for (i=0; i<n; i++) {
                if (!(hash.get(i)==argus.charAt(i) || hash.get(i)==argus.charAt(n-1-i))) {
                    break;
                }
            }
            if (i==n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
