package com.hfad.bitsandpizzas;

/**
 * Created by sgbecket on 10/23/2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas={
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi),
            new Pizza("American", R.drawable.restaurant),
            new Pizza("Murca", R.drawable.diavolo),
            new Pizza("Meheecan", R.drawable.funghi)
    };

    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
