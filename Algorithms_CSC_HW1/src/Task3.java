import java.io.*;
import java.util.Scanner;

/**
 * Created by mirza on 16.09.2016.
 */
public class Task3 {
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
        new Task3().run();
    }

    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][k];
        int[][] C = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                B[i][j] = nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int l = 0; l < m; l++) {
                 for (int j = 0; j < k; j++) {
                    C[i][j] += A[i][l]*B[l][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                out.print(C[i][j]+" ");
            }
            out.println();
        }
        out.close();

    }


}
