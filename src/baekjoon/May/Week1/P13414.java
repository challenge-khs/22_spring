package baekjoon.May.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> student = new LinkedHashSet<>();
        for (int i = 0; i < l; i++) {
            String temp = br.readLine();
            if (student.contains(temp)) {
                student.remove(temp);
            }
            student.add(temp);
        }

        Iterator<String> it = student.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            k--;
            if(k == 0)
                break;
        }
    }
}
