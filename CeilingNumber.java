package com.sandeep.kunalSheet;

public class CeilingNumber {
	
	static int ceilingNumber(int[] arr,int target) {
		int start=0,end=arr.length-1,ans=-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]<target) {
				start = mid+1;
			}else {
				ans = mid;
				end = mid;
			}
		}
		return ans!=-1?arr[ans]:-1;
	}
	static int ceilingNumberModified(int[] arr,int target) {
		int start=0,end=arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) return arr[mid];
			else if(arr[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return start>=arr.length?-1:arr[start];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,9,14,16,18};
		
		System.out.println(ceilingNumberModified(arr,28));
	}

}
