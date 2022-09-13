package ru.netology.radioListener;

public class Radio {
    private int minCurrentRadioStation = 0;
    private int maxCurrentRadioStation = 9;
    protected int currentRadioStation;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    protected int currentVolume = minCurrentVolume;

    public Radio(int numberOfCurrentRadioStation) {
        if (numberOfCurrentRadioStation <= minCurrentRadioStation) {
            this.maxCurrentRadioStation = minCurrentRadioStation;
            return;
        }
        if (numberOfCurrentRadioStation > this.maxCurrentRadioStation) {
            this.maxCurrentRadioStation = minCurrentRadioStation;
        } else {
            this.maxCurrentRadioStation = numberOfCurrentRadioStation - 1;
        }
    }

    public Radio() {
        this.maxCurrentRadioStation = 9;
    }

    public int getMinCurrentRadioStation() {
        return minCurrentRadioStation;
    }

    public int getMaxCurrentRadioStation() {
        return maxCurrentRadioStation;
    }


    public void next() {
        if (currentRadioStation < minCurrentRadioStation) {
            currentRadioStation = minCurrentRadioStation;
            return;
        }
        if (currentRadioStation >= maxCurrentRadioStation) {
            currentRadioStation = minCurrentRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {

        if (currentRadioStation == minCurrentRadioStation) {
            currentRadioStation = maxCurrentRadioStation;
            return;
        }
        if (currentRadioStation < minCurrentRadioStation) {
            currentRadioStation = minCurrentRadioStation;
            return;
        }
        if (currentRadioStation > maxCurrentRadioStation) {
            currentRadioStation = minCurrentRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minCurrentRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxCurrentRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        }
        if (currentVolume <= minCurrentVolume) {
            currentVolume = minCurrentVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= maxCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        }
        if (currentVolume <= minCurrentVolume) {
            currentVolume = minCurrentVolume;
        }
    }


}
