package com.yangbingdong.creational.abstractfactory;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class AmdComputerFactory implements ComputerFactory {

    @Override
    public Cpu produceCpu() {
        return new Cpu(Company.AMD);
    }

    @Override
    public GraphicsCard produceGraphicsCard() {
        return new GraphicsCard(Company.AMD);
    }
}
