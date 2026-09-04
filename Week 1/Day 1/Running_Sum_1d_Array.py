class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        other_list = []
        so_far = 0
        for i in range (0, len(nums)):
            so_far += nums[i]
            other_list.append(so_far)
        return other_list