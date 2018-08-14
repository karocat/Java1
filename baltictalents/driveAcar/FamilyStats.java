package lt.baltictalents.driveAcar;

public class FamilyStats {
    private FamilyMember[] family;

    public FamilyStats(FamilyMember[] family) {
        this.family = family;


    }
    int countFamilyMembers() {
        return family.length;
    }

    int countDrivers() {
        int count=0;
        for(int i=0; i<family.length; i++){
            if(family[i] instanceof Driver)
                count++;
        }
        return count;
    }

    int canDriveAnything() {

        int mDriver=0;
        for(FamilyMember m : family){
            if(m instanceof Driver) {
                if(((Driver) m).canDriveACar() == true && ((Driver) m).canRideABike()==true) {
                    mDriver++;
                }
            }
        }

        return mDriver;
    }
    int oldestFamilyMember() {
        int oldestFamilyMemberIndex = 0;
        int oldestFamilyMemberAge= family[0].getAge();
        for( int i=0; i<family.length; i++) {
            if(oldestFamilyMemberAge< family[i].getAge() ) {
                oldestFamilyMemberAge = family[i].getAge();
                oldestFamilyMemberIndex= 1;
            }
        }
        return oldestFamilyMemberAge;
    }

    double averageAge() {
        double averageage=0.0;
        double sum=0.0;
        for(int j=0; j<family.length; j++) {
            sum=  sum +family[j].getAge();
        }
        averageage = sum/family.length;
        return averageage;
    }
}

