package lt.baltictalents.driveAcar;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        FamilyMember[] family1 = new FamilyMember[5];
        family1[0] = new Father("Petras", 40);
        family1[1] = new Mother("Petre", 35) {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        };
        family1[2] = new Son("Petriukas", 18);
        family1[3] = new Daughter("Petryte", 3);
        family1[4]= new Dog("Tobis", 2) {
            @Override
            public boolean canDriveACar() {
                return false;
            }

            @Override
            public boolean canRideABike() {
                return false;
            }
        };

        FamilyMember[] family2 = new FamilyMember[4];
        family2[0] = new Father("Jonas", 41);
        family2[1] = new Mother("Janina", 37) {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        };
        family2[2] = new Son("Julius", 19);
        family2[3] = new Dog("Brisius", 2) {
            @Override
            public boolean canDriveACar() {
                return false;
            }

            @Override
            public boolean canRideABike() {
                return false;
            }
        };

        FamilyStats stats = new FamilyStats(family1);
        FamilyStats stats2 = new FamilyStats(family2);
        FamilyStats stats3 = new FamilyStats (family1);
        FamilyStats stats4 = new FamilyStats (family2);
        FamilyStats stats5 = new FamilyStats (family1);
        FamilyStats stats6 = new FamilyStats (family2);
        FamilyStats stats7= new FamilyStats (family1);
        FamilyStats stats8= new FamilyStats (family2);
        FamilyStats stats9= new FamilyStats (family1);
        FamilyStats stats0= new FamilyStats (family2);

        System.out.println("Pirmoje seimoje yra: " + stats.countFamilyMembers() + " nariai");
        System.out.println("Antroje seimoje yra: " + stats2.countFamilyMembers() + " nariai");
        System.out.println("Pirmoje seimoje yra: " + stats3.countDrivers() + " vairuotojai");
        System.out.println("Antroje seimoje yra: " + stats4.countDrivers() + " vairuotojai");
        System.out.println("Pirmoje seimoje yra: " + stats5.canDriveAnything() + " asmenys kurie gali vairuoti viska.");
        System.out.println("Antroje seimoje yra: " + stats6.canDriveAnything() + " asmenys kurie gali vairuoti viska.");
        System.out.println("Pirmoje seimoje vyriausias yra: " + stats7.oldestFamilyMember() + " ");
        System.out.println("Antroje seimoje vyriausias yra: " + stats8.oldestFamilyMember() + " ");
        System.out.println("Pirmoje seimoje vidurkis yra: " + stats9.averageAge() );
        System.out.println("Antroje seimoje vidurkis yra: " + stats0.averageAge() );

    }
}

