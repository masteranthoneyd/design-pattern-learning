package com.yangbingdong.structural.decorator;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 */
public class ExcaliburSaber implements Saber {

    private final Saber decorated;

    public ExcaliburSaber(Saber decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println("Excalibur~!");
    }

    @Override
    public int getAttackPower() {
        return 10000 + decorated.getAttackPower();
    }
}
