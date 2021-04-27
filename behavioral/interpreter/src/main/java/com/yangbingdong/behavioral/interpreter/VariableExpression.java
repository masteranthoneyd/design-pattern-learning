package com.yangbingdong.behavioral.interpreter;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class VariableExpression implements Expression {

    private final int val;

    public VariableExpression(int val) {
        this.val = val;
    }

    @Override
    public int interpreter() {
        return val;
    }
}
