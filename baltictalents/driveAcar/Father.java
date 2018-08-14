package lt.baltictalents.driveAcar;

public class Father extends FamilyMember implements Driver{
    public Father(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return true;
    }

    @Override
    public boolean canRideABike() {
        return true;
    }
}
