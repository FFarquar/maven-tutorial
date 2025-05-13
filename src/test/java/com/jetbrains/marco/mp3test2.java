package com.jetbrains.marco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class mp3test2 {

    @Test
    void another_test_done() {
        String artist = Mp3Util.getArtist(Paths.get("./my.mp3"));
        Assertions.assertEquals("Maaarrrcoooo", artist);
    }
}

