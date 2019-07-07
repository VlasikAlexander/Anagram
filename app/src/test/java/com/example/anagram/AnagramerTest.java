package com.example.anagram;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AnagramerTest {
    private Anagramer anagramer;

    @Before
    public void setUp() {
        anagramer = new Anagramer();
    }

    @Test
    public void anagramIt_allLettersOneBLock() {
        assertThat("olleh", is(anagramer.anagramIt( "hello")));
    }

    @Test
    public void anagramIt_allLettersTwoBlocks() {
        assertThat("olleh sdneirf", is(anagramer.anagramIt( "hello friends")));
    }

    @Test
    public void anagramIt_allLettersManyBlocks() {
        assertThat("eno owt eerht ruof evif xis neves", is(anagramer.anagramIt( "one two three four five six seven")));
    }

    @Test
    public void anagramIt_allDigits() {
        assertThat("123456", is(anagramer.anagramIt( "123456")));
    }

    @Test
    public void anagramIt_allDigitsTwoBlocks() {
        assertThat("123456 789", is(anagramer.anagramIt( "123456 789")));
    }

    @Test
    public void anagramIt_DigitsAndLettersOneBlockMixed() {
        assertThat("o12lleh", is(anagramer.anagramIt( "h12ello")));
    }

    @Test
    public void anagramIt_DigitsAndLettersTwoBlockMixed() {
        assertThat("o12lleh sdn45ei987rf", is(anagramer.anagramIt( "h12ello fri45en987ds")));
    }

    @Test
    public void anagramIt_DigitsAndLettersTwoBlockSeparated() {
        assertThat("olleh 123456", is(anagramer.anagramIt( "hello 123456")));
    }

    @Test
    public void anagramIt_DigitsAndLettersManyBlocksSeparatedAndMixed() {
        assertThat("olleh DI_123456 dna -?!e(m)o-(c)lew", is(anagramer.anagramIt( "hello ID_123456 and -?!w(e)l-(c)ome")));
    }


}