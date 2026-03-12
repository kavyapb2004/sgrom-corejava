class Ant {

    int weight;
    String color;
    int foodCapacity;

    Ant(){
        System.out.println("Default constructor called");
    }

    Ant(int weight,String color,int foodCapacity){
        this.weight=weight;
        this.color=color;
        this.foodCapacity=foodCapacity;
        System.out.println("Parameterized constructor called");
    }
}