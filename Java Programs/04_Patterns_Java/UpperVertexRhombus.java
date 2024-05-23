import java.util.*;
public class UpperVertexRhombus {
	public static void main (String args[]){
		for(int i=0;i<7;i++){

			for(int j=4;j>(i+1);j--){
				System.out.print(" ");
			}

			for(int k=0;k<(i+1);k++){
				System.out.print("* ");
			}
			System.out.println("");

			if(i>4/2){
				
			for(int j=7;j>(i+3);j--){
				System.out.print(" ");
			}

			for(int k=i;k>0;k--){
				System.out.print("* ");
			}
			System.out.println("");

			}


		}
	}
}



