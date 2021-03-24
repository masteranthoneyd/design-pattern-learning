package com.yangbingdong.behavioral.observer.normal;

import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class PriceObserverTest {

    @Test
    void testPriceObserver() {

        Product product = new Product();
        product.addPriceObserver(new PriceObserverA());
        product.addPriceObserver(new PriceObserverB());

        product.changePrice();
        product.changePrice();
        product.changePrice();
        product.changePrice();
        product.changePrice();
        product.changePrice();
    }
}
