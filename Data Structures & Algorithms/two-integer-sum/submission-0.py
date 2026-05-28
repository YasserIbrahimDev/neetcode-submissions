class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen  = {}
        for num in range(len(nums)):
            complement = target - nums[num]
            if complement in seen:
                return sorted([num,seen[complement]])
            seen[nums[num]] = num
            
        