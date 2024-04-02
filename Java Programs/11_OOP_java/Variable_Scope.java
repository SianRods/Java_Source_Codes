import java.util.*;
public class Variable_Scope {
    public static void main(String args[]){
        DiceRoller wow = new DiceRoller();

    }
}
class DiceRoller  {
    Random rand;
    int num;
        DiceRoller(){
            rand =new Random();
           roll();
        }
        void roll(){
            num=rand.nextInt(6)+1;
            System.out.println(num);
        }
}
/**
 * 
 */
// class DiceRoller  {
//     DiceRoller(){
//         Random rand =new Random();
//         int num =;
//     }
//     void roll(){
//         num=rand.nextInt(6)+1;
//         System.out.println(num);
//     }
    
// }
/* When compiling the above code the compiler will throw an error as the scope of the num and rand variable created inside is local to the DiceRoller constructer and hence it cannot be accessed by
roll method --> There are two methods to solve this issue 
1). Either we pass the required variables to roll method;
2). Or we declare the variables num & rand as global  --> Belonging to the class 'DiceRoller'
 * 
 */
// --> Solution First
// class DiceRoller  {
    //     DiceRoller(){
    //         Random rand =new Random();
    //         int num =;
    //     }
    //     void roll(random rand,int num){
    //         num=rand.nextInt(6)+1;
    //         System.out.println(num);
    //     }
    // -->Solution Second
    // class DiceRoller  {
        // Random rand;
        // int num;
        //     DiceRoller(){
        //         Random rand =new Random();
        //        roll();
        //     }
        //     void roll(){
        //         num=rand.nextInt(6)+1;
        //         System.out.println(num);
        //     }
            