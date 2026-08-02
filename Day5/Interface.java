public class Interface {
    public static void main(String[] args) {
        
    
    lightbulb l1 = new lightbulb();
    ceilingfan c1 = new ceilingfan();
    speaker s1 = new speaker();

    l1.turnon();
    l1.turnoff();

    c1.turnon();
    c1.turnoff();
    c1.increase();
    c1.decrease();

    s1.turnon();
    s1.turnoff();
    s1.increase();
    s1.decrease();
  
    }
}

interface switchable{
    void turnon();
    void turnoff();
}

interface adjustable{
    void increase();
    void decrease();
}


class lightbulb implements switchable{
    @Override
    public void turnon(){
        System.out.println("Light bulb glows bright");
    }
    
    public void turnoff(){
        System.out.println("Light bulb is dark");
    }

}

class ceilingfan implements switchable, adjustable{
    @Override
    public void turnon(){
        System.out.println("Fan starts spinning");
    }
    
    public void turnoff(){
        System.out.println("Fan Stops");
    }
    
    public void increase(){
        System.out.println("Fan Speed: HIGH");
    }
    public void decrease(){
        System.out.println("Fan Speed: LOW");
    }


}

class speaker implements switchable, adjustable{
    @Override
    public void turnon(){
        System.out.println("Speaker is now ON");
    }
    
    public void turnoff(){
        System.out.println("Speaker is now OFF");
    }
    
    public void increase(){
        System.out.println("Volume: LOUDER");
    }
    public void decrease(){
        System.out.println("Volume: QUITER");
    }


}