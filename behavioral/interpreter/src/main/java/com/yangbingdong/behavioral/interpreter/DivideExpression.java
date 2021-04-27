package com.yangbingdong.behavioral.interpreter;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class DivideExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public DivideExpression(Expression left, Expression right) {
        if (left.interpreter() == 0) {
            throw new IllegalArgumentException();
        }
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return left.interpreter() / right.interpreter();
    }
}
