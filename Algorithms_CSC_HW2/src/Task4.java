import javafx.beans.binding.StringBinding;

import java.io.*;
import java.util.*;

/**
 * Created by mirza on 23.09.2016.
 */
public class Task4 {

    static public void main(String[] args) throws Exception {
        new Task4().run();
    }

    public void run() throws Exception {
        PrintWriter out = new PrintWriter(new File("number.out"));
        //PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(new BufferedReader(new FileReader("number.in")));
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        while(sc.hasNext()){
            list.add(new String(sc.next()));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String ab = o1+o2;
                String ba = o2+o1;
                return ba.compareTo(ab);
            }
        });
        StringBuffer sb = new StringBuffer();
        for (String j : list) {
            sb.append(j);
        }
        out.print(sb.toString());
        sc.close();
        out.close();


    }


}
