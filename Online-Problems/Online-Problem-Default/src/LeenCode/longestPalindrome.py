# PROBLEM NAME: Longest Palindromic Substring
# DIFFICULTY: MEDIUM
# STATUS: UNSOLVED
'''
Given a string s, return the longest 
palindromic substring
 in s.
'''
 
from collections import deque


def longestPalindrome(s):
    res = ""
    resLen = 0
    
    for i in range(len(s)):
        prev, nxt = i, i
        while nxt < len(s) and prev >= 0 and s[prev] == s[nxt]:
            if (nxt - prev + 1) > resLen:
                res = s[prev:nxt+1]
                resLen = nxt - prev + 1
            nxt += 1
            prev -= 1

            # print("odd: ", prev, nxt)
        
        prev, nxt = i, i + 1
        while nxt < len(s) and prev >= 0 and s[prev] == s[nxt]:
            if (nxt - prev + 1) > resLen:
                res = s[prev:nxt+1]
                resLen = nxt - prev + 1
            nxt += 1
            prev -= 1

            # print("even: ", prev, nxt)
    
    return res


if __name__ == "__main__":
    s = "bbab"
    print(longestPalindrome(s))