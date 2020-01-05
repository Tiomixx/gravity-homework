package a.level.Planets;

import a.level.SolarSystem.Planet;

public class TheUranus extends TheEarth implements Planet {
    public TheUranus(String name, String weight, Double equatorialRadius, String dayDuration, Double yearLength, Integer numberOfSatellites) {
        super(name, weight, equatorialRadius, dayDuration, yearLength, numberOfSatellites);
    }

    @Override
    public double AccelerationOfGravity() {
        return 9.0;
    }
}
