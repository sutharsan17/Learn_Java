def kadanealgo(arr):
    n=len(arr)
    curr=arr[0]
    maxs=arr[0]
    for i in range(1,n):
        curr=max(arr[i],curr+arr[i])
        maxs=max(maxs,curr)
    return maxs
        
        
        
        
    


arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
print(kadanealgo(arr))

