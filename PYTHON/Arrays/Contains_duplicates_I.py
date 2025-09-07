"""
Problem No. 217. Contains Duplicate:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example-
Input: nums = [1,2,3,1]
Output: true
"""
def containsDuplicate(nums):
    nums.sort()
    for i in range(1, len(nums)):
        if nums[i] == nums[i-1]:
            return True
    return False

nums= [1,2,3,1]
print(containsDuplicate(nums))

