"""
35. Search Insert Position:
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
Question in simpler words: You are given:
A sorted array of numbers (ascending order). Example: [1, 3, 5, 6]
A target number. Example: 5

Your task:
If the target number is already in the array, return its index.
If it is not in the array, return the index where it should be inserted so the array stays sorted.
"""
def searchInsert(nums, target):
    i = 0
    target = 5
    for i in range  (0,len(nums)):
       if nums[i] >= target:
           return i
    return len(nums)


"""
Array: [1, 3, 5, 6]
Target: 7
| i | nums\[i] | nums\[i] >= 7? |
| - | -------- | -------------- |
| 0 | 1        | No             |
| 1 | 3        | No             |
| 2 | 5        | No             |
| 3 | 6        | No             |
So returning len(nums) is a shortcut for “insert at the end of the array” when the target is bigger than all numbers.
"""

    