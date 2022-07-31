import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            String argus[];
            int x, y, n, r;
            argus=br.readLine().split(" ");
            x=Integer.parseInt(argus[0]);
            y=Integer.parseInt(argus[1]);
            n=Integer.parseInt(argus[2]);
            r=Integer.parseInt(argus[3]);
            int item_y=r/y;
            int item_x=r/x;
            if (item_y>=n)  {
                System.out.println(0+" "+n);
            } else if (item_x<n) {
                System.out.println(-1);
            } else {
                int total_y=y*n;
                int diff=y-x;
                item_x=(total_y-r)/diff;
                if (((total_y-r)%diff)!=0) {
                    item_x+=1;
                }
                System.out.println(item_x+" "+(n-item_x));
            }
        }
    }
}
