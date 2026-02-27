package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TestScrabbleScore {

    @Test
    public void simpleScores() {
        Assert.assertEquals(2, ScrabbleScore.calculate("at"));

        Assert.assertEquals(3, ScrabbleScore.calculate("not"));

        Assert.assertEquals(4, ScrabbleScore.calculate("neat"));
    }

    @Test
    public void complexScores() {
        Assert.assertEquals(5, ScrabbleScore.calculate("gate"));

        Assert.assertEquals(29, ScrabbleScore.calculate("jazz"));

        Assert.assertEquals(21, ScrabbleScore.calculate("quintuplet"));
    }

    @Test
    public void ignoresCase() {
        Assert.assertEquals(29, ScrabbleScore.calculate("JAZZ"));
        Assert.assertEquals(21, ScrabbleScore.calculate("quIntuPlEt"));
    }
}
