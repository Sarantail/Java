package HW6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook hp_pailion_g6 = new Notebook("hp_pailion_g6", 16, "4k",
                true, 500, "16", "Windows", "black");
        Brand brandHp = new Brand("HP", "U.S.A.", "AmericaLanguage");
        hp_pailion_g6.addBrand(brandHp);
        Notebook hp_galaxy_x64 = new Notebook("hp_galaxy_x64", 14, "FullHD",
                true, 500, "8", "Windows", "white");
        hp_galaxy_x64.addBrand(brandHp);
        Notebook samsung_a52 = new Notebook("samsung_a52", 18, "FullHD",
                true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        samsung_a52.addBrand(brandSamsung);
        Notebook samsung_m31s = new Notebook("samsung_m31s", 16, "4k",
                false, 1000, "16", "Linux", "black");
        samsung_m31s.addBrand(brandSamsung);
        Notebook lenovo_gtx76 = new Notebook("lenovo_gtx76", 16, "FullHD",
                true, 700, "8", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        Notebook macbook_14pro = new Notebook("macbook_14pro", 17, "4k",
                false, 1000, "8", "ios", "white");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        Notebook asus_x515 = new Notebook("asus_x515", 17, "FullHD",
                true, 300, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "taiwan", "ChinaLanguage");
        asus_x515.addBrand(brandAsus);
        Notebook acer_air5 = new Notebook("acer_air5", 19, "FullHD",
                true, 600, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);
        Notebook acer_air6 = new Notebook("acer_air6", 18, "4k",
                false, 500, "16", "Windows", "black");
        acer_air6.addBrand(brandAcer);
        Notebook acer_a313 = new Notebook("acer_a313", 16, "FullHD",
                true, 500, "8", "Windows", "black");
        acer_a313.addBrand(brandAcer);
        Set<Notebook> Notebook = new HashSet<>();
        Notebook.add(hp_pailion_g6);
        Notebook.add(hp_galaxy_x64);
        Notebook.add(samsung_a52);
        Notebook.add(samsung_m31s);
        Notebook.add(lenovo_gtx76);
        Notebook.add(macbook_14pro);
        Notebook.add(asus_x515);
        Notebook.add(acer_air5);
        Notebook.add(acer_air6);
        Notebook.add(acer_a313);
        Notebook FilterNotebook = new Notebook();

        System.out.println(FilterNotebook.newFilter(Notebook));
    }
}
