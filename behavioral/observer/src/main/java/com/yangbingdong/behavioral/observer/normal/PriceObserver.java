package com.yangbingdong.behavioral.observer.normal;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface PriceObserver {

    void onPriceChanged(Product.Price price);
}
