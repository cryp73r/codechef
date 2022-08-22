import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            HashSet<String> hash=new HashSet<>();
            String argus[]=br.readLine().split(" ");
            int n=Integer.parseInt(argus[0]);
            int k=Integer.parseInt(argus[1]);
            char s[]=br.readLine().toCharArray();
            int maxflips=n-k+1;
            int cmax=maxflips;
            for (int i=0; i<(n%k)+1 && cmax!=0; i++) {
                if (s[i]=='1') {
                    if (cmax<maxflips && cmax%2!=0) {
                        if (!hash.contains(new String(Arrays.copyOfRange(s, i, i+k+1)))) {
                            hash.add(new String(Arrays.copyOfRange(s, i, i+k+1)));
                            s[i]='0';
                        }
                    } else if (cmax<maxflips && cmax%2==0) {
                        
                    }
                }
            }
            System.out.println(new String(s));
        }
    }
}
