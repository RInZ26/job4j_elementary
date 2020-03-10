package ru.job4j.array;

import org.junit.Test;
import org.hamcrest.core.Is;
import org.junit.Assert;

public class FindLoopTest {
    @Test
    public void indexOfElementTrue() {
        int[] array = new int[] {1, 2, 3, 5, 9, 2};
        FindLoop findLoop = new FindLoop();
        int actual = findLoop.indexOf(array, 9);
        int expected = 4;
        Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void indexOfElementFalse() {
        int[] array = new int[] {1, 2, 3, 5, 9, 2};
        FindLoop findLoop = new FindLoop();
        int actual = findLoop.indexOf(array, 10);
        int expected = -1;
        Assert.assertThat(actual, Is.is(expected));
    }
}
