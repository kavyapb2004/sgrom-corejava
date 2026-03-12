class Blanket{

    String brand;
    String color;
    String material;
    int length;
    int width;
    int price;

    Blanket(){
        System.out.println("Default constructor called");
    }

    Blanket(String brand,String color,String material,int length,int width,int price){
        this.brand=brand;
        this.color=color;
        this.material=material;
        this.length=length;
        this.width=width;
        this.price=price;
        System.out.println("Parameterized constructor called");
    }
}