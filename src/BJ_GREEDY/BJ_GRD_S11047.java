package BJ_GREEDY;

import java.io.*;
import java.util.*;


public class BJ_GRD_S11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        for(int i=0;i<N;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i=(N-1);i>=0;i--){
            if(K == 0){
                break;
            }
            if(K%coin[i] != K){
                count += K/coin[i];
                K = K%coin[i];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
