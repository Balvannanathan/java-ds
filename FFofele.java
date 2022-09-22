import  java.util.*;

class FFofele{
public static void main(String args[]){

	int  arr[] = {10,20,40,50,20,10,10,40,50};
	int n = arr.length;
	Arrays.sort(arr);
	for(int i=0;i<n;i++){
		int count=1;
		while(i<n-1 && arr[i]==arr[i+1]) {	
			count++;
			i++;
		}
		System.out.println(arr[i]+":"+count);
		count++;
		}
	}
}
