/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_martin;

/**
 *
 * @author guilhem
 */
public class Convertisseur {
    
    public int nbConversions;
   

    public Convertisseur() {
        nbConversions=0;
    }
   

    @Override
    public String toString () {
        return ""+nbConversions;
    }   
   

    public float CelciusVersKelvin (float tCelcius) {
    float tKelvin; tKelvin = (float) (tCelcius+273.15);
    nbConversions++;
    return tKelvin;
    }
   

    public float KelvinVersCelcius (float tKelvin) {
    float tCelcius; tCelcius = (float) (tKelvin-273.15);
    nbConversions++;
    return tCelcius;
    }
   

    public float CelciusVersFarenheit (float tCelcius) {
    float tFarenheit; tFarenheit = (float) (tCelcius*1.8000+32);
    nbConversions++;
    return tFarenheit;
    }
   

    public double FarenheitVersCelcius (float tFarenheit) {
    float tCelcius; tCelcius = (float) ((tFarenheit-32)/1.8000);
    nbConversions++;
    return tCelcius;
    }
   
    public float KelvinVersFarenheit (float tKelvin) {
    float tFarenheit, tCelcius;
    tCelcius = KelvinVersCelcius(tKelvin);
    tFarenheit = CelciusVersFarenheit(tCelcius);
    nbConversions++;
    return tFarenheit;
    }
   
    public float FarenheitVersKelvin (float tFarenheit) {
    float tKelvin, tCelcius;
    tCelcius = (float) FarenheitVersCelcius(tFarenheit);
    tKelvin = CelciusVersKelvin(tCelcius);
    nbConversions++;
    return tKelvin;
    }
    
}
