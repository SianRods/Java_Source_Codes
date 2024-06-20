
public class Statistics {
    // No need To Store the Numbers Added Only require to store count
    private int count ;
    private int sum;

    public void addNumber(int number){
        // Calling the count Method in this very Method itself so storing the number is not an issue 
      count++;
      sum+=number;
    }

    public int getCount(){
        return count;
    }
    // Default Constructor --. Intialises the vallue to zero

    public int sum(){
        return sum;
    }

    public double average(){
        if(getCount()!=0){
        return (double)sum/getCount();
        }else{
            return 0.0 ;
        }
    }


}
