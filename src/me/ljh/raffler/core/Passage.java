package me.ljh.raffler.core;

public class Passage {
    
    private String title; 
    private int frequency; 
    
    // Initialize with no title and unit frequency. 
    public Passage() {
        this("", 1); 
    }
    
    // Initialize with given title and frequency. 
    public Passage(String title, int frequency) {
        this.title = title; 
        this.frequency = frequency; 
    }

    // Get the title
    public String getTitle() {
        return title;
    }

    // Set the title
    public void setTitle(String title) {
        this.title = title;
    }

    // Get the frequency
    public int getFrequency() {
        return frequency;
    }

    // Set the frequency
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    
}
