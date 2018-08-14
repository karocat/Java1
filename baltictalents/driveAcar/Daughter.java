package lt.baltictalents.driveAcar;

public class Daughter extends FamilyMember implements Driver {
    public Daughter(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return false;
    }

    @Override
    public boolean canRideABike() {
        return true;
    }
}
