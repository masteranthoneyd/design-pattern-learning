package com.yangbingdong.creational.abstractfactory;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class GraphicsCard {

    private final Company company;

    public GraphicsCard(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }

    public void printInfo() {
        System.out.println("This is [" + company + "] graphics card");
    }
}
