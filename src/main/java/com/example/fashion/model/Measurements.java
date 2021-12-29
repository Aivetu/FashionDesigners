package com.example.fashion.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "measurements")
public class Measurements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dateOfMeasurement;
    private double fullLength;
    private double bust;
    private double underBust;
    private double shoulderToUnderBust;
    private double nippleToNipple;
    private double waist;
    private double hip;
    private double shoulder;
    private double armLength;
    private double blouseLength;
    private double skirtLength;
    private double armWidth;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDateOfMeasurement() {
        return dateOfMeasurement;
    }
    public void setDateOfMeasurement(LocalDate dateOfMeasurement) {
        this.dateOfMeasurement = dateOfMeasurement;
    }
    public double getFullLength() {
        return fullLength;
    }
    public void setFullLength(double fullLength) {
        this.fullLength = fullLength;
    }
    public double getBust() {
        return bust;
    }
    public void setBust(double bust) {
        this.bust = bust;
    }
    public double getUnderBust() {
        return underBust;
    }
    public void setUnderBust(double underBust) {
        this.underBust = underBust;
    }
    public double getShoulderToUnderBust() {
        return shoulderToUnderBust;
    }
    public void setShoulderToUnderBust(double shoulderToUnderBust) {
        this.shoulderToUnderBust = shoulderToUnderBust;
    }
    public double getNippleToNipple() {
        return nippleToNipple;
    }
    public void setNippleToNipple(double nippleToNipple) {
        this.nippleToNipple = nippleToNipple;
    }
    public double getWaist() {
        return waist;
    }
    public void setWaist(double waist) {
        this.waist = waist;
    }
    public double getHip() {
        return hip;
    }
    public void setHip(double hip) {
        this.hip = hip;
    }
    public double getShoulder() {
        return shoulder;
    }
    public void setShoulder(double shoulder) {
        this.shoulder = shoulder;
    }
    public double getArmLength() {
        return armLength;
    }
    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }
    public double getBlouseLength() {
        return blouseLength;
    }
    public void setBlouseLength(double blouseLength) {
        this.blouseLength = blouseLength;
    }
    public double getSkirtLength() {
        return skirtLength;
    }
    public void setSkirtLength(double skirtLength) {
        this.skirtLength = skirtLength;
    }
    public double getArmWidth() {
        return armWidth;
    }
    public void setArmWidth(double armWidth) {
        this.armWidth = armWidth;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
