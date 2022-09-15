import java.util.Scanner;

class MaxMin{

public static void main(String args[]){
Scanner inp = new Scanner(System.in);
int n = inp.nextInt();
int arr[] = new int[n];

for(int i=0;i<n;i++){
arr[i] = inp.nextInt();
}


int max =arr[0];
for(int i=1;i<n;i++){
if(max<arr[i]){
max=arr[i];
}
}
System.out.println(max);

int min = arr[0];
for(int i=1;i<n;i++){
if(min>arr[i]){
min=arr[i];
}
}
System.out.println(min);
}
}
