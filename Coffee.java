class Coffee {

    int price;
    int quantity;

    Coffee(){
        System.out.println("Default constructor called");
    }

    Coffee(int price,int quantity){
        this.price=price;
        this.quantity=quantity;
        System.out.println("Parameterized constructor called");
    }
}