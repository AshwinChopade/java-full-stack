package com.ep9composition;

public class Laptop {
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicCard;
    private String opticalDrive;
    private String keyboard;

    public Laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.ram = "16GB";
        this.hardDrive = "2TB";
        this.graphicCard = new GraphicsCard();
        this.opticalDrive = "Multi layer";
        this.keyboard = "Blacklist";
    }

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicCard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicCard = graphicCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicCard=" + graphicCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}


