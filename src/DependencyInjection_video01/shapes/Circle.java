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
public class Circle implements Shape{

    public Circle() {
        System.out.println("Circle object created");
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    
}
