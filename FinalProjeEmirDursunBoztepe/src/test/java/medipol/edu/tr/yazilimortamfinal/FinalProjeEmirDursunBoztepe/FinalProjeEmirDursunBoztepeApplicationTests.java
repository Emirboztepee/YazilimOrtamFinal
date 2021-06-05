package medipol.edu.tr.yazilimortamfinal.FinalProjeEmirDursunBoztepe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalProjeEmirDursunBoztepeApplicationTests {

	UrunRestApi urunRestApi = new UrunRestApi();
    private static List<String> urunadi = UrunRestApi.urun;
	
    @Test
    public void testListele() {
        List<String> sonuc = UrunRestApi.listele();
        assertEquals(urunadi,sonuc);
    }

    @Test
    public void testEkle() {
        String ad = "Emir";
        String sonuc = UrunRestApi.ekle(ad);
        assertEquals("Emir",sonuc);
    }

    @Test
    public void testSil() {
        String ad = "Emir";
        UrunRestApi.urun.add(ad);
        String sonuc = UrunRestApi.sil(ad);
        assertEquals("Emir",sonuc);
    }

}
