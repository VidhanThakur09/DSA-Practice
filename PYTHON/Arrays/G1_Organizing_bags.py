"""
G-1
You are given an integer array nums (0-indexed), where nums[i] represents the number of fruits in the i-th bag.
In one operation, you may choose any index and increase its value by 1.
Return the minimum number of operations required to make the array strictly increasing.
An array is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1.
Example :-

Input:
nums = [2, 2, 2]

Output:
3

Explanation:
Increase nums[1] once → [2, 3, 2]
Increase nums[2] twice → [2, 3, 4]
Total operations = 3.

"""
def strictlyincreasing(nums) :
    
    count=0
    for i in range(1,len(nums)) :
      #When you start i = 0, the line nums[i-1] becomes nums[-1] (last element of the list). That’s not what you want — it creates a wrong comparison between the first and last element.

#So here, the correct range should be:

        for i in range(1, len(nums)) :
                
                while nums[i-1] >= nums [i] :
                    nums[i]+=1
                    count+=1
        return count
                
nums = [3,10,3,8,2]
print(strictlyincreasing(nums))

"""
Why your code needs nums[i]

Your goal is to make the array strictly increasing.
That requires checking values at consecutive positions, not the index numbers themselves.
Indexes (i) will always increase by definition, but the values (nums[i]) might not.
"""



