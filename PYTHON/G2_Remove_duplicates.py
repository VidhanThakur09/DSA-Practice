"""
G2: Remove Duplicates from Sorted Collection

Description:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Then return the number of unique elements in nums.
Input:
nums = [1,1,2]

Output:
2
"""


def countDuplicates(nums) :
        seen = set()
        duplicates = set()  # to store numbers that appear more than once
        for num in nums:
            if num not in seen:
                 seen.add(num)
           
        return len(seen) # number of distinct duplicates


nums = [1, 2, 3, 2, 3, 3]
print(countDuplicates(nums))