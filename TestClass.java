import java.io.*;
import java.util.*;
import javafx.util.Pair;
import java.util.ArrayList;

// class Pair {
//     public static Long key, value;
//     Pair(Long k, Long v) {
//         key = k;
//         value = v;
//     }
// }

public class TestClass {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         int[][] Edges = new int[N-1][2];
         for(int i_Edges = 0; i_Edges < N-1; i_Edges++)
         {
         	String[] arr_Edges = br.readLine().split(" ");
         	for(int j_Edges = 0; j_Edges < arr_Edges.length; j_Edges++)
         	{
         		Edges[i_Edges][j_Edges] = Integer.parseInt(arr_Edges[j_Edges]);
         	}
         }
         String[] arr_Values = br.readLine().split(" ");
         long[] Values = new long[N];
         for(int i_Values = 0; i_Values < arr_Values.length; i_Values++)
         {
         	Values[i_Values] = Long.parseLong(arr_Values[i_Values]);
         }
         int Q = Integer.parseInt(br.readLine().trim());
         String[] arr_Queries = br.readLine().split(" ");
         int[] Queries = new int[Q];
         for(int i_Queries = 0; i_Queries < arr_Queries.length; i_Queries++)
         {
         	Queries[i_Queries] = Integer.parseInt(arr_Queries[i_Queries]);
         }

         long[] out_ = solve(N, Edges, Values, Q, Queries);

         for(int i_out_ = 0; i_out_ < out_.length; i_out_++)
         {
         	System.out.print(out_[i_out_]);
         	System.out.print("\n");
         }

         wr.close();
         br.close();
    }
    void dfs(int src, int par, List<List<Integer>>adj, List<Long>values, List<Pair<Long, Long>>dp) {
        if(values.get(src) == 1) {
            Long tmp = dp.get(src).getKey();
            dp.set(src, new Pair(tmp+1, dp.get(src).getValue()));
        }
        else {
            Long v = dp.get(src).value;
            dp.set(src, new Pair(dp.get(src).getKey(), v*values.get(src)%mod));
            //dp[src].value %= mod;
        }

        for(Integer child : adj.get(src)) {
            if(child != par) {
                dfs(child, src, adj, values, dp);
                dp.get(src).value *= dp.get(child).getValue();
                dp.get(src).value %= mod;
                dp.get(src).key += dp.get(child).getKey();
            }
        }
    }
    static long[] solve(int N, int[][] Edges, long[] Values, int Q, int[] Queries){
       // Write your code here
        long[] result = {0};
        List<List<Integer>>adj = new ArrayList<>(N+1);
        for(Integer e : edges) {
            adj.get(e.get(0)-1).add(e.get(1)-1);
            adj.get(e.get(1)-1).add(e.get(0)-1);
        }

        List<Pair<Long, Long>>dp = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            dp.add(new Pair(0,1));
        }

        dfs(0, -1, adj, values, dp);
        List<Long>ans = new ArrayList<>(Q);
        for(int i = 0; i < Q; i++) {
            Long a = dp.get(Queries[i]-1).getKey();
            Long b = dp.get(Queries[i]-1).getValue();
        }

        if(b == 1) {
            ans.set(i, a);
        } else {
            if(a <= 1) {
                ans.set(i, (a+b)%mod);
            }
            else {
                ans.get(i, (a*b)%mod);
            }
        }
        return ans.toArray();
    }
    
}