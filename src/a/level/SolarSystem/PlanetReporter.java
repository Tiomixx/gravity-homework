package a.level.SolarSystem;

        import a.level.Planets.*;

public class PlanetReporter {
    public static void main(String[] args) {
        TheEarth Earth = new TheEarth("The Earth","5,974*10^24 KG", 6378.004,"24h 56min 4.099sec",
                365.2, 1);

        TheMars Mars = new TheMars("The Mars","6.4*10^23 KG", 3397.0, "24h 39min 35sec",
                687.0, 2);
        TheMercury Mercury = new TheMercury("The Mercury","3.285*10^23 KG", 2439.7,"59 days", 88.0, 0 );

        TheJupiter Jupiter = new TheJupiter("The Jupiter", "1.8986 * 10^27 KG", 71492.0, "9.93 hours", 11.86, 70);

        TheSaturn Saturn = new TheSaturn("The Saturn", "5.683 * 10^26 KG",60268.0, "10 hours 15 min",29.5,63);

        TheUranus Uranus = new TheUranus("The Uranus", "8.69 * 10^25 KG",25559.0, "17 hours 15 min",84.5, 27);

        TheVenus Venus = new TheVenus("The Venus", "4.87 * 10^24 KG", 6051.0,"244 days", 225.0, 0);

        System.out.println("Planet name: " + Earth.getName() + ";");
        System.out.println("Weight: " + Earth.getWeight() + ";");
        System.out.println("Equatorial radius: " + Earth.getEquatorialRadius() + " KM;");
        System.out.println("Day duration: " + Earth.getDayDuration() + ";");
        System.out.println("Year length: " + Earth.getYearLength() + " days;");
        System.out.println("Number of satellites: " + Earth.getNumberOfSatellites() + ";");
        System.out.println("Acceleration of gravity: " + Earth.AccelerationOfGravity() + "m/sec^2;");

        System.out.println("----------------------------------");

        System.out.println("Planet name: " + Mars.getName() + ";");
        System.out.println("Weight: " + Mars.getWeight() + ";");
        System.out.println("Equatorial radius: " + Mars.getEquatorialRadius() + " KM;");
        System.out.println("Day duration: " + Mars.getDayDuration() + ";");
        System.out.println("Year length: " + Mars.getYearLength() + " days;");
        System.out.println("Number of satellites: " + Mars.getNumberOfSatellites() + ";");
        System.out.println("AccelerationOfGravity: " + Mars.AccelerationOfGravity() + " m/sec^2;");

        System.out.println("----------------------------------");

        System.out.println("Planet name: " + Jupiter.getName() + ";");
        System.out.println("Weight: " + Jupiter.getWeight() + ";");
        System.out.println("Equatorial radius: " + Jupiter.getEquatorialRadius() + " KM;");
        System.out.println("Day duration: " + Jupiter.getDayDuration() + ";");
        System.out.println("Year length: " + Jupiter.getYearLength() + " days;");
        System.out.println("Number of satellites: " + Jupiter.getNumberOfSatellites() + ";");
        System.out.println("AccelerationOfGravity: " + Jupiter.AccelerationOfGravity() + " m/sec^2;");

        System.out.println("----------------------------------");

        System.out.println("Planet name: " + Venus.getName() + ";");
        System.out.println("Weight: " + Venus.getWeight() + ";");
        System.out.println("Equatorial radius: " + Venus.getEquatorialRadius() + " KM;");
        System.out.println("Day duration: " + Venus.getDayDuration() + ";");
        System.out.println("Year length: " + Venus.getYearLength() + " days;");
        System.out.println("Number of satellites: " + Venus.getNumberOfSatellites() + ";");
        System.out.println("AccelerationOfGravity: " + Venus.AccelerationOfGravity() + " m/sec^2;");

        System.out.println("----------------------------------");

        System.out.println("Planet name: " + Mercury.getName() + ";");
        System.out.println("Weight: " + Mercury.getWeight() + ";");
        System.out.println("Equatorial radius: " + Mercury.getEquatorialRadius() + " KM;");
        System.out.println("Day duration: " + Mercury.getDayDuration() + ";");
        System.out.println("Year length: " + Mercury.getYearLength() + " days;");
        System.out.println("Number of satellites: " + Mercury.getNumberOfSatellites() + ";");
        System.out.println("AccelerationOfGravity: " + Mercury.AccelerationOfGravity() + " m/sec^2;");

        System.out.println("----------------------------------");

        System.out.println("Planet name: " + Saturn.getName() + ";");
        System.out.println("Weight: " + Saturn.getWeight() + ";");
        System.out.println("Equatorial radius: " + Saturn.getEquatorialRadius() + " KM;");
        System.out.println("Day duration: " + Saturn.getDayDuration() + ";");
        System.out.println("Year length: " + Saturn.getYearLength() + " days;");
        System.out.println("Number of satellites: " + Saturn.getNumberOfSatellites() + ";");
        System.out.println("AccelerationOfGravity: " + Saturn.AccelerationOfGravity() + " m/sec^2;");

        System.out.println("----------------------------------");

        System.out.println("Planet name: " + Uranus.getName() + ";");
        System.out.println("Weight: " + Uranus.getWeight() + ";");
        System.out.println("Equatorial radius: " + Uranus.getEquatorialRadius() + " KM;");
        System.out.println("Day duration: " + Uranus.getDayDuration() + ";");
        System.out.println("Year length: " + Uranus.getYearLength() + " days;");
        System.out.println("Number of satellites: " + Uranus.getNumberOfSatellites() + ";");
        System.out.println("AccelerationOfGravity: " + Uranus.AccelerationOfGravity() + " m/sec^2;");

    }

}
