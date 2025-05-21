package com.pluralsight;

import com.pluralsight.finance.Valuable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double netValue = 0;
        for (Valuable asset : assets) {
            netValue += asset.getValue();
        }
        return netValue;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) return null;
        assets.sort(Comparator.comparingDouble(Valuable::getValue));
        return assets.get(assets.size()-1);
//
//        return Collections.max(assets, Comparator.comparingDouble(Valuable::getValue));
//
//        Valuable mostValuable = assets.get(0);
//        for (Valuable asset : assets) {
//            if (asset.getValue() > mostValuable.getValue()) {
//                mostValuable = asset;
//            }
//        }
//        return mostValuable;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) return null;
        assets.sort(Comparator.comparingDouble(Valuable::getValue));
        return assets.get(0);
//
//        return Collections.min(assets, Comparator.comparingDouble(Valuable::getValue));
//
//        Valuable leastValuable = assets.get(0);
//        for (Valuable asset : assets) {
//            if (asset.getValue() < leastValuable.getValue()) {
//                leastValuable = asset;
//            }
//        }
//        return leastValuable;
    }
}
