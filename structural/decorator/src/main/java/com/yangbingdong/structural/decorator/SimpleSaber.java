package com.yangbingdong.structural.decorator;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class SimpleSaber implements Saber {

    @Override
    public void attack() {
        System.out.println("Simple attack");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }
}
