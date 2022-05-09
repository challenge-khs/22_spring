package swea.D05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1248 {
    static Node nodes[];
    static boolean visit[];
    static int v, e, cnt;

    static class Node {
        int data;
        int parent;
        int left;
        int right;

        public Node(int data) {
            this.data = data;
            this.parent = 0;
            this.left = 0;
            this.right = 0;
        }
    }

    static void find(Node node) {
        cnt++;
        if(node.left != 0)
            find(nodes[node.left]);
        if(node.right != 0)
            find(nodes[node.right]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            int f1 = Integer.parseInt(st.nextToken());
            int f2 = Integer.parseInt(st.nextToken());

            nodes = new Node[v + 1];
            visit = new boolean[v + 1];

            for (int i = 1; i <= v; i++) {
                nodes[i] = new Node(i);
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < e; i++) {
                int p = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                if (nodes[p].left == 0) {
                    nodes[p].left = c;
                } else {
                    nodes[p].right = c;
                }
                nodes[c].parent = p;
            }

            int parent = 1;
            cnt = 0;

            while (true) {
                if (f1 != 1) {
                    int pa1 = nodes[f1].parent;
                    if(visit[pa1] == true) {
                        parent = pa1;
                        break;
                    }
                    visit[pa1] = true;
                    f1 = pa1;
                }
                if (f2 != 1) {
                    int pa2 = nodes[f2].parent;
                    if(visit[pa2] == true) {
                        parent = pa2;
                        break;
                    }
                    visit[pa2] = true;
                    f2 = pa2;
                }
            }
            find(nodes[parent]);
            System.out.println("#" + test_case + " " + parent + " " + cnt);
        }
    }

}
