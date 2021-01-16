package com.yangbingdong.creational.factory.method;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class IntelCpuFactory implements CpuFactory {

    @Override
    public Cpu produceCpu() {
        return new Cpu(Company.Intel);
    }
}
