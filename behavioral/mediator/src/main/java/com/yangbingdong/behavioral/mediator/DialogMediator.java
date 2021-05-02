package com.yangbingdong.behavioral.mediator;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class DialogMediator {

    private final DropDownBox dropDownBox;

    public DialogMediator(DropDownBox dropDownBox) {
        this.dropDownBox = dropDownBox;
    }

    public void handleSelectItemAdded() {
        dropDownBox.incrLength();
    }
}
