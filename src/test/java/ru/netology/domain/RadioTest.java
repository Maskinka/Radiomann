package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(10);

    @ParameterizedTest
    @CsvFileSource(resources = {"/testRandom.csv"})
    void testRandomRadioStation(int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/test.csv"})
    void testNextRadioStation(int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        radio.next();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testPrev.csv"})
    void testPrevRadioStation(int currentRadioStation, int expected) {
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prev();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testRandomSound.csv"})
    void testRandomCurrentSoundVolume(int currentSoundVolume, int expected) {
        radio.setCurrentSoundVolume(currentSoundVolume);

        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/increase.csv"})
    void testIncreaseVolume(int currentSoundVolume, int expected) {
        radio.setCurrentSoundVolume(currentSoundVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/decrease.csv"})
    void testDecreaseVolume(int currentSoundVolume, int expected) {
        radio.setCurrentSoundVolume(currentSoundVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
