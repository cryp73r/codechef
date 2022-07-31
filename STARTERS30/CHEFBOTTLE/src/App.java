import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        String[] argus;
        int[] nxk = new int[3];
        t = Integer.parseInt(br.readLine());
        while (t!=0) {
            argus=br.readLine().split(" ");
            nxk[0] = Integer.parseInt(argus[0]);
            nxk[1] = Integer.parseInt(argus[1]);
            nxk[2] = Integer.parseInt(argus[2]);
            if ((nxk[2]/nxk[1])<nxk[0]) {
                System.out.println(nxk[2]/nxk[1]);
            } else if ((nxk[2]/nxk[1])>=nxk[0])  {
                System.out.println(nxk[0]);
            } else {
                System.out.println(0);
            }
            t--;
        }
    }
}
