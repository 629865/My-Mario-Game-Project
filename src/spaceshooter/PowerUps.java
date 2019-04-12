/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;
import java.awt.event.KeyEvent;


/**
 *
 * @author jword
 */
public abstract class PowerUps {
    private static int hp;
    private static int coinCount;
    private boolean hasFireFlower;
    private boolean hasSuperLeaf;
    private boolean hasPowerStar;

    //Fields
    static int x;
    static int y;
    static int vx;
    static int vy;
    static int size;
    

    //Constructor
    public PowerUps(int x, int y) {
        this.x = x;
        this.y = y;
        size = 50;
    }

    public PowerUps() {
        this(100,100);
    }
    
    public abstract void draw(Graphics g);
    
    public void update() {
        
    }
    
    public void gravity() {
        
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        PowerUps.hp = hp;
    }

    public static int getCoinCount() {
        return coinCount;
    }

    public static void setCoinCount(int coinCount) {
        PowerUps.coinCount = coinCount;
    }

    public boolean isHasFireFlower() {
        return hasFireFlower;
    }

    public void setHasFireFlower(boolean hasFireFlower) {
        this.hasFireFlower = hasFireFlower;
    }

    public boolean isHasSuperLeaf() {
        return hasSuperLeaf;
    }

    public void setHasSuperLeaf(boolean hasSuperLeaf) {
        this.hasSuperLeaf = hasSuperLeaf;
    }

    public boolean isHasPowerStar() {
        return hasPowerStar;
    }

    public void setHasPowerStar(boolean hasPowerStar) {
        this.hasPowerStar = hasPowerStar;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        PowerUps.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        PowerUps.y = y;
    }

    public static int getVx() {
        return vx;
    }

    public static void setVx(int vx) {
        PowerUps.vx = vx;
    }

    public static int getVy() {
        return vy;
    }

    public static void setVy(int vy) {
        PowerUps.vy = vy;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        PowerUps.size = size;
    }
    
}
