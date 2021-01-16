package com.yangbingdong.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class AbstractFactoryTest {

    @Test
    void testAbstractFactory() {
        ComputerFactory factory = new IntelComputerFactory();
        Cpu cpu = factory.produceCpu();
        assertEquals(cpu.getCompany(), Company.Intel);
        GraphicsCard graphicsCard = factory.produceGraphicsCard();
        assertEquals(graphicsCard.getCompany(), Company.Intel);

        factory = new AmdComputerFactory();
        cpu = factory.produceCpu();
        assertEquals(cpu.getCompany(), Company.AMD);
        graphicsCard = factory.produceGraphicsCard();
        assertEquals(graphicsCard.getCompany(), Company.AMD);

    }

}
