package com.yangbingdong.structure.composite.letter;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class LetterCompositeTest {

    @Test
    void testPrintLetter() {
        List<Word> words = Arrays.asList(
            new Word('W', 'h', 'e', 'r', 'e'),
            new Word('t', 'h', 'e', 'r', 'e'),
            new Word('i', 's'),
            new Word('a'),
            new Word('w', 'h', 'i', 'p'),
            new Word('t', 'h', 'e', 'r', 'e'),
            new Word('i', 's'),
            new Word('a'),
            new Word('w', 'a', 'y'));
        Sentence sentence = new Sentence(words);
        sentence.print();

        System.out.println();

        words = Arrays.asList(
            new Word('M', 'u', 'c', 'h'),
            new Word('w', 'i', 'n', 'd'),
            new Word('p', 'o', 'u', 'r', 's'),
            new Word('f', 'r', 'o', 'm'),
            new Word('y', 'o', 'u', 'r'),
            new Word('m', 'o', 'u', 't', 'h'));
        sentence = new Sentence(words);
        sentence.print();
    }

}
