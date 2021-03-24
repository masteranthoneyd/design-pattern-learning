package com.yangbingdong.behavioral.observer.normal;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class PriceObserverB implements PriceObserver {

    @Override
    public void onPriceChanged(Product.Price price) {
        System.out.println("B receive price changed: " + price);
    }
}
