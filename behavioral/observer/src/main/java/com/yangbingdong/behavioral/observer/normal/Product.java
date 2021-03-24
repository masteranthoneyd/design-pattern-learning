package com.yangbingdong.behavioral.observer.normal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Product {

    private final List<PriceObserver> priceObservers = new ArrayList<>();

    private Price price = Price.A;

    public void changePrice() {
        Price[] values = Price.values();
        this.price = values[(this.price.ordinal() + 1) % values.length];
        notifyObservers(this.price);
    }

    public void notifyObservers(Price price) {
        priceObservers.forEach(ob -> ob.onPriceChanged(price));
    }

    public void addPriceObserver(PriceObserver priceObserver) {
        priceObservers.add(priceObserver);
    }

    public void removePriceObserver(PriceObserver priceObserver) {
        priceObservers.remove(priceObserver);
    }

    public enum Price {
        A(new BigDecimal("1")),
        B(new BigDecimal("10")),
        C(new BigDecimal("100")),
        D(new BigDecimal("1000")),
        ;

        private final BigDecimal price;

        public BigDecimal getPrice() {
            return price;
        }

        Price(BigDecimal price) {
            this.price = price;
        }
    }

}
