"""
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 """

def plus_one(x):
    for i in range (len(x)-1,-1,-1):
        if x[i]<9:
            x[i]=x[i]+1 
            return x
        else:
           x[i]=0

    return [1] + x
  
x= [9,9]
print(plus_one(x))  
