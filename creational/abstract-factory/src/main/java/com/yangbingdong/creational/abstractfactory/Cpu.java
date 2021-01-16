package com.yangbingdong.creational.abstractfactory;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 */
public class Cpu {

    private final Company company;

    public Cpu(Company company) {
        this.company = company;
    }

    public void printCompany() {
        System.out.println("This is [" + company + "] cpu");
    }

    public Company getCompany() {
        return company;
    }

}
