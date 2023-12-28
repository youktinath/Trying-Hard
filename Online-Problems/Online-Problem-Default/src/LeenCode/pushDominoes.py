'''
PROBLEM NAME: Push Dominoes
DIFFICULTY: MEDIUM
STATUS: SOLVED
There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.

After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.

When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.

For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.

You are given a string dominoes representing the initial state where:

dominoes[i] = 'L', if the ith domino has been pushed to the left,
dominoes[i] = 'R', if the ith domino has been pushed to the right, and
dominoes[i] = '.', if the ith domino has not been pushed.
Return a string representing the final state.
'''



from collections import deque


def pushDominoes(s):
    dom = list(s)
    q = deque()

    for i, d in enumerate(dom):
        if d != ".":
            q.append((i, d))

    while q:
        i, d = q.popleft()
        # print(i, d)

        if d == "L":
            if i > 0 and dom[i - 1] == ".":
                q.append((i - 1, "L"))
                dom[i - 1] = "L"
        elif d == "R":
            if i + 1 < len(dom) and dom[i + 1] == ".":
                if i + 2 < len(dom) and dom[i + 2] == "L":
                    q.popleft()
                else:
                    q.append((i + 1, "R"))
                    dom[i + 1] = "R"
    
    return "".join(dom)

if __name__ == "__main__":
    s = ".L.RR..LL..R"
    print(pushDominoes(s))