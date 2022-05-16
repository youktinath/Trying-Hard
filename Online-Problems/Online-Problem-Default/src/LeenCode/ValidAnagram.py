'''
 * Difficulty: EASY
 * Status: SOLVED (SLOW)
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise. 
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly once.
 * 
'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
        p = [3, 4, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        d = dict(zip(a, p))
        mul1 = 1
        for i in s:
            mul1 *= d[i]
        mul2 = 1
        for i in t:
            mul2 *= d[i]
        
        return mul1 == mul2