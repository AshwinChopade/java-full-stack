package com.ep9composition;

public class GraphicsCard {
    private String brand;
    private int series;
    private int memoryInGB;

    public GraphicsCard() {
        this.memoryInGB = 6;
        this.brand = "NVdia";
        this.series = 3100;
    }

    public GraphicsCard(int memoryInGB, String brand, int series) {
        this.memoryInGB = memoryInGB;
        this.brand = brand;
        this.series = series;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memoryInGB=" + memoryInGB +
                '}';
    }
}
