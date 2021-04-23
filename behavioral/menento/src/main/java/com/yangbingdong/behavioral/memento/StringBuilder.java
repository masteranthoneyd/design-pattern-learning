package com.yangbingdong.behavioral.memento;

import java.util.LinkedList;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class StringBuilder {

    private LinkedList<InnerStringInputMemento> mementos = new LinkedList<>();

    private String text = "";

    public void append(String s) {
        mementos.push(new InnerStringInputMemento(this.text));
        this.text = this.text + s;
        print();
    }

    public void undo() {
        if (mementos.size() == 0) {
            return;
        }
        restore(mementos.pop());
    }

    public void restore(StringInputMemento memento) {
        InnerStringInputMemento innerMemento = (InnerStringInputMemento) memento;
        this.text = innerMemento.text;
    }

    public void print() {
        System.out.println(this.text);
    }

    private static class InnerStringInputMemento implements StringInputMemento {
        private final String text;

        private InnerStringInputMemento(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello ");
        sb.append("world ");
        sb.undo();
        sb.append("ybd ");
    }

}
