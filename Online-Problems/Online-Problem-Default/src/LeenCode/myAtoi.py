# PROBLEM NAME: String to Integer (atoi)
# DIFFICULTY: MEDIUM
# STATUS: SOLVED
'''
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

1. Read in and ignore any leading whitespace.
2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
3. Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
6. Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
'''

from collections import deque

def myAtoi(s: str) -> int:
    if s == "":
        return 0
    pre_sign = 1
    digit_list = []
    q = deque()
    for el in s:
        q.append(el)
    while q:
        val = q.popleft()
        if val == " ":
            pass
        else:
            q.appendleft(val)
            break
    # identify next char
    while q:
        val = q.popleft()
        if val == "-":
            pre_sign = -1
            break
        elif val == "+":
            pre_sign = 1
            break
        else:
            break
    if val not in ("+", "-"):
        q.appendleft(val)
    while q:
        val = q.popleft()
        if val in ("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"):
            digit_list.append(val)
        else:
            break
    if not digit_list:
        digit_list.append("0")
    final_number = int("".join(digit_list)) * pre_sign
    if final_number < - 2 ** 31:
        final_number = - 2 ** 31
    if final_number >= 2 ** 31:
        final_number = 2 ** 31 - 1
    
    return final_number


if __name__ == "__main__":
    s = "       -67 hghbk"
    print(myAtoi(s))