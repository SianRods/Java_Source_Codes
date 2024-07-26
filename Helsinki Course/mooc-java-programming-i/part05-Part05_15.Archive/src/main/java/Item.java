// CREATING AN ITEM CLASS WHICH WILL HANDLE EACH OBJECT OF THE ARCHIVES HAVING ITS 
// ATTRIBUTES AS IDENTIFIER AND NAME 

import java.util.ArrayList;

public class Item {
    private String id;
    private String name;

    public Item(String NAME, String IDENTIFIER) {
        this.id = IDENTIFIER;
        this.name = NAME;
    }

    public boolean equals(Item comparItem) {
        // ARE EQUAL IFF IF THEIR IDENTIFIERS ARE THE SAME ;
        if (this.id.equals(comparItem.id)) {
            return true;
        } else {
            return false;
        }
    }

    // WRITING A METHOD TO RETURN THE FIRST SIMILAR OBJECT FOUND IN THE ARRAYLIST
    // CANT DO AS MENTIONED ABOVE AS THERE WILL AN EVENT WHERE OBJECT TO BE COMPARED
    // WILLL BE ON THE LIST PASSED
    // HENCE WE HAVE TO NECESSARILY IMPLEMENT THE PRINITNG LOGIC IN THE MAIN

    @Override
    public String toString() {
        return id + ": " + name;
    }
}