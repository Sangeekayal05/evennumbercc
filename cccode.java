import java.util.*;
public class cccode{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:");
int n=sc.nextInt();
System.out.println("Even numbers from 1 to n : ");
for(int i=0;i<n;i++){
 if(i%2==0){
 System.out.print(i+" ");
}
}
}
}