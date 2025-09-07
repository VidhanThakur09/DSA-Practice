"""
if x < 0:
    return False


Negative numbers can't be palindromes (because of the minus sign)
Returns False immediately for any negative input

if x > 0:
    a = x          # Store original number
    v = 0          # Will store the reversed number

a keeps the original number for comparison later
v will build the reversed number digit by digit

while x != 0:
    v = v * 10 + (x % 10)    # Extract last digit and add to reversed number
    x = x // 10              # Remove last digit from x

DRY RUN- Loop iteration 1:

x = 121, v = 0
x % 10 = 121 % 10 = 1 (last digit)
v = 0 * 10 + 1 = 1
x = 121 // 10 = 12
Loop iteration 2:

x = 12, v = 1
x % 10 = 12 % 10 = 2
v = 1 * 10 + 2 = 12
x = 12 // 10 = 1
Loop iteration 3:

x = 1, v = 12
x % 10 = 1 % 10 = 1
v = 12 * 10 + 1 = 121
x = 1 // 10 = 0
Loop ends (since x = 0)

return a == v
a = 121, v = 121
121 == 121 → True
Result: The function returns True, confirming that 121 is a palindrome!

Why % 10 gets the last digit:
When you divide any number by 10:

The quotient tells you all digits except the last one
The remainder tells you the last digit
"""
