
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    // IMPLEMENTING THE ADVANCE METHOD

    public void advance() {
        // ADVANCE BY ONE DAY
        // ASSUME NUMBER OF DAYS --> 30 IN MONTH
        // 30.12.2011
        // NOTE HERE WE HAVE TO USE THE ELSE IF CONDITIONS AND NOT THE IF CONDITIONS
        // USING THE IF CONDITIONS CARRIES ON THE EXECUTION OF THE PROGRAM
        if (day < 30) {
            day = day + 1;
        }

        else if (day >= 30 && month < 12) {
            day = 1;
            this.month = this.month + 1;
        } else if (day >= 30 && month == 12) {
            this.day = 1;
            this.month = 1;
            this.year = this.year + 1;
        }

    }

    // INCREMENTING BY SPECIFIED NUMBER OF DAYS
    public void advance(int howManyDays) {
        for (int i = 1; i <= howManyDays; i++) {
            advance();
        }
    }

    // PASSING OF TIME RETURINING OBJECT AS A OUTPUT OF A METHOD
    // SAMPLE 30.12.2011  -->5 ADVAN

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate result = new SimpleDate(day,month,year);  //DEFINING THE CONSTRUCTOR 
        result.advance(days);
        return result;
    }

}
