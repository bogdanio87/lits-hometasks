package HomeTask3;

import java.util.*;
public class Task3{
  public static void main(String []args){
    ArrayWorker a = new ArrayWorker();
    a.readArray();
    a.replace(a.getLastMinIndex(),a.avarage());
    a.writeArray();
  }
}
class ArrayWorker{
  int []a;
  int n;
  public ArrayWorker(){
  }
  public void readArray(){
     Scanner sc = new Scanner(System.in);
     System.out.println("4");
     this.n = sc.nextInt();
     this.a = new int[n];
     System.out.println("2,3,4,5");
     for (int i = 0; i < n; i++){
       this.a[i] = sc.nextInt(); 
     }
  }
  public void writeArray(){
	 System.out.println("Result:");
     for (int i = 0; i < this.n; i++){
       System.out.print(this.a[i]+" ");
     }
  }
  public void replace(int index, int value){
    this.a[index] = value;
  }
  public int getLastMinIndex(){
    int imin = 0;
    for (int i = 0; i < this.n; i++)
      if (a[i]<=a[imin])
         imin = i;
    return imin;
  }
  public int avarage(){
    int s = 0;
    for (int i = 0; i < this.n; i++)
      s+=a[i];
    return s/n;
  }
}