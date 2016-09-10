package Hewitt.Jalisa.ZCWLivingRoom;

import org.junit.Test;

import static org.junit.Assert.*;



public class TelevisionTest {
    @Test
    public void getVolumeTest(){

        Television television = new Television();
        Integer expectedValue = 0;
        Integer actualValue = television.getVolume();

        assertEquals("The value should be 0",expectedValue,actualValue);
    }
    @Test
    public void setVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 8;
        television.setVolume(8);
        Integer actualValue = television.getVolume();

        assertEquals("The value should be 0",expectedValue,actualValue);

    }

}
