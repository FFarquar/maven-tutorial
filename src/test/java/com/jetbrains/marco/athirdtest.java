package com.jetbrains.marco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;


public class athirdtest {
    @Test
    void athirdtesttorun_as_test() {
        String artist = Mp3Util.getArtist(Paths.get("./my.mp3"));
        Assertions.assertNotEquals("SomeRandomValue", artist);
    }
}
