package ru.netology.domain;

public class Radio {
    private int amountRadioStation = 10;
    private int currentRadioStation;
    private int currentSoundVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > amountRadioStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public Radio() {
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        if (currentRadioStation == amountRadioStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = amountRadioStation - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
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
