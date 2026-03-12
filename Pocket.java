class Pocket{

    String color;
    int size;
    int price;

    Pocket(){
        System.out.println("Default constructor called");
    }

    Pocket(String color,int size,int price){
        this.color=color;
        this.size=size;
        this.price=price;
        System.out.println("Parameterized constructor called");
    }
}