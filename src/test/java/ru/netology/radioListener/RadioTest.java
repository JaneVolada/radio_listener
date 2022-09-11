package ru.netology.radioListener;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldNextRadioStationDefault.csv")

    public void shouldNextRadioStationDefault(int expected, int newCurrentRadioStation) {
        Radio station = new Radio();
        station.currentRadioStation = newCurrentRadioStation;
        station.next();
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldNextRadioStation.csv")

    public void shouldNextRadioStation(int expected, int newCurrentRadioStation, int maxRadioStation) {
        Radio station = new Radio(maxRadioStation);
        station.currentRadioStation = newCurrentRadioStation;
        station.next();
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldPrevRadioStationDefault.csv")
    public void shouldPervRadioStationDefault(int expected, int newCurrentRadioStation) {
        Radio station = new Radio();
        station.currentRadioStation = newCurrentRadioStation;
        station.prev();
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldPrevRadioStation.csv")
    public void shouldPervRadioStation(int expected, int newCurrentRadioStation, int maxRadioStation) {
        Radio station = new Radio(maxRadioStation);
        station.currentRadioStation = newCurrentRadioStation;
        station.prev();
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldSetRadioStationDefault.csv")
    public void shouldSetRadioStationDefault(int expected, int newCurrentRadioStation) {
        Radio station = new Radio();
        station.setCurrentRadioStation(newCurrentRadioStation);
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldSetRadioStation.csv")
    public void shouldSetRadioStation(int expected, int newCurrentRadioStation, int maxRadioStation) {
        Radio station = new Radio(maxRadioStation);
        station.setCurrentRadioStation(newCurrentRadioStation);
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldIncreaseVolume.csv")
    public void shouldIncreaseVolume(int expected, int newCurrentVolume) {
        Radio station = new Radio();
        station.currentVolume = newCurrentVolume;
        station.increaseVolume();
        int actual = station.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldReduceVolume.csv")

    public void shouldReduceVolume(int expected, int newCurrentVolume) {
        Radio station = new Radio();
        station.currentVolume = newCurrentVolume;
        station.reduceVolume();
        int actual = station.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
