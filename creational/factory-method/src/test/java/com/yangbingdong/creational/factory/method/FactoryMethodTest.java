package com.yangbingdong.creational.factory.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class FactoryMethodTest {

    @Test
    void testFactoryMethod() {

        CpuFactory cpuFactory = new AmdCpuFactory();
        Cpu cpu = cpuFactory.produceCpu();
        assertEquals(cpu.getCompany(), Company.AMD);
        cpu.printCompany();


        cpuFactory = new IntelCpuFactory();
        cpu = cpuFactory.produceCpu();
        assertEquals(cpu.getCompany(), Company.Intel);
        cpu.printCompany();
    }
}
