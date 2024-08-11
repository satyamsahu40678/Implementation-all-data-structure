import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    static final int MOD = 1000000007;

    public static int get_ans(int N, int M, int two, List<Integer> A, List<List<Integer>> E, int P, int three, List<List<Integer>> Q) {
        // Build tree representation from edges
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (List<Integer> edge : E) {
            int u = edge.get(0) - 1;
            int v = edge.get(1) - 1;
            adjList.putIfAbsent(u, new ArrayList<>());
            adjList.putIfAbsent(v, new ArrayList<>());
            adjList.get(u).add(v);
        }

        // Precompute longest increasing subsequence (LIS) for each node
        int[] lis = new int[N];
        dfsLIS(A, adjList, lis, 0, -1);

        int sum = 0;
        for (List<Integer> query : Q) {
            int type = query.get(0);
            int u = query.get(1) - 1;
            int v = query.get(2) - 1;

            if (type == 1) {
                // Swap values
                int temp = A.get(u);
                A.set(u, A.get(v));
                A.set(v, temp);

                // Update LIS for affected nodes (parent and children of u and v)
                updateLIS(adjList, lis, u);
                updateLIS(adjList, lis, v);
            } else {
                // Find LIS on path from u to v
                sum = (sum + findLISOnPath(adjList, lis, u, v)) % MOD;
            }
        }

        return sum;
    }

    private static void dfsLIS(List<Integer> A, Map<Integer, List<Integer>> adjList, int[] lis, int u, int parent) {
        lis[u] = 1;
        for (int v : adjList.getOrDefault(u, List.of())) {
            if (v != parent && A.get(v) > A.get(u)) {
                dfsLIS(A, adjList, lis, v, u);
                lis[u] = Math.max(lis[u], lis[v] + 1);
            }
        }
    }

    private static void updateLIS(Map<Integer, List<Integer>> adjList, int[] lis, int node) {
        lis[node] = 1;
        for (int child : adjList.getOrDefault(node, List.of())) {
            if (A.get(child) > A.get(node)) {
                lis[node] = Math.max(lis[node], lis[child] + 1);
            }
        }

        // Update parent LIS if current node contributes to it
        if (adjList.containsKey(node)) {
            updateLIS(adjList, lis, adjList.get(node).get(0));
        }
    }

    private static int findLISOnPath(Map<Integer, List<Integer>> adjList, int[] lis, int u, int v) {
        if (u == v) {
            return lis[u];
        }

        // Find the parent of v in the path from u to v
        int parent = -1;
        for (int p : adjList.get(v)) {
            if (isOnPath(adjList, u, p)) {
                parent = p;
                break;
            }
        }

        return findLISOnPath(adjList, lis, u, parent) + 1;
    }

    private static boolean isOnPath(Map<Integer, List<Integer>> adjList, int u, int v) {
        if (u == v) {
            return true;
        }
        for (int child : adjList.getOrDefault(u, List.of())) {
            if (isOnPath(adjList, child, v)) {
                return true;
            }
        }
        return false;
    }
}





// Input:

// 3
// 2
// 2
// 0
// 1
// 0
// 2 1
// 3 2 
// 1
// 3
// 2 1 3 


// Output:

// 2


// Input:

// 4
// 3
// 2
// 0
// 1
// 1
// 0
// 2 1
// 3 1
// 4 3 
// 2 
// 3 
// 1 1 2 
// 2 2 4


// Output:

// 3