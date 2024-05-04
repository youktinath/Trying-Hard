'''
PROBLEM NAME: Zigzag Conversion
DIFFICULTY: MEDIUM
STATUS: SOLVED
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
'''


def zigzagConvert(s, numRows):
    if numRows <= 1:
        return s
    idx = []
    num2Rows = (2 * numRows - 2)

    def custom_sort_rule(val, ln):
        x = val[1]
        y = val[2]

        return ln * x + y

    for i, el in enumerate(s):
        x = (i % num2Rows) if i % num2Rows < numRows else num2Rows - (i % num2Rows)
        y = (numRows - 1) * (i // num2Rows) if i % num2Rows < numRows else (numRows - 1) * (i // num2Rows) + (i % num2Rows - numRows + 1)

        idx.append((el, x, y))

    # print(idx)
    idx.sort(key=lambda x: custom_sort_rule(x, len(s)))
    # print(idx)
    res = "".join([val[0] for val in idx])

    return res


if __name__ == "__main__":
    # s = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers."
    # s = "AB"
    s = "zsdfsrfgdsjfchmdfgxdfhbyjrumyutyjftcfdnfhcnjumniuui;cyfekgjh.rnmasdvsdrtrsytthtnfhdudrbhytyunymirn" * 1000000
    numRows = 2004
    output = zigzagConvert(s, numRows)
    # expected = "Aaidoeswr,haenme,rtesqecouishtabrateaeaietedrcinwtgnrlloacsoajsmnsoucutoadodiiesplnrmiaodprs,ubroohreunefnttacneedhsmwynihrieto,iheeaalwnefrdutettpntainnwrdvdr."

    print(output)