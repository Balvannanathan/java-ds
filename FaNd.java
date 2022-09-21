import java.util.Scanner;
import java.util.*;

class FaNd{
public static void main(String[] args){
	int arr[] = {30,20,10,40,50,60};
	int n = arr.length;
	
	int temp=0;
	for(int i=0;i<n/2;i++){
		for(int j=0;j<n/2;j++){
			if(arr[i]<arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
	for(int i=n/2;i<n;i++){
		for(int j=n/2;j<n;j++){
			if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
		}
	}
}
