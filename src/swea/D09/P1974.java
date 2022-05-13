package swea.D09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1974 {
    static int[][] arr;

    static boolean checkSudoku() {
        for (int i = 0; i < 9; i++) {
            boolean[] check1 = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if(check1[arr[i][j]]) {
                    return false;
                }
                check1[arr[i][j]] = true;
            }

            boolean[] check2 = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if(check2[arr[j][i]]) {
                    return false;
                }
                check2[arr[j][i]] = true;
            }

            if (i % 3 == 0) {
                for (int j = 0; j < 9; j += 3) {
                    boolean check3[] = new boolean[10];
                    for (int x = 0; x < 3; x++) {
                        for(int y = 0; y < 3; y++) {
                            if (check3[arr[i + x][j + y]]) {
                                return false;
                            }
                            check3[arr[i + x][j + y]] = true;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            arr = new int[9][9];
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            if(checkSudoku())
                System.out.println("#" + test_case + " 1");
            else
                System.out.println("#" + test_case + " 0");
        }
    }
}
