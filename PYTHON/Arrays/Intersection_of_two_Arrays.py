"""
Problem No. 349. Intersection of Two Arrays:
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
"""

def intersection(nums1,nums2):
    set1= set(nums1)
    set2= set(nums2)
    
    return list((set1&set2))

nums1 = [4,9,5]
nums2= [9,4,9,8,4]
print(list(set(nums1) & set(nums2)))

"""
Few points to remember:list(set(...)) → converts a set back to a list when the problem expects a list (common in coding problems).
Always convert before applying set operations if your data is a list.
Using sets removes duplicates automatically.
"""



