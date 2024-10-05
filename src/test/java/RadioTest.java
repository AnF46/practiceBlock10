import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio service = new Radio();

    @Test
    public void volumeUpTest() {

        service.setVolumeLevel(0);
        service.increaseVolume();

        int expected = 1;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveHundredTest() {

        service.setVolumeLevel(100);
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

        Assertions.assertEquals(expected,service.getVolumeLevel());
    }

    @Test
    public void volumeBelowZeroTest() {

        service.setVolumeLevel(0);
        service.decreaseVolume();

        int expected = 0;

        Assertions.assertEquals(expected, service.getVolumeLevel());
    }


}
