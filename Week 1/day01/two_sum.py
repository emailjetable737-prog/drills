nums = [3,1,2,5,10]
target = 7
sol = [2, 3] #(2 + 5)

def two_sum(nums):
    values = {}
    for i in range(len(nums)):
        complement = target - nums[i]
        if(complement in values):
            return [values[complement], i]
        values[nums[i]] = i

print(two_sum(nums))