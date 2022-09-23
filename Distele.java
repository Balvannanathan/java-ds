class Distele{
public static void main(String args[]){

int arr[] ={10,30,40,50,20,10,40};
int n = arr.length;

int count=0;
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		if(arr[i] == arr[j]){
			break;
			}
		if(i == j){
			count++;
			}
		}	
	}

	}
}
