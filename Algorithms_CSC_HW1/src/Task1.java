import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by mirza on 15.09.2016.
 */
public class Task1 {
/*
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
        new Task1().run();
    }

    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);

        BigInteger sum = BigInteger.valueOf(0);
        BigInteger n = BigInteger.valueOf(nextLong());
        for (long i = 1; i*i <= n.longValue() ; i++) {
            sum = sum.add(n.divide(BigInteger.valueOf(i*i)));
        }
        out.print(sum.longValue());
        out.close();
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i*i <= n; i++) {
            sum += n/i/i;
        }
        System.out.println(sum);
    }
}
