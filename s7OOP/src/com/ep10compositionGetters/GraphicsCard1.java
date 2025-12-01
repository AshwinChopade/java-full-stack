package com.ep10compositionGetters;

public class GraphicsCard1 {
    private String brand;
    private int series;
    private int memoryInGB;

    public GraphicsCard1() {
        this.memoryInGB = 6;
        this.brand = "NVdia";
        this.series = 3100;
    }

    public GraphicsCard1(int memoryInGB, String brand, int series) {
        this.memoryInGB = memoryInGB;
        this.brand = brand;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeries() {
        return series;
    }

    public int getMemoryInGB() {
        return memoryInGB;
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
