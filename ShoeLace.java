class ShoeLace{

String brand;
String color;
String material;
int length;
int thickness;
int price;
String type;
String origin;
int modelNo;
int quantity;

ShoeLace(){
System.out.println("Default constructor called");
}

ShoeLace(String brand,String color,String material,int length,int thickness,int price,
String type,String origin,int modelNo,int quantity){

this.brand=brand;
this.color=color;
this.material=material;
this.length=length;
this.thickness=thickness;
this.price=price;
this.type=type;
this.origin=origin;
this.modelNo=modelNo;
this.quantity=quantity;

System.out.println("Parameterized constructor called");
}
}