class Jacket{

    String brand;
    String color;
    int size;
    int price;
    String material;

    Jacket(){
        System.out.println("Default constructor called");
    }

    Jacket(String brand,String color,int size,int price,String material){
        this.brand=brand;
        this.color=color;
        this.size=size;
        this.price=price;
        this.material=material;
        System.out.println("Parameterized constructor called");
    }
}