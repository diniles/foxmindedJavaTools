package com.dl.junit.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        assertEquals("neewolleh", Reverse.reverse("helloween"));
    }

    @Test
    void reverseIron() {
        assertEquals("norI nediaM", Reverse.reverse("Iron Maiden"));
    }

    @Test
    void reverseIronJudas() {
        assertEquals("saduJ tseirP", Reverse.reverse("Judas Priest"));
    }

    void reverseAria() {
        assertEquals("яирА", Reverse.reverse("Ария"));
    }
}