import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        String s=Integer.toString(i);
        if(i==Integer.parseInt(s)){
            System.out.print("Good job");
        }
        else{
            System.out.print("Wrong answer");
        }
    }
}
