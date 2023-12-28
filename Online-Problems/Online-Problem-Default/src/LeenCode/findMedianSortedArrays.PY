# PROBLEM NAME: Median of Two Sorted Arrays
# DIFFICULTY: HARD
# STATUS: SOLVED
'''
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
'''



def findMedianSortedArrays(nums1, nums2) -> float:
    sorted_merge = nums1 + nums2
    print(sorted_merge)
    sorted_merge.sort()

    if len(sorted_merge) % 2 == 1:
        return sorted_merge[int((len(sorted_merge) - 1) / 2)]
    else:
        return (sorted_merge[int(len(sorted_merge) / 2) - 1] + sorted_merge[int(len(sorted_merge) / 2)]) / 2



if __name__ == "__main__":
    l1 = [0, 1, 3]
    l2 = [2, 4, 6]

    print(findMedianSortedArrays(l1, l2))