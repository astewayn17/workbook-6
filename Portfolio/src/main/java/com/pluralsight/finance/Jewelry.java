package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        // Making market value for gold unique by making it equal to the karat x 100
        super(name, karat * 100);
        this.karat = karat;
    }
    // Removed redundant getValue method since its implicitly included
    // due to this being class' super class having the method in it
}
