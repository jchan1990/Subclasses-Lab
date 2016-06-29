/**
 * Created by Qube on 6/28/16.
 */
public class Animal {
    private int mNumLegs, mTopSpeed;
    private String mName;
    private boolean mIsEndangered;

    public Animal() {
    }

    public Animal(String name, boolean isEndangered, int numLegs, int topSpeed) {
        mName = name;
        mIsEndangered = isEndangered;
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
    }

    public String getName() {
        return mName;
    }

    public boolean getIsEndangered() {
        return mIsEndangered;
    }

    public int getNumLegs() {
        return mNumLegs;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

}
