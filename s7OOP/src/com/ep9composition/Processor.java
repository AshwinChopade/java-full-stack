package com.ep9composition;

public class Processor {
    private String brand;
    private int generation;
    private String series;
    private int cores;
    private int threads;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;


    public Processor() {
        this.brand = "Intel";
        this.generation = 11;
        this.threads = 4;
        this.series = "11000u";
        this.cores = 4;
        this.frequency = "2.36Ghz";
        this.minFrequency = "2.4Ghz";
        this.maxFrequency = "2.1Ghz";

    }

    public Processor(String brand, int generation, int threads, String seriesLabel, String series, int cores, String cache, String frequency, String minFrequency) {
        this.brand = brand;
        this.generation = generation;
        this.threads = threads;
        this.series = series;
        this.cores = cores;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;

    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", generation=" + generation +
                ", series='" + series + '\'' +
                ", cores=" + cores +
                ", threads=" + threads +
                ", frequency='" + frequency + '\'' +
                ", minFrequency='" + minFrequency + '\'' +
                ", maxFrequency='" + maxFrequency + '\'' +
                '}';
    }
}
