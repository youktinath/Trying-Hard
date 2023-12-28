'''
Given five positive integers, find the minimum and maximum values that can be calculated 
by summing exactly four of the five integers. Then print the respective minimum and maximum 
values as a single line of two space-separated long integers.
'''

def miniMaxSum(arr):
    arr.sort()

    print(sum(arr[0:len(arr) - 1]), " ", sum(arr[1:len(arr)]))

    return