import java.util.Scanner;

class revarr{
public static void main(String args[]){
Scanner inp = new Scanner(System.in);
int n = inp.nextInt();
int arr[] = new int[n];

for(int i=0;i<n;i++){
arr[i] = inp.nextInt();
}

for(int i=n-1;i>=0 ;i--){
System.out.println(arr[i]);
}
}
}
