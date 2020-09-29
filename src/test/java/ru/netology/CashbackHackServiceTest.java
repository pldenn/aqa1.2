package ru.netology;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
        //TODO: You need to fix that         28.09.2020
    }

    @Test
    public void shouldReturn200() {
        int actual = service.remain(800);
        int expected = 200;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldReturn200v2() {
        int actual = service.remain(800);
        Assertions.assertEquals(200, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnNullV2() {
        int actual = service.remain(1000);
        Assertions.assertEquals(0, actual);
        //TODO: You need to fix that         28.09.2020
    }
}
