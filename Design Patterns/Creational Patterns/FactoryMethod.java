// Intent : -
// 1] Use the Factory Method when you don’t know beforehand 
// the exact types and dependencies of the objects your code should work with.
// 2] The Factory Method separates product construction code from the code that actually uses the product. 
// Therefore it’s easier to extend the product construction code independently from the rest of the code.

// https://refactoring.guru/design-patterns/factory-method/java/example


abstract class Logistics {
    // This is the main creator class template which will be implemented in order to
    // add feature Specific Functionality
    // It contains some methods to perform operations
    // It also contains the object creation call to the specific subclass type

    // Note that here the logistics is an abstract class and hence it can't be
    // instantiated
    // we would have to instantiate it using a subclass

    public void outputPackage() {
        // ... other code ...

        Transport t = createTransport(); // Using the factory method here
        t.packageType();
    }

    /**
     * Subclasses will override this method in order to create specific logistics
     * objects.
     */

    // Here the 'createTransport() --> Method will behave like a Factory method' and
    // it's return type should always be same
    // as that of the implemented interface of the instances

    // Each of the subclasses would have to overide this Factory method in order to
    // create their own objects
    // ad their specific object creation
    public abstract Transport createTransport();

}

interface Transport {
    // This is the template for unifying the return type of the object created in
    // the Logistics
    // And each of teh specific logistics dept deliver different type of transport
    // package

    // So basically this interface contains some common operations with respect to
    // each of the transport type
    public void packageType();

    public void packageWeight();
}

class AirtransportInstance implements Transport {
    @Override
    public void packageType() {
        System.out.println("Package Type is Urgent Packages through Airplanes");
    }

    @Override
    public void packageWeight() {
        System.out.println("Package weight is restricted");
    }

}

class ShipInstance implements Transport {
    @Override
    public void packageType() {
        System.out.println("Package Type is Containers !");
    }

    @Override
    public void packageWeight() {
        System.out.println("Package Weights are not restricted ");
    }
}

class Airtransport extends Logistics {

    @Override
    public Transport createTransport() {
        return new AirtransportInstance();
    }

}

class Ship extends Logistics {
    @Override
    public Transport createTransport() {
        return new ShipInstance();
    }
}

// Client Side Implementation of the Factory Method implementation

public class FactoryMethod {
    private static Logistics l;

    public static void main(String[] args) {
        l = new Airtransport();
        l.outputPackage();
    }
}