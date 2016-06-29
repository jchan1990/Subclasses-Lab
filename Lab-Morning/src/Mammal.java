/**
 * Created by Qube on 6/28/16.
 */
public class Mammal extends Animal {
    private boolean mIsWarmBlooded, mHasFur;

    public Mammal() {
        super();
        mIsWarmBlooded = true;
        mHasFur = true;
    }

    public Mammal(String name, boolean isEndangered, int numLegs, int topSpeed, boolean isWarmBlooded, boolean hasFur) {
        super(name, isEndangered, numLegs, topSpeed);
        mIsWarmBlooded = isWarmBlooded;
        mHasFur = hasFur;
    }

    public boolean getIsWarmblooded() {
        return mIsWarmBlooded;
    }

    public boolean getHasFur() {
        return mHasFur;
    }

    public void setIsWarmBlooded(boolean isWarmBlooded) {
        mIsWarmBlooded = isWarmBlooded;
    }

    public void setHasFur(boolean hasFur) {
        mHasFur = hasFur;

    }

    public void mammalTraits() {
        System.out.println(getName() + " is a mammal with " + getNumLegs() + " and can run up as fast as "
                + getTopSpeed() + " miles per hour! It is also " + getIsEndangered() + " that it is endangered. " +
                "Did you know it's " + getIsWarmblooded() + " the " + getName() + " is warm blooded. It's also "
                + getHasFur() + " it has fur.");
    }

}