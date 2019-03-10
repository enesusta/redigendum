package com.enesusta.redigendum.test;

import com.enesusta.redigendum.view.Frame;
import com.enesusta.redigendum.view.PanelGenerator;

public class Main {

    public static void main(String ... args) {

        Frame frame = new Frame("Deneme");
        PanelGenerator gene = new PanelGenerator(300,300);

        frame.setPreferredSize(gene.getDimension());

        frame.add(gene);
        frame.startGui();


    }
}
