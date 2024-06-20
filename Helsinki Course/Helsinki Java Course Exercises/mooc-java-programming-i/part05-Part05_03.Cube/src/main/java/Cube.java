public class Cube {
    private int edgeLength;
    
    // The Constructor should always be public 
    public Cube(int edgeLength){
        this.edgeLength= edgeLength;

    }

    public int volume(){
        int vol = edgeLength*edgeLength*edgeLength;
        return vol;
    }

    @Override
    public String toString(){
        return "The length of the edge is "+edgeLength+" and the volume"+ volume();
    }
}
