def maxsum_subarray(arr):
    maxsum= float('-inf')
    n=len(arr)
    for i in range(n):
        sum=0
        for j in range(i,n):
            sum+=arr[j]
            maxsum=max(maxsum,sum)
            
    return maxsum
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
print(maxsum_subarray(arr))
