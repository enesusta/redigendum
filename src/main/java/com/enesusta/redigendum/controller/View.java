package com.enesusta.redigendum.controller;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public interface View {
    JPanel getComponent();
}
