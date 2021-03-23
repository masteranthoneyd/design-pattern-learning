package com.yangbingdong.structure.composite.letter;

import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        letters.forEach(this::add);
    }

    public Word(char... chars) {
        for (char c : chars) {
            this.add(new Letter(c));
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
