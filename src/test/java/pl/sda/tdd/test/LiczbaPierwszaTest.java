package pl.sda.tdd.test;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.tdd.LiczbaPierwsza;

public class LiczbaPierwszaTest {

    @Test
    public void dwaJestLiczbaPierwsza(){
        Assert.assertTrue(LiczbaPierwsza.czyPierwsza(99));
    }

    @Test
    public void szescNieJestLiczbaPierwsza(){
        Assert.assertFalse(LiczbaPierwsza.czyPierwsza(6));
    }

    @Test
    public void dziewiecNieJestLiczbaPierwsza(){
        Assert.assertFalse(LiczbaPierwsza.czyPierwsza(9));
    }

}
