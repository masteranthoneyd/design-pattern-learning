package com.yangbingdong.behavioral.interpreter;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class App {

    public static void main(String[] args) {
        // 1 + 2 - 3 * 4 / 2 = -3
        Expression s1 = new AddExpression(new VariableExpression(1), new VariableExpression(2));
        Expression s2 = new MultiExpression(new VariableExpression(3), new VariableExpression(4));
        Expression s3 = new DivideExpression(s2, new VariableExpression(2));
        Expression expression = new SubtractExpression(s1, s3);
        System.out.println(expression.interpreter());
    }
}
