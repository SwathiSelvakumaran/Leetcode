/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return binarySearch(1, n-1);
    }
    
    public int binarySearch(int first, int last){
        int mid = first + (last-first)/2;
        if(first>last){
            return first;
        } 
        if(guess(mid)==0){
            return mid;
        } else if(guess(mid)==1){
            return  binarySearch(mid+1,last);
        } else{
            return binarySearch(first, mid-1);
        }
    }
}