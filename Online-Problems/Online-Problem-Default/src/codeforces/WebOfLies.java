/* Difficulty: UNKNOWN
 * Status: UNSOLVED
 * Link: https://codeforces.com/contest/1548/problem/A
 * There are n nobles, numbered from 1 to n. Noble i has a power of i. 
 * There are also m "friendships". A friendship between nobles a and b is always mutual.
 * 
 * A noble is defined to be vulnerable if both of the following conditions are satisfied:
 * 
 * the noble has at least one friend, and
 * all of that noble's friends have a higher power.
 * 
 * You will have to process the following three types of queries.
 * 
 * Add a friendship between nobles u and v.
 * Remove a friendship between nobles u and v.
 * Calculate the answer to the following process.
 * 
 * The process: all vulnerable nobles are simultaneously killed, 
 * and all their friendships end. Then, it is possible that new nobles become vulnerable. 
 * The process repeats itself until no nobles are vulnerable. It can be proven 
 * that the process will end in finite time. After the process is complete, you need 
 * to calculate the number of remaining nobles.
 * 
 * Note that the results of the process are not carried over between queries, that is,
 * every process starts with all nobles being alive!
 */
package codeforces;

public class WebOfLies {
	
}
