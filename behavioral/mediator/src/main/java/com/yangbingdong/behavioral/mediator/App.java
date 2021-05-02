package com.yangbingdong.behavioral.mediator;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class App {

    public static void main(String[] args) {
        DialogMediator dialogMediator = new DialogMediator(new DropDownBox());
        Selection selection = new Selection(dialogMediator);
        selection.addItem("A");
    }
}
