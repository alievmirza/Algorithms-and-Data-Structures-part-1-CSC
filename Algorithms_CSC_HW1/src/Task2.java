import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by mirza on 16.09.2016.
 */
public class Task2 {
    StreamTokenizer in;
    int nextInt() throws IOException {
        in.nextToken();
        return (int)in.nval;
    }
    long nextLong() throws IOException {
        in.nextToken();
        return (long)in.nval;
    }
    String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    static public void main(String[] args) throws Exception {
        new Task2().run();
    }

    public void run() throws Exception {
        /*in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int n = nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            out.print(a[i]+" ");
        }
        out.close();*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }


    }

}
