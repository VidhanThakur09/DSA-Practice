"""
Problem No. 9: Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
"""
def isPalindrome(x):
# using the concept of modulo
   if x < 0 :
      return False # as palindrome can't be negative
   
   
   if x > 0 :
   
        a = x # a keeps the original number for comparison later
        v = 0 # v will build the reversed number digit by digit
        i =0
        while x != 0 : 
            v= v*10+(x%10)
            x = x//10 #he / operator performs floating-point division, which returns a float (like 12.1, 1.21, etc.). You need integer division // instead.

        return a==v
   return True

x = 121
print(isPalindrome(x))





