package medipol.edu.tr.yazilimortamfinal.FinalProjeEmirDursunBoztepe;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urunler")

public class UrunRestApi {
	
	 public static List<String> urun = new ArrayList<>();

     @GetMapping("/listele")
     public static List<String> listele(){
         return urun;
     }

     @PostMapping("/ekle")
     public static String ekle(@RequestBody String ad) {
         urun.add(ad);
         return ad;
     } 

     @PostMapping("/sil")
     public static String sil(@RequestBody String ad) {
         urun.remove(ad);
         return ad;
     }

}
