package com.yangbingdong.structure.flyweight;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Chessman {

    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Chessman(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chessman chessman = (Chessman) o;

        return id.equals(chessman.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
