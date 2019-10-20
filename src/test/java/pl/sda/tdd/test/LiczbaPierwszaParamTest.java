package pl.sda.tdd.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.sda.tdd.LiczbaPierwsza;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LiczbaPierwszaParamTest {

    private int liczba;
    private boolean czyPierwsza;

    public LiczbaPierwszaParamTest(int liczba, boolean czyPierwsza) {
        this.liczba = liczba;
        this.czyPierwsza = czyPierwsza;
    }

    @Test
    public void czyPierwszaTest(){
        Assert.assertEquals(czyPierwsza, LiczbaPierwsza.czyPierwsza(liczba));
    }

    @Parameterized.Parameters(name = "{inteks}: czy liczba {0} jest pierwsza? {1}")
    public static Collection<Object[]> wczytajDane(){
        return Arrays.asList(new Object[][]{
                {4, false},
                {77, false},
                {999, false},
                {7, true}
        });
    }

}
