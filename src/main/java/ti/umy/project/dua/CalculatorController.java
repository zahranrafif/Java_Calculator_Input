/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.project.dua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Zahran Rafif Pc
 */
@Controller
public class CalculatorController {
    
    @RequestMapping("/Tambah")
    @ResponseBody
    public String kerjakanTambah () {
        int a = 4;
        int b = 5;
        int c = a+b;
        return "Hasil penjumlahan " + a + "+" + b + "=" +c;
    }
    @RequestMapping("/Kurang")
    @ResponseBody
    public String kerjakanKurang(){
        int a = 10;
        int b = 5;
        int c = a-b;
        return "Hasil pengurangan " + a + "-" + b + "=" + c;            
    }
    @RequestMapping("/Perkalian")
    @ResponseBody
    public String kerjakanKali(){
        float a = 50;
        float b = 50;
        float c = a*b;
        return "Hasil Perkalian " + a + "*" + b + "=" + c;
    }
    @RequestMapping("/Pembagian")
    @ResponseBody
    public String kerjakanBagi() {
        int a = 36;
        int b = 6;
        float c = a/b;
        return "Hasil Bagi " + a + "/" + b + "=" + c;
    }
                
}
