package com.pluralsight.finance;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(String name, double weight, double marketValue) {
        // Making market value for gold unique by making it equal to the weight x 1000
        super(name, weight * 1000);
        this.weight = weight;
    }
    // Removed redundant getValue method since its implicitly included
    // due to this being class' super class having the method in it
}
