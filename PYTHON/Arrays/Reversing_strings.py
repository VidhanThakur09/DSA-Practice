"""
Problem No.- 344:
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

"""
#BRUTE FORCE APPROACH:

def reverseString(s):
        my_list= s
        reversed_list= my_list[::-1]
        if my_list != reversed_list:
          print(f"It's reverse is {reversed_list}")
          
        else:
            print("It's reverse doesn't exist.")

s = ["h","e","l","l","o"]
reverseString(s) 

#OPTIMIZED APPROACH:
def reverseString(s):
     s[::1]= s[::-1]
     print(s)
     return s
s = ["h","e","l","l","o"]
reverseString(s) 

#MORE OPTIMIZED APPROACH
def reverseString(s) :
    a,b = 0,len(s)-1
    while a<b :
          s[a],s[b]=s[b],s[a]
          a= a+1
          b= b-1
    return s    




