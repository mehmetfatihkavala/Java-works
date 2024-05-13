
package com.swingOrnegi;

import javax.swing.*;


public class Pencere {
    private JFrame frame;
    
    public Pencere(){
        frame = new JFrame();
        JButton button = new JButton("Tikla");
        button.setBounds(130, 130, 130, 40);
        
        frame.add(button);
        
        frame.setSize(400,500);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
        
        
        
    }
}
