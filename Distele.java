class Distele{
public static void main(String args[]){

int arr[] ={10,30,40,50,20,10,40};
int n = arr.length;

int count=1;
for(int i=1;i<n;i++){
	int j=0;
	for(j=0;j<i;j++){
		if(arr[i] == arr[j])
			break;
		}
	if(i == j){
		count++;
		}
	}
	System.out.println(count);
	}
}
