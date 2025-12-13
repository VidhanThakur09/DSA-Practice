"""
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 
"""
class Solution(object):
    def findDisappearedNumbers(self, nums):
    
        seen = set()            # to track numbers that appear
        n = len(nums)           # total numbers
        missing = []            # list to store missing numbers

        # Step 1: add all numbers in the array to the set
        for num in nums:
            seen.add(num)

        # Step 2: check numbers from 1 to n
        for i in range(1, n + 1):
            if i not in seen:
                missing.append(i)  # add missing number to the list

        return missing           # return all missing numbers


       
            
