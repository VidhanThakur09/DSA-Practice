"""
Problem Number 485 - Maximum Consecutive Ones:
Given a binary array nums, return the maximum number of consecutive 1's in the array.

"""
def findMaxConsecutiveOnes(self, nums):
        max_count=0
        current_count=0 

        for i in range (0,len(nums)):
            if nums[i] == 1:
                current_count += 1
                max_count= max(max_count, current_count)

            else:
                current_count= 0
        return max_count
             
"""
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.           
"""

        