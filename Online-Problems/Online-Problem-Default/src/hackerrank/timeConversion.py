'''
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
'''

def timeConversion(s):
    hr, mt, sc = s.split(":")
    sc, apm = sc[:2], sc[2:]
    print(hr, mt, sc, apm)

    if apm == "AM":
        if hr == "12":
            hr = "00"
    
    if apm == "PM":
        if hr == "12":
            hr = "12"
        else:
            hr = str(int(hr) + 12)

    return ":".join([hr, mt, sc])

if __name__ == "__main__":
    s = "12:01:56AM"
    print(timeConversion(s))