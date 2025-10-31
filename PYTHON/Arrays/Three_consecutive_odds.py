"""
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
Input: arr = [2,6,4,1]
Output: false



Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true

"""
def threeConsecutiveOdds(arr):
        if len(arr) < 3:
         return False
        
        for i in range(len(arr)-2):
            if arr[i]%2!=0 and arr[i+1]%2!=0 and arr[i+2]%2!=0:
                print(arr[i],arr[i+1], arr[i+2])
                return True
                          
            
        return False

arr = [1,2,34,3,4,5,7,23,12]
print(threeConsecutiveOdds(arr))