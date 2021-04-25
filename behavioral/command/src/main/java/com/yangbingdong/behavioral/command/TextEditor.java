package com.yangbingdong.behavioral.command;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class TextEditor {

    private String text = "";

    public String append(String s) {
        this.text = this.text + s;
        print();
        return this.text;
    }

    public void delete(int size) {
        int length = this.text.length();
        if (length < size) {
            throw new IllegalArgumentException();
        }
        this.text = this.text.substring(0, length - size);
        print();
    }

    public void restore(String s) {
        this.text = s;
        print();
    }

    public void print() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }
}
