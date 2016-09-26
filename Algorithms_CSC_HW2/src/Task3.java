import java.io.*;
import java.util.Arrays;

/**
 * Created by mirza on 22.09.2016.
 */
public class Task3 {
    StreamTokenizer in;
    int nextInt() throws IOException {
        in.nextToken();
        return (int)in.nval;
    }

    String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    static public void main(String[] args) throws Exception {
        new Task3().run();
    }


    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int t = nextInt();
        for (int i = 1; i <= t; i++) {
            int n = nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            for (int j = 0; j < n; j++) {
                x[j] = nextInt();
            }
            for (int j = 0; j < n; j++) {
                y[j] = nextInt();
            }
            Arrays.sort(x);
            Arrays.sort(y);
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += x[j]*y[n-j-1];
            }
            out.println("Case #"+i+": "+sum);
        }

        out.close();


    }


}
