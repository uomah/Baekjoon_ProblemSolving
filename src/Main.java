import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        int size = commands.length;
        int[] answer = new int[size];
        for(int count = 0;count<size;count++) {
            List<Integer> list = new ArrayList<>();
            int a=commands[count][0];
            int b=commands[count][1];
            int c=commands[count][2];
            for (int i = a - 1; i < b; i++) {
                list.add(array[i]);
            }
            Collections.sort(list);
            answer[count] = list.get(c-1);
        }

        System.out.println();
    }

}