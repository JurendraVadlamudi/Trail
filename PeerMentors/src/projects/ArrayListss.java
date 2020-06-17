package projects;
import java.io.IOException;
import java.util.*;

public class ArrayListss {
	public static void main(String[] args) 
            throws IOException 
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Size");
int n = sc.nextInt(); 

ArrayList<Integer> arrlist = new ArrayList<Integer>(n); 
System.out.println("Elements");
for (int i=1; i<=n; i++) 
 arrlist.add(sc.nextInt());
int temp;
for (int i = 0; i < n-1; i++) 
    for (int j = 0; j < n-i-1; j++) 
        if (arrlist.get(j) > arrlist.get(j+1)) 
        { 
            temp = arrlist.get(j); 
            arrlist.set(j,arrlist.get(j+1));
            arrlist.set(j+1,temp); 
        } 
System.out.println(arrlist);
sc.close();
} 
	
}
