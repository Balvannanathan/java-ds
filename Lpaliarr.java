class Lpaliarr{
public static void main(String[] args) {

int arr[]={121,2322,54545,999990};
int n = arr.length;
int num,temp,rem;
int arr1[] = new int[n];
int j=0;
for(int i=0;i<n;i++){
	num = arr[i];
	int rev=0;
	temp = num;
	while(temp!=0){
		rem=temp%10;
		rev = rev*10+rem;
		temp/=10;
		}
	if(rev == num){
		arr1[j]=arr[i];
		j++;
		}
	}
int max=arr1[0];
for(int i=1;i<j;i++){
	if(max<arr1[i]){
		max = arr1[i];
		}
	}
System.out.println(max);
	}
} 
