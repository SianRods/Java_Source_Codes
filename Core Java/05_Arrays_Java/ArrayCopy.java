import java.util.*;

public class ArrayCopy {
    public static void main(String[] args) {
        // int arrsrc[]= new int[10];
        int arrsrc[] ={1,223,32,32,32,32,32};
        int arrdest[]={12,4212,432,43,656,531,21,};
      
        System.arraycopy(arrsrc, 2, arrdest, 2, 3);
        // output --> {12,4212,32,32,32,531,21};
    }
}
