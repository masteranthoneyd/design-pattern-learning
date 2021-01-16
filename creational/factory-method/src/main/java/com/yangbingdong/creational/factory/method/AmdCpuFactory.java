package com.yangbingdong.creational.factory.method;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class AmdCpuFactory implements CpuFactory {

    @Override
    public Cpu produceCpu() {
        return new Cpu(Company.AMD);
    }
}
