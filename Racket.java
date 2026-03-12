class Racket{

    String brand;
    String color;
    String sportType;
    int weight;
    int price;
    int length;
    int gripSize;
    String stringType;
    String material;
    int rating;

    Racket(){
        System.out.println("Default constructor called");
    }

    Racket(String brand,String color,String sportType,int weight,int price,
           int length,int gripSize,String stringType,String material,int rating){

        this.brand=brand;
        this.color=color;
        this.sportType=sportType;
        this.weight=weight;
        this.price=price;
        this.length=length;
        this.gripSize=gripSize;
        this.stringType=stringType;
        this.material=material;
        this.rating=rating;

        System.out.println("Parameterized constructor called");
    }
}