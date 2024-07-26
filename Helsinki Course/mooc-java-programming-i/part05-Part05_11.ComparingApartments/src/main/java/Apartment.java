
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;

    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int priceCalled = compared.princePerSquare * compared.squares;
        int priceThis = princePerSquare * squares;
        int result = priceThis - priceCalled;
        if (result < 0) {
            return result * -1;
        } else {
            return result;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int priceThis = princePerSquare * squares;
        int priceCalled = compared.princePerSquare * compared.squares;

        if (priceThis > priceCalled) {
            return true;
        } else {
            return false;
        }
    }

}
