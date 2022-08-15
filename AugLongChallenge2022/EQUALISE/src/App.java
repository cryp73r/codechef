import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            String argus[]=br.readLine().split(" ");
            int a=Integer.parseInt(argus[0])*2;
            int b=Integer.parseInt(argus[1])*2;
            if (a==b) {
                System.out.println("YES");
                continue;
            } else if (a<b) {
                int temp=a;
                a=b;
                b=temp;
            }
            if (a%b==0) {
                a/=b;
                int i=0;
                while ((int)Math.pow(2, i)!=a) {
                    if (Math.pow(2, i)>a) {
                        System.out.println("NO");
                        break;
                    }
                    i++;
                }
                if (Math.pow(2, i)==a) {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
