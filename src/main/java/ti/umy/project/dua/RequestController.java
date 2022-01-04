/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.project.dua;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Zahran Rafif Pc
 */
@Controller
public class RequestController {
    
    public String addMessage(String text){
        return text + " Saja";
    }
    
    public int getSum(String a , String b){
        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);
        return ai+bi; //rumus penjumlahannya
        
    }
    
    public float getkali(String r, String v){
        float ri = Integer.parseInt(r);
        float vi = Integer.parseInt(v);
        return ri/vi; 
    }
    
    //http://localhost:8080/
    @RequestMapping("/input")
    public String getInput(HttpServletRequest data, Model model){
 
        String vara = data.getParameter("vara"); //sesuai dengan yang link itu
        String varb = data.getParameter("varb");
        
        String kala = data.getParameter("kala"); //sesuai dengan yang link itu
        String kalb = data.getParameter("kalb");
        
        int hasil_jumlah = getSum(vara,varb);
        float hasil_kali = getkali(kala, kalb);

        model.addAttribute("hasil" ,hasil_jumlah);       
        model.addAttribute("vara",vara);
        model.addAttribute("varb",varb);
        
        model.addAttribute("Hasil" ,hasil_kali);       
        model.addAttribute("kala",kala);
        model.addAttribute("kalb",kalb);
        
        return "tampil";
    }
}
