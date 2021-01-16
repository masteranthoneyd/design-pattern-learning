package com.yangbingdong.creational.abstractfactory;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface ComputerFactory {

    Cpu produceCpu();

    GraphicsCard produceGraphicsCard();

}
