class Maxscale{
public static void main(String args[]){

int arr1[] = {50,40,20,10,30};
int arr2[] = {2,4,1,3,5};
int n1=arr1.length;
int n2=arr2.length;
int temp;

for(int i=0;i<n1;i++){
	for(int j=0;j<n1;j++){
		if(arr1[i]<arr1[j]){
			temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
			}
		}
	}	
for(int i=0;i<n2;i++){
	for(int j=0;j<n2;j++){
		if(arr2[i]<arr2[j]){
			temp=arr2[i];
			arr2[i]=arr2[j];
			arr2[j]=temp;
			}
		}
	}
int mul=0;
for(int i=0;i<n1;i++){
	mul=mul+(arr1[i]*arr2[i]);
	}
System.out.println(mul);
}
}
