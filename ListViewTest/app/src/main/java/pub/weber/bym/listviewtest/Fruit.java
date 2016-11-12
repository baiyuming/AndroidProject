package pub.weber.bym.listviewtest;

/**
 * Created by BYM on 2016/11/11.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit (String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
