public class overriding {
    public static void main(String[] args) {

        System.out.println("helloooooo");
        // new child();
        sbi SBI = new sbi();
        hdfc HDFC = new hdfc();
        icici ICICI = new icici();

        bank[] BANK= new bank[3];
        BANK[0] = new sbi();
        BANK[1] = new hdfc();
        BANK[2] = new icici();

        for (bank b: BANK) {
            System.out.println(b.getinterestrate()+ "%");
        }
    }
    
}

class bank{

    double getinterestrate(){
        return 0.0;
    }

}

class sbi extends bank{
    @Override
    double getinterestrate(){
        return 8.5;
    }

}
class hdfc extends bank{
    @Override
    double getinterestrate(){
        return 9.0;
    }

}
class icici extends bank{
    @Override
    double getinterestrate(){
        return 8.0;
    }

}
