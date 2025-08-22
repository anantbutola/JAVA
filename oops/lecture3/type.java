package oops.lecture3;

public class type {
    
}
class box{
    int side;
    box(){
        
    }
box(int side){
    this.side=side;
}
}
class box1 extends box{
    int l,b;
   box1(int l,int b){
    
    this.l=l;
    this.b=b;
   }

}
class box2 extends box1{
int radius;
box2(int radius){
super(radius, radius);

}
}