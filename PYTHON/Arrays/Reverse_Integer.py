"""
(Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.)
Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

Here two specific conditions are given:
If it’s negative, keep the minus sign in front.
Example: x = -123 → output -321

If the reversed number goes outside the 32-bit integer range
[-2³¹, 2³¹ - 1] → return 0.
 
"""
def reverse(x):
    sign = -1 if x < 0 else 1
    x = abs(x)
    """
sign = -1 if x < 0 else 1
This line is a shortcut for an if–else statement.
It means:
“If the number x is negative, store -1 in sign, otherwise store 1.”
x = abs(x)
The word abs means absolute value, i.e. remove the negative sign if it exists.
“Remember the sign of the number, then make the number positive so it’s easy to reverse its digits. We’ll add the sign back at the end.”
    """
    
    v = 0
    while x!=0:
        digits = x%10
        x//=10
        v= v*10+ digits

        if v > 2**31 - 1:
                return 0
        
    return sign*v

x= 121
print(reverse(x))
