/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection_video01.shapes;

/**
 *
 * @author nbhirud
 */
public class Drawing {
    private Shape shape;
    
    public void setShape(Shape s) {
        this.shape = s;
    }
    
    public void drawShape() {
        this.shape.draw();
    }
}
