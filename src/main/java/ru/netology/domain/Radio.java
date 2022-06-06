package ru.netology.domain;

public class Radio {
    private int maxRadioStation = 10;
    private int currentRadioStation;
    private int currentSoundVolume;

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > maxRadioStation - 1) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        if (currentRadioStation == maxRadioStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxRadioStation - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentSoundVolume(int CurrentSoundVolume) {
        if (CurrentSoundVolume < 0) {
            return;
        }
        if (CurrentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = CurrentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}
