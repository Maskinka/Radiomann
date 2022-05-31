package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentSoundVolume(int CurrentSoundVolume) {
        if (CurrentSoundVolume < 0) {
            return;
        }
        if (CurrentSoundVolume > 10) {
            return;
        }
        this.currentSoundVolume = CurrentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }


    public void increaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}
