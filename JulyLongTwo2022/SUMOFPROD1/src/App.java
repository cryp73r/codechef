import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            String argus[]=br.readLine().split(" ");
            long cons=0, answer=0;
            for (int i=0; i<n; i++) {
                if (argus[i].equals("1")) {
                    cons+=1;
                } else {
                    answer+=(((cons)*(cons+1))/2);
                    cons=0;
                }
            }
            answer+=(((cons)*(cons+1))/2);
            System.out.println(answer);
        }
    }
}
