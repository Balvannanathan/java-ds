import java.util.*;

class Dpair{
public static void main(String args[]){

int arr[]={4,1,2,3};
Arrays.sort(arr);
int arr1[] = new int[arr.length-1];

for(int i=0;i<arr.length-1;i++){
	int diff = arr[i+1]-arr[i];
	arr1[i] = diff;
	}
int min = arr1[0];
for(int i=0;i<arr1.length;i++){
	if(min>arr1[i]){
		min = arr1[i];
		}
	}

for(int i=0;i<arr.length-1;i++){
	if(arr[i+1]-arr[i]==min){
			System.out.println(arr[i]+" "+arr[i+1]);
			}
	}
}
}
