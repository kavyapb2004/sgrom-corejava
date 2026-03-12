class Bucket {

    int capacity;
    String color;
    String material;
    int price;
    int weight;

    Bucket(){
        System.out.println("Default constructor called");
    }

    Bucket(int capacity,String color,String material,int price,int weight){
        this.capacity=capacity;
        this.color=color;
        this.material=material;
        this.price=price;
        this.weight=weight;
        System.out.println("Parameterized constructor called");
    }
}