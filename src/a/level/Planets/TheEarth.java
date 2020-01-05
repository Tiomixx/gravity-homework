package a.level.Planets;

import a.level.SolarSystem.Planet;

public class TheEarth implements Planet {
    private String name;
    private String weight;
    private Double equatorialRadius;
    private String dayDuration;
    private Double yearLength;
    private Integer numberOfSatellites;

    public TheEarth(String name,String weight,Double equatorialRadius,String dayDuration,Double yearLength,Integer numberOfSatellites){
        this.name = name;
        this.weight = weight;
        this.equatorialRadius = equatorialRadius;
        this.dayDuration = dayDuration;
        this.yearLength = yearLength;
        this.numberOfSatellites = numberOfSatellites;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getEquatorialRadius() {
        return equatorialRadius;
    }

    public void setEquatorialRadius(Double equatorialRadius) {
        this.equatorialRadius = equatorialRadius;
    }

    public String getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(String dayDuration) {
        this.dayDuration = dayDuration;
    }

    public Double getYearLength() {
        return yearLength;
    }

    public void setYearLength(Double yearLength) {
        this.yearLength = yearLength;
    }

    public Integer getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(Integer numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public double AccelerationOfGravity() {
        return 9.87;
    }
}
