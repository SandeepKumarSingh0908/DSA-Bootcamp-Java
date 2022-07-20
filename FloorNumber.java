package com.sandeep.kunalSheet;

public class FloorNumber {
	static int floorNumber(int[] arr , int target) {
		int start=0,end=arr.length-1,ans=-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]<target) {
				start = mid;
				ans = mid;
			}
			else end = mid-1;
		}
		
		return ans!=-1?arr[start]:-1;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		System.out.println(floorNumber(arr,1));
	}
}
