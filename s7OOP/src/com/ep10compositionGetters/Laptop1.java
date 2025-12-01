package com.ep10compositionGetters;

public class Laptop1 {
    private float screen;
    private Processor1 processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard1 graphicCard;
    private String opticalDrive;
    private String keyboard;

    public Laptop1() {
        this.screen = 15.6f;
        this.processor = new Processor1();
        this.ram = "16GB";
        this.hardDrive = "2TB";
        this.graphicCard = new GraphicsCard1();
        this.opticalDrive = "Multi layer";
        this.keyboard = "Blacklist";
    }

    public Laptop1(float screen, Processor1 processor, String ram, String hardDrive, GraphicsCard1 graphicCard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicCard = graphicCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    public float getScreen() {
        return screen;
    }

    public Processor1 getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public GraphicsCard1 getGraphicCard() {
        return graphicCard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getKeyboard() {
        return keyboard;
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


