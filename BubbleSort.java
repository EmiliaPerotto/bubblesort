import java.util.*;
import java.io.*;
public class BubbleSort{
  public static void bubble(int[] arr) {
    for (int i = 0; i < arr.length; i++){
      for (int a = 0; a < arr.length; a++){
      if(arr[i] <= arr[a]){
        int val1 = arr[i];
        int val2 = arr[a];
        arr[i] = arr[a];
        arr[a] = val1;
      }
      }
    }  
  } 
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.println("Input filename: ");
    String filename = in.next();
    Scanner fin = new Scanner(new File(filename));
    int lines = fin.nextInt();
    int[] arr = new int[lines];
    int j = 0;
    while(fin.hasNextLine()){
      arr[j] = fin.nextInt();
      j++;
    }
    bubble(arr);
    System.out.print("Bubble sort: ");
    for (int i = 0; i < arr.length; i++){
      if(i != arr.length -1){
        System.out.print(arr[i] +" , ");
      }
      else{
        System.out.print(arr[i]);
    }
    }

}
}