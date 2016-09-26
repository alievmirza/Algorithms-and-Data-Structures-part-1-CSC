import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by mirza on 19.09.2016.
 */
public class Task1 {
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
        new Task1().run();
    }

    public class Bus implements Comparable {
        public int num;
        public int val;
        public Bus(int num, int val){
            this.num = num;
            this.val = val;
        }
        @Override
        public int compareTo(Object o) {
            Bus bus = (Bus) o;
            if(val > bus.val)
                return -1;
            if (val < bus.val)
                return 1;
            return 0;
        }
    }

    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int m = nextInt();
        int n = nextInt();
        Bus[] a = new Bus[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Bus(i,nextInt());
        }
        Arrays.sort(a);
        int i = 0;
        while(m > 0 && i < n){
            m -= a[i].val;
            i++;
        }
        if(m > 0){
            out.print(-1);
        }
        else {
            out.println(i);
            for (int j = 0; j < i; j++) {
                out.print((a[j].num + 1) + " ");
            }
        }
        out.println();
        out.close();


    }


}
