public class Radio {
    public int currentStation;
    public int volumeLevel;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (volumeLevel > 100) {
           return;
        }
        if (volumeLevel < 0) {
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


}
