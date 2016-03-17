package BugfixingLeaderSorted;
/**
 *
 * @author Clyde
 */
class Solution {
    int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        int pos = (n + 1) / 2;
        int candidate = L[pos];
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
//         if (count > pos)
        if (n%2==0 ? count > pos : count > pos -1) // <===========
            return candidate;
        return (-1);
    }
}