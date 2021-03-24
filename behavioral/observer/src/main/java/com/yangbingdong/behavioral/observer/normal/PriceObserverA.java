package com.yangbingdong.behavioral.observer.normal;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class PriceObserverA implements PriceObserver {

    @Override
    public void onPriceChanged(Product.Price price) {
        System.out.println("A receive price changed: " + price);
    }
}
