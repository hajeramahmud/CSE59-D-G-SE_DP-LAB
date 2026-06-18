package com.mycompany.main1;

class Sensor{
    String name;
    int batterylevel;
    
    Sensor(String name, int batterylevel){
        this.name=name;
        this.batterylevel=batterylevel;
    }
    void charge(){
        batterylevel=100;
        System.out.println("Sensor Full charge");
    }
}
public class Main4 {
    public static void main(String[] args) {
        Sensor sensor = new Sensor("Temperature", 40);
        
        sensor.charge();
        
       System.out.println("Battery Level: " + sensor.batterylevel + "%");
    }
}
