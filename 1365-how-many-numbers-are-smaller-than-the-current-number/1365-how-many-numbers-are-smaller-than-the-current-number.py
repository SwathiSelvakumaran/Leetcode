class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        arr = [None for i in range(0,len(nums))]
        for index, x in enumerate(nums):
            sum = 0
            for li in nums:                
                if x>li:
                    sum+=1
            arr[index] = sum
        return arr
                
        