package com.example.fanproject.model;

import com.sun.tools.javah.Gen;

import javax.persistence.*;

@Entity
@Table(name = "fanTechnicalDetail")
public class FanTechnicalDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private int airflow;
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


    public int getAirflow() {
        return airflow;
    }

    public void setAirflow(int airflow) {
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

}
