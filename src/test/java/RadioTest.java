import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio service = new Radio(20);

    @Test
    public void volumeUpTest() {

        service.setVolumeLevel(0);
        service.increaseVolume();

        int expected = 1;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMaxTest() {

        service.setVolumeLevel(service.maxVolume);
        service.increaseVolume();

        int expected = 100;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest() {

        service.setVolumeLevel(100);
        service.decreaseVolume();

        int expected = 99;

        Assertions.assertEquals(expected, service.getVolumeLevel());
    }

    @Test
    public void decreaseVolumeBelowZeroTest() {

        service.setVolumeLevel(service.minVolume);
        service.decreaseVolume();

        int expected = 0;

        Assertions.assertEquals(expected, service.getVolumeLevel());
    }

    @Test
    public void setVolumeBelowZero() {

        service.setVolumeLevel(-1);

        int expected = 0;

        Assertions.assertEquals(expected, service.getVolumeLevel());
    }

    @Test
    public void setVolumeAboveHundred() {
        service.setVolumeLevel(100);
        service.setVolumeLevel(101);

        int expected = 100;

        Assertions.assertEquals(expected, service.getVolumeLevel());
    }

    @Test
    public void setStationAboveMaxTest() {
        service.setCurrentStation(service.maxStation + 1);

        int expected = 0;

        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @Test
    public void setStationBelowZeroTest() {
        service.setCurrentStation(service.minStation - 1);

        int expected = 0;

        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @Test
    public void increaseStationTest() {
        service.setCurrentStation(5);
        service.increaseStation();

        int expected = 6;

        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @Test
    public void nextStationAboveMaxTest() {
        service.setCurrentStation(service.maxStation);
        service.increaseStation();

        int expected = service.minStation;

        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @Test
    public void nextStationAfterZeroTest() {
        service.setCurrentStation(service.minStation);
        service.decreaseStation();

        int expected = service.maxStation;

        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @Test
    public void decreaseStationTest() {
        service.setCurrentStation(5);
        service.decreaseStation();

        int expected = 4;

        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @Test
    public void defaultNumberOfSttaionsTest() {
        Radio service = new Radio();

        int expected = 10;
        Assertions.assertEquals(expected, service.qntyStations);

    }
}
