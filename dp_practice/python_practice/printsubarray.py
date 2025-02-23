def print_subarray(arr):
    n=len(arr)
    for start in range(n):
        for end in range(start,n):
           print(arr[start:end+1])
arr=[1,23,3]
print_subarray(arr)