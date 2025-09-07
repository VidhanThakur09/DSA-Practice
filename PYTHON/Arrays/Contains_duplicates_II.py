"""
Problem No. 219. Contains Duplicate II:
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Explaination of the ques in simpler terms :
you have been given an integers array nums and an integer K.

if you find any duplicate elements and the absolute difference between there indices gives you a value <= k then you can return true.

if you couldn't find such element you can return false.

eg: nums[] = {4, 3, 1, 4} k = 5 indices of 4 is : 0 , 3
the abs value of indices = |0 - 3| = 3
which is <= k so we can return true.

"""

def containsNearbyDuplicate(nums, k):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[i] == nums[j] and abs(i-j) <= k:
                return True
    return False

      


        
            