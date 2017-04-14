package swakez.github.io.exploreallahabad;

/**
 * Created by swati on 15/04/2017.
 */

public class DataModel {

    String mName;
    String mPlace;

    public DataModel(String name,String place){
        mName = name;
        mPlace = place;
    }

    public String getName(){
        return mName;
    }

    public String getPlace(){
        return mPlace;
    }
}
