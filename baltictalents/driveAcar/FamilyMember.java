package lt.baltictalents.driveAcar;

public abstract class FamilyMember {
    private final String name;
    private final int age;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract boolean canDriveACar();

    public abstract boolean canRideABike();
}
