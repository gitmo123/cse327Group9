package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//1. Create the frame.
        JFrame frame = new JFrame("FrameDemo");

//2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//3. Create components and put them in the frame.
//...create emptyLabel...
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

//4. Size the frame.
        frame.pack();

//5. Show it.
        frame.setVisible(true);

    }
}
