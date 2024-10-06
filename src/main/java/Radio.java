public class Radio {
    public int qntyStations = 10;
    public int minStation = 0;
    public int maxStation = qntyStations - 1;
    public int currentStation;
    public int volumeLevel;

    public int maxVolume = 100;
    public int minVolume = 0;

    public Radio(int qntyStations) {
        this.qntyStations = qntyStations;
        this.maxStation = qntyStations - 1;
    }

    public Radio() {}


    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel > 100) {
            return;
        }
        if (newVolumeLevel < 0) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }

    public void increaseVolume() {
        int target = volumeLevel + 1;
        if (volumeLevel == 100) {
            return;
        }
        setVolumeLevel(target);
    }

    public void decreaseVolume() {
        int target = volumeLevel - 1;
        if (volumeLevel == 0) {
            return;
        }
        setVolumeLevel(target);
    }

    public void increaseStation() {
        int target = currentStation + 1;
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
        setCurrentStation(target);
    }

    public void decreaseStation() {
        int target = currentStation - 1;
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        setCurrentStation(target);
    }

}
