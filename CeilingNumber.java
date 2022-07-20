package com.sandeep.kunalSheet;

public class CeilingNumber {
	
	static int ceilingNumber(int[] arr,int target) {
		int start=0,end=arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]<target) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		return arr[start];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,9,14,16,18};
		
		System.out.println(ceilingNumber(arr,8));
	}

}
