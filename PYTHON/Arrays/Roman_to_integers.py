"""
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
"""
"""
Match = Makes code cleaner than long chains of if…elif…else.
Easier to read and organize when you have many conditions.
Lets you handle multiple patterns and even complex data.
"""
def romanToInt(s):
  result = 0
  previous = 0
  current = 0
  for i in range ((len(s))-1,-1,-1):
    
    match s[i] :
       
        case "I" :
            current = 1
        
        
        case 'V' : 
            current = 5
             
        
        case "X" :
            current = 10
            
            
        case "L" :
            current = 50
            
        
        case "C" :
            current = 100
           
        
        case "D" :
            current = 500
            
        
        case "M" :
            current = 1000
        
        
    if previous > current :
        result = result- current
    
    else :
        result=  result + current
    previous = current

  return result
s= 'LV'
print(romanToInt(s))