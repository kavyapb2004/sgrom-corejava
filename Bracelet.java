class Bracelet{

String brand;
String color;
String material;
int size;
int weight;
int price;
String design;
String type;
String origin;
int warranty;
String style;
String shape;
int thickness;
int length;
int width;
int stones;
String claspType;
String plating;
int modelNo;
int quantity;

Bracelet(){
System.out.println("Default constructor called");
}

Bracelet(String brand,String color,String material,int size,int weight,int price,
String design,String type,String origin,int warranty,String style,String shape,
int thickness,int length,int width,int stones,String claspType,String plating,
int modelNo,int quantity){

this.brand=brand;
this.color=color;
this.material=material;
this.size=size;
this.weight=weight;
this.price=price;
this.design=design;
this.type=type;
this.origin=origin;
this.warranty=warranty;
this.style=style;
this.shape=shape;
this.thickness=thickness;
this.length=length;
this.width=width;
this.stones=stones;
this.claspType=claspType;
this.plating=plating;
this.modelNo=modelNo;
this.quantity=quantity;

System.out.println("Parameterized constructor called");
}
}