package com.yangbingdong.structure.composite.letter;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Letter extends LetterComposite {

    private final char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(letter);
    }
}
