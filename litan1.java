 import java.io.*;
 public class litan1 {public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of subjects ");
    int n=Integer.parseInt(br.readLine());
        float marks[]= new float[n];
    for(int i=0;i<n;i++){
        System.out.println("Enetr the marks of the subjects ");
         marks [i]= Float.parseFloat(br.readLine());
    }
    int total=0;
    for(int i=0;i<n;i++)
    total+=marks[i];
    float percentage= ((float)total/n);
    System.out.println("total marks="+total);
    System.out.println("percentage="+percentage);
    }
}
