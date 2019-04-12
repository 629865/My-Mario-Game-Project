/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 629865
 */
public class Blocks extends PowerUps {
    
ImageIcon ii = new ImageIcon(getClass().getResource("/images/QuestionBlock.gif"));
Image IMG = ii.getImage();
ImageIcon ij = new ImageIcon(getClass().getResource("/images/QuestionBlockHit.png"));
Image IMGA = ij.getImage();

      @Override
    public void draw(Graphics g) {
        g.drawImage(IMG, x, y, 33, 33, null);
    }
    
}
