package com.enesusta.redigendum.components;

import javax.swing.*;
import java.awt.*;

public final class BorderPane extends JPanel {

    public BorderPane() {
        super();
        setLayout(new BorderLayout());
    }

    public final <E extends JComponent> BorderPane addCenter(E e) {
        add(e, BorderLayout.CENTER);
        return this;
    }

    public final <E extends JComponent> BorderPane addPageStart(E e) {
        add(e, BorderLayout.PAGE_START);
        return this;
    }

    public final <E extends JComponent> BorderPane addPageEnd(E e) {
        add(e, BorderLayout.PAGE_END);
        return this;
    }

    public final <E extends JComponent> BorderPane addNorth(E e) {
        add(e, BorderLayout.NORTH);
        return this;
    }

    public final <E extends JComponent> BorderPane addWest(E e) {
        add(e, BorderLayout.WEST);
        return this;
    }

    public final <E extends JComponent> BorderPane addEast(E e) {
        add(e, BorderLayout.EAST);
        return this;
    }

}