# PROBLEM NAME: Longest Substring Without Repeating Characters
# DIFFICULTY: MEDIUM
# STATUS: SOLVED
'''
Given a string s, find the length of the longest 
substring
 without repeating characters.
'''


def lengthOfLongestSubstring(s):
    if len(s) == 0:
        return 0
    if len(s) == 1:
        return 1
    
    l = 0
    count_list = []
    carSet = set()

    while l < len(s):
        for i in range(l, len(s)):
            if s[i] not in carSet:
                carSet.add(s[i])
            else:
                count_list.append(len(carSet))
                carSet = set()
                break
        l += 1
    
    return max(count_list)


if __name__ == "__main__":
    s = "c"
    print(lengthOfLongestSubstring(s))
            