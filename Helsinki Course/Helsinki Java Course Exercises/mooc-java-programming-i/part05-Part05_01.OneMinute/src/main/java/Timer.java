
public class Timer {
  // Creating Two ClockHands for spcifiying the timer Limit
  public ClockHand seconds = new ClockHand(60);
  public ClockHand milliSeconds = new ClockHand(100);

  public void advance() {

    if(milliSeconds.value()==99){
      seconds.advance();
    }
    milliSeconds.advance();

  }

  public String toString() {
    // Instead of printing the value of the seconds/ ms use the object to be prinited in the 
    // Required Format
    return seconds+":"+milliSeconds;
    
  }

}
