public class Aggregation {
    public static void main(String[] args) {
        
    
    address addr = new address("2F","New York City","34553");
    employee e1 = new employee(81, "Rose", addr);

    // addr.displayaddress();
    e1.displayemp();
    }
}

class address {
    String street;
    String city;
    String zipcode;

    public address(String street,String city,String zipcode){
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    // public void displayaddress(){
    //     System.out.println(street + ","+ city+"-"+zipcode);
    // }
    public String toString(){
        return this.street + ","+ this.city+"-"+this.zipcode;
    }
}

class employee {
    int id;
    String name;
    address add;


    public employee(int id,String name,address add){
        this.id = id;
        this.name = name;
        this.add = add;
    }
    public void displayemp(){
        System.out.println("ID: "+ id + ",Name: "+ name+",Address:"+ add);
        // add.displayaddress();
    }
}
