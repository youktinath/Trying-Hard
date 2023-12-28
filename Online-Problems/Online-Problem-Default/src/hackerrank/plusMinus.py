


def plusMinus(arr):
    pos = 0
    neg = 0
    zeros = 0

    for el in arr:
        if el > 0:
            pos += 1
        if el < 0:
            neg += 1
        if el == 0:
            zeros += 1
    
    print(round(pos / len(arr), 6))
    print(round(neg / len(arr), 6))
    print(round(zeros / len(arr), 6))
    
    # return pos / len(arr), neg / len(arr), zeros / len(arr)



if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    # plusMinus(arr)

    print(n, arr)