package a.level.Planets;

import a.level.SolarSystem.Planet;

public class TheJupiter extends TheEarth implements Planet {
    public TheJupiter(String name, String weight, Double equatorialRadius, String dayDuration, Double yearLength, Integer numberOfSatellites) {
        super(name, weight, equatorialRadius, dayDuration, yearLength, numberOfSatellites);
    }

    @Override
    public double AccelerationOfGravity() {
        return 24.8;
    }
}
