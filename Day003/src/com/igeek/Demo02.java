package com.igeek;


/**
 * 
 * 
 * @author admin
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		int[] arr = {5,7,3,2,5};
		int index = getIndex(arr,7);
		System.out.println(index);
	}
	
	public static int getIndex(int[] arr,int value) {
		
		int index = -1;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==value){
				index = i;
				break;
			}
		}
		return index;
	}
}
