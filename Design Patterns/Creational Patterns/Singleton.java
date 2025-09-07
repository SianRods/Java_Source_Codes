// Intent of this creational pattern
// 1] A Single class ==> has single instance 
// 2] The single instance of that class should be Accessible Globally 
// This pattern is very famous and has lots of practical use cases

// https://refactoring.guru/design-patterns/singleton

// In case of a multi threaded env we have to apply thread lock properly on the getInstance() method 


class Database {
    // Creating a static variable for the same instane
    static Database instance;
    int connectionId;
    // Convert default construtor to private
    // So new objects can only be created using getInstance() -> method

    private Database(int connectionId) {
        this.connectionId = connectionId;
    }

    public static Database getInstance(int connectionId) {  
        if (Database.instance == null) {
            // If the only instance is null then create a new one
            // else return the old one
            instance = new Database(connectionId);
        }

        return instance;
    }

}