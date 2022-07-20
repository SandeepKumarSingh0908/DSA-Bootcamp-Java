package com.sandeep.kunalSheet;

public class NextGreatestLetter {
	
	 public static char nextGreatestLetter(char[] letters, char target) {
	        int start=0,end=letters.length-1;
	        if(target >= letters[end]) return letters[0]; //in case of wrap around
	        while(start<=end) {
	        	int mid = start + (end-start)/2;
	        	if(letters[mid] <= target)  start = mid+1;
	        	else if(letters[mid]>target) end = mid-1;
	        }
	        
	        return letters[start];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'c','f','j'};
		System.out.println(nextGreatestLetter(arr,'j'));

	}

}
