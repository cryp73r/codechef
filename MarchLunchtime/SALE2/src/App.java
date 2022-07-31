import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t, n, x, total, flag;
		String[] argus;
		t=Integer.parseInt(br.readLine());
		while (t!=0) {
		    total=0;
		    flag=0;
		    argus=br.readLine().split(" ");
		    n=Integer.parseInt(argus[0]);
		    x=Integer.parseInt(argus[1]);
		    while (n>0) {
		        flag++;
		        if (flag==2) {
		            n--;
		            flag=0;
		        }
		        total+=x;
		        n--;
		    }
		    System.out.println(total);
		    t--;
		}
    }
}
