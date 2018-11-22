package com.geekerstar.s62;

public class Solution2 {
    public int uniquePaths(int m, int n) {
        int S = m + n - 2;  // 总共的移动次数
        int D = m - 1;      // 向下的移动次数
        long ret = 1;
        for (int i = 1; i <= D; i++) {
            ret = ret * (S - D + i) / i;
        }
        return (int) ret;
    }
}
