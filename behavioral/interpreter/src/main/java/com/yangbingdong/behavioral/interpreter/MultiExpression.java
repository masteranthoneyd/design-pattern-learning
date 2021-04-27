package com.yangbingdong.behavioral.interpreter;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class MultiExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public MultiExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return left.interpreter() * right.interpreter();
    }
}
