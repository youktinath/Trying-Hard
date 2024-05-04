
# PROBLEM NAME: Regular Expression Matching
# DIFFICULTY: HARD
# STATUS: UNSOLVED
'''
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).
'''


def isMatch(s: str, p: str) -> bool:
    c = {}
    def oparator(j):
        if s[j] != "." and s[j + 1] == "*":
            return s[j], ""
        if s[j] == "*":
            return s[j] + s[j], s[j]
        if s[j] != "*" or s[j] != ".":
            return s[j], s[j]
        if s[j] == ".":
            return "", ""
    def rucc(i, j):
        pass
    
    return rucc(0, 0)


if __name__ == "__main__":
    s = "aa"
    p = "a*"

    print(isMatch(s, p))