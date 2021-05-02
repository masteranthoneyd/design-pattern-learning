package com.yangbingdong.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Selection {

    private final DialogMediator dialogMediator;
    private final List<String> selectList;

    public Selection(DialogMediator dialogMediator) {
        this.dialogMediator = dialogMediator;
        selectList = new ArrayList<>();
    }

    public void addItem(String item) {
        selectList.add(item);
        dialogMediator.handleSelectItemAdded();
    }
}
