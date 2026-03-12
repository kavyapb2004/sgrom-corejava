class Necklace{

String brand;
String color;
String material;
int length;
int weight;
int price;
String design;
String type;
String origin;
int warranty;
String style;
String shape;
int thickness;
int beads;
int stones;
String claspType;
String plating;
int modelNo;
int quantity;
String occasion;

Necklace(){
System.out.println("Default constructor called");
}

Necklace(String brand,String color,String material,int length,int weight,int price,
String design,String type,String origin,int warranty,String style,String shape,
int thickness,int beads,int stones,String claspType,String plating,
int modelNo,int quantity,String occasion){

this.brand=brand;
this.color=color;
this.material=material;
this.length=length;
this.weight=weight;
this.price=price;
this.design=design;
this.type=type;
this.origin=origin;
this.warranty=warranty;
this.style=style;
this.shape=shape;
this.thickness=thickness;
this.beads=beads;
this.stones=stones;
this.claspType=claspType;
this.plating=plating;
this.modelNo=modelNo;
this.quantity=quantity;
this.occasion=occasion;

System.out.println("Parameterized constructor called");
}
}