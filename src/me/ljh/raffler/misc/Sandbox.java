package me.ljh.raffler.misc;

import me.ljh.raffler.core.*; 

public class Sandbox {
    
    private static void inspectPassage(Passage p) {
        System.out.println(p.getTitle() + " - " + p.getFrequency()); 
    }
    
    public static void main(String[] args) {
        Passage p1 = new Passage("Lesson 1", 3); 
        Passage p2 = new Passage("Lesson 2", 4); 
        
        inspectPassage(p1); 
        inspectPassage(p2); 
    }

}
