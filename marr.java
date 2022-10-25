import java.util.Scanner;

class marr{
public static void main(String[] args){
int arr[]=new int[100];
Scanner inp = new Scanner(System.in);
int n = inp.nextInt();
	for(int i=0;i<100;i++){
		if(arr[i]!=n){
			System.out.print(" "+i); 
			}
	}
}
}