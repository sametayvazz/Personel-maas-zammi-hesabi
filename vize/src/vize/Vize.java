/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vize;

import java.util.Scanner;



class personel
{
  String personel_ad,personel_soyad;
  double cocuk;
  double maas;
  int yil;  
  double oran;
   
 public void zam_hesapla(double zamlar)
      {
          zamlar = maas;
          if (maas < 1000)
          {
            
              maas = maas + (maas*3/100);
              oran = maas - zamlar;
          }
          else if( maas > 2500 )
          {
              
            maas = maas + (maas*5/100);          
            oran = maas - zamlar;
          }
          else  {
               
              maas = maas + (maas*4/100);
              oran = maas - zamlar;
          }   
        
      }
   void cocuksayi(double cocuklar)
   {
       cocuklar = cocuk;
       cocuk =cocuk * 42;
   }
   
   
public void yil_hesapla(double maaslar)
  {
      for (int i = 0; i < yil; i++) {          
      
      if (maas < 1000)
          {
             
              maas = maas + (maas*3/100);
              maas += cocuk;
          }
          else if( maas > 2500 )
          {
             
             maas = maas+ (maas*5/100);          
             maas += cocuk;
          }
          else  
          {
               
              maas = maas + (maas*4/100);
             maas =maas+ cocuk;
          }  
      }
  }
  

}

public class Vize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
           double toplam;      
           double zamhesap;
           int tekrar = 1;
           while (tekrar == 1)       
           {
           personel per = new personel();
           Scanner deger = new Scanner(System.in);          
           System.out.print("Adınızı giriniz : " );   
           per.personel_ad = deger.nextLine();
           System.out.print("Soyadınızı giriniz : " );
           per.personel_soyad=deger.nextLine();     
           System.out.print("Maaşınızı giriniz : "  );          
           per.maas =deger.nextDouble();
           System.out.print("Çocuk sayısını giriniz : " );
           per.cocuk =deger.nextDouble();    
           System.out.print("Kaç yıl sonraki maaş hesaplansın : "  );
           per.yil = deger.nextInt();
           
           System.out.print(per.personel_ad +" "+per.personel_soyad+" Eski Maaş:"+per.maas   );            
           per.zam_hesapla(per.maas);              
           per.cocuksayi(per.cocuk);
           toplam = per.maas + per.cocuk;           
           zamhesap = per.oran+per.cocuk;
           System.out.print(" Yeni Maaş:" + toplam +"");
           System.out.println(" "+"Zam:" +zamhesap);
           per.maas = per.maas - per.oran;
           per.yil_hesapla(per.maas);         
           System.out.println(per.yil+ " yıl sonraki maaş:" + per.maas);
           System.out.print("Devam Etmek için 1, çıkmak için 2 tuşlayınız."); 
           //Scanner cevap = new Scanner(System.in);
           tekrar = deger.nextInt();
           System.out.println("*************");
           }
          System.out.println("Çıktınız.");
           
           
    }
    
}
