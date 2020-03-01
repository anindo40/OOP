/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author Anindo
 */
public class box {
    int width;
    int height;
    
    box(int w, int h){
        width = w;
        height = h;
    }
    
    boolean isEqual(box b){
        if(this.width == b.width && this.height == b.height)
            return true;
        else
            return false;
    }
    
}
