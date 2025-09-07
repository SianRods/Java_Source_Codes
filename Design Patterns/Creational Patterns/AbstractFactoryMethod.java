// https://refactoring.guru/design-patterns/abstract-factory
//  Intent --> Use the Abstract Factory when your code needs to work with various families of related products,
//  but you don’t want it to depend on the concrete classes of those products—they
//  might be unknown beforehand or you simply want to allow for future extensibility.

// (Chair , Sofa , CoffeeTable) --> Available in (ArtDeco , Vicotorain and Modern)  

interface Chair {
    void paint();

    void price();

    void style();
}

class ModernChair implements Chair {
    @Override
    public void paint() {
        System.out.println("Modern : Red");
    }

    @Override
    public void price() {
        System.out.println("Price of Modern Chair is : 1000");
    }

    @Override
    public void style() {
        System.out.println("Style is Modern");
    }
}

class VictorianChair implements Chair {
    @Override
    public void paint() {
        System.out.println("Vicotrian : Purple ");
    }

    @Override
    public void price() {
        System.out.println("Price of the chair is  : 8000");
    }

    @Override
    public void style() {
        System.out.println("Style is Victorian");
    }
}

class ArtDecoChair implements Chair {
    @Override
    public void paint() {
        System.out.println("Art Deo : Green ");
    }

    @Override
    public void price() {
        System.out.println("Price of the chair is  : 800");
    }

    @Override
    public void style() {
        System.out.println("Style is Art Decor");
    }
}

interface Sofa {
    void paint();
}

class ModernSofa implements Sofa {
    @Override
    public void paint() {
        System.out.println("Modern: Wooden");
    }
}

class VictorinSofa implements Sofa {
    @Override
    public void paint() {
        System.out.println("Vicotrian : Red");
    }
}

class ArtDecoSofa implements Sofa {
    @Override
    public void paint() {
        System.out.println("Halogen Pink");
    }
}

interface CoffeeTable {
    void top();
}

class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void top() {
        System.out.println("Modern : Circular");
    }
}

class VictorinCoffeeTable implements CoffeeTable {
    @Override
    public void top() {
        System.out.println("Victorian : Star");
    }
}

class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void top() {
        System.out.println("Artistic : Square");
    }
}

// Main Interface which the client will use is : FurnitureFactory
// This interface will be implemented by the individual variant specific
// factories
interface FurnitureFactory {
    public Chair createChair();
}

// Now we will create VariantSpcific Factories
class VictorianFurniture implements FurnitureFactory {
    // All Victorian Style Objects will be created here
    public Chair createChair() {
        return new VictorianChair();
    }
}

class ArtDecoFurnitue implements FurnitureFactory {
    public Chair createChair() {
        return new ArtDecoChair();
    }
}

class ModernFurniture implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }
}

// Let's see how the client Side code will work

public class AbstractFactoryMethod {
    static FurnitureFactory ft;

    public static void main(String[] args) {
        // Creating a reference of the instance to towards the desired factory
        ft = new ModernFurniture();
        Chair ch = ft.createChair();
        ch.paint();  // Getting the desired output of the class as required without having to know or change the 
        // background information of the code 

    }

}