public class Radio {
    public int currentStation;
    public int volumeLevel;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
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
        if (volumeLevel == 100){
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
        if (currentStation == 9) {
            currentStation = 0;
        }
        setCurrentStation(target);
    }

    public void decreaseStation() {
        int target = currentStation - 1;
        if (currentStation == 0) {
            currentStation = 9;
        }
        setCurrentStation(target);
    }

}
