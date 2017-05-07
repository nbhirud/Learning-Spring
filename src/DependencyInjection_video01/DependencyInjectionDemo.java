/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection_video01;

import dependencyinjection_video01.shapes.Drawing;
import dependencyinjection_video01.shapes.Triangle;

/**
 *
 * @author nbhirud
 */
public class DependencyInjectionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drawing dr = new Drawing();
        Triangle myTriangle = new Triangle();
        dr.setShape(myTriangle);
        dr.drawShape();
        
        
    }
    
}
