package lt.baltictalents.driveAcar;

import java.sql.Driver;

public abstract class Mother extends FamilyMember implements Driver {
    public Mother(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return false;
    }

    @Override
    public boolean canRideABike() {
        return false;
    }
}
