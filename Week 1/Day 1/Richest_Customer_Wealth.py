class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        m = len(accounts)
        n = len(accounts[0])
        max, current = 0, 0
        for i in range(0, m):
            for j in range(0, n):
                current += accounts[i][j]
            if(current > max):
                max = current
            current = 0
        return max