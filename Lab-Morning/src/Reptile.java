/**
 * Created by Qube on 6/28/16.
 */
public class Reptile extends Animal {
    private boolean mIsColdBlooded, mHasScales;

    public Reptile() {
        mIsColdBlooded = true;
        mHasScales = true;
    }

    public Reptile(String name, boolean isEndangered, int numLegs, int topSpeed, boolean isColdBlooded, boolean hasScales) {
        super(name, isEndangered, numLegs, topSpeed);
        mIsColdBlooded = isColdBlooded;
        mHasScales = hasScales;
    }


    public boolean getIsColdBlooded() {
        return mIsColdBlooded;
    }

    public boolean getHasScales() {
        return mHasScales;
    }

    public void setIsColdBlooded(boolean isColdBlooded) {
        mIsColdBlooded = isColdBlooded;
    }

    public void setHasScales(boolean hasScales) {
        mHasScales = hasScales;

    }

    public void reptileTraits() {
        System.out.println(getName() + " is a reptile with " + getNumLegs() + " and can run up as fast as "
                + getTopSpeed() + " miles per hour! It is also " + getIsEndangered() + " that it is endangered. " +
                "Did you know it's " + getIsColdBlooded() + " the " + getName() + " is cold blooded. It's also "
                + getHasScales() + " it has scales.");
    }
}
