package com.example.fanproject.model;

import javax.persistence.*;

@Entity
@Table(name = "fan")
public class Fan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String manufacturer;
    @Column
    private String series;
    @Column
    private String model;
    @Column
    private String useType;
    @Column
    private String application;
    @Column
    private String mountingLocation;
    @Column
    private String accessories;
    @Column
    private int modelYear;
    @Column
    private String airflow;
    @Column
    private double maxPower;
    @Column
    private double minPower;
    @Column
    private int minOperatingVoltage;
    @Column
    private int maxOperatingVoltage;
    @Column
    private int maxFanSpeed;
    @Column
    private int minFanSpeed;
    @Column
    private int numberOfFanSpeeds;
    @Column
    private int soundAtMaxSpeed;
    @Column
    private int fanSweepDiameter;
    @Column
    private double maxHeight;
    @Column
    private double minHeight;
    @Column
    private double weight;
    @Column
    private String detail;

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getAirflow() {
        return airflow;
    }

    public void setAirflow(String airflow) {
        this.airflow = airflow;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getMinPower() {
        return minPower;
    }

    public void setMinPower(double minPower) {
        this.minPower = minPower;
    }

    public int getMinOperatingVoltage() {
        return minOperatingVoltage;
    }

    public void setMinOperatingVoltage(int minOperatingVoltage) {
        this.minOperatingVoltage = minOperatingVoltage;
    }

    public int getMaxOperatingVoltage() {
        return maxOperatingVoltage;
    }

    public void setMaxOperatingVoltage(int maxOperatingVoltage) {
        this.maxOperatingVoltage = maxOperatingVoltage;
    }

    public int getMaxFanSpeed() {
        return maxFanSpeed;
    }

    public void setMaxFanSpeed(int maxFanSpeed) {
        this.maxFanSpeed = maxFanSpeed;
    }

    public int getMinFanSpeed() {
        return minFanSpeed;
    }

    public void setMinFanSpeed(int minFanSpeed) {
        this.minFanSpeed = minFanSpeed;
    }

    public int getNumberOfFanSpeeds() {
        return numberOfFanSpeeds;
    }

    public void setNumberOfFanSpeeds(int numberOfFanSpeeds) {
        this.numberOfFanSpeeds = numberOfFanSpeeds;
    }

    public int getSoundAtMaxSpeed() {
        return soundAtMaxSpeed;
    }

    public void setSoundAtMaxSpeed(int soundAtMaxSpeed) {
        this.soundAtMaxSpeed = soundAtMaxSpeed;
    }

    public int getFanSweepDiameter() {
        return fanSweepDiameter;
    }

    public void setFanSweepDiameter(int fanSweepDiameter) {
        this.fanSweepDiameter = fanSweepDiameter;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double minHeight) {
        this.minHeight = minHeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMountingLocation() {
        return mountingLocation;
    }

    public void setMountingLocation(String mountingLocation) {
        this.mountingLocation = mountingLocation;
    }
}
