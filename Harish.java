import java.util.*;
class Harish{
public static void main(String[] args){
int arr[] = {2,5,2,3,7,5,8};
int k=0;
int arr1[] = new int[arr.length];
for(int i=0;i<arr.length;i++){
	int count =0; 
	for(int j=0;j<arr.length;j++){
		if(arr[i]==arr[j]){
			count++;
		}	
	}
	if(count<2){
		arr1[k]=arr[i];
                k++;
		}
	}
int max=arr1[0];
int min=arr1[0];
//arr1 = {3,7,8}
for(int i=1;i<k;i++){
	if(max<arr1[i]){
		max=arr1[i];
		}
	}
for(int i=0;i<k;i++){
	if(min>arr1[i]){
		min=arr1[i];
			}
	}	
for(int i=1;i<max+1;i++){
	int mul = i*min;
	System.out.println(i+"*"+min+"="+mul);
	}
}
}
