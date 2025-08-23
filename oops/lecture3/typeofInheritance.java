package oops.lecture3;
class Box{
    float l,b,w;
    Box(float l, float b,float w){
        this.l=l;
        this.b=b;
        this.w=w;
    }
    Box(){
        this.l=-1;
        this.b=-1;
        this.w=-1;
    }
}

class BoxWeight extends Box{
    int side ;
   BoxWeight(float l,float b,float w,int side){
    super( l, b, w);
    this.side=side;
   }
   BoxWeight(int side){
    super();
    this.side = -1;
   }
}

class BoxPrice extends Box{
  double price;
  BoxPrice(double price){
    super();
    this.price =price;
  }
}

public class typeofInheritance {
    
}

/*
 * Single Inheritance: Have one base class and one derived class . Derived class inherits members of Base class.
 * Eg:  class(BoxWeight) inherits members of class(Box). 
 

 * Multilevel Inheritaance : D1-derived class inherits members of B-base class and D2-deriived class
 *                          inherits members of D1 class.
 * Means for  D2 class its base class is D1.
 * Eg: class(BoxWeight) inherits members of class(Box). and class(BoxPrice) inherits members of class(BoxWeight).
                    Snippet: 
                            class Box{
                            float l,b,w;
                            Box(float l, float b,float w){
                                this.l=l;
                                this.b=b;
                                this.w=w;
                            }
                            Box(){
                                this.l=-1;
                                this.b=-1;
                                this.w=-1;
                            }
                        }

                        class BoxWeight extends Box{
                            int side ;
                        BoxWeight(float l,float b,float w,int side){
                            super( l, b, w);
                            this.side=side;
                        }
                        BoxWeight(int side){
                            super();
                            this.side = -1;
                        }
                        }

                        class BoxPrice extends BoxWeight{
                        double price;
                        BoxPrice(int side,double price){
                            super(side);
                            this.price =price;
                        }
                        }

 * Multiple Inheritance :we have derived class D1 and have two or more parent(B1,B2,B3,....) class of D1.
 * Eg: we have Base-class (B1) having n=10 and other BAse class (B2) having n=15,Both base class having one derived class D.
 * if we create object(obj) of D and acccess "n" then (obj.n)=? , this creates ambiguity means two possible solution for "n".
 * Therefore,JAVA doesn't support "MULTIPLE_INHERITANCE".
 * "MULTIPLE_INHERITANCE" supported by "interfaces".  

 *Hierarchial Inheritance :Having one Baseclass-B and multiple derived classes which inherits members of B.
 *Eg: Having Baseclass Box and derivedclasses BoxWeight and BoxPrice
                 Snippet:   
                        class Box{
                            float l,b,w;
                            Box(float l, float b,float w){
                                this.l=l;
                                this.b=b;
                                this.w=w;
                            }
                            Box(){
                                this.l=-1;
                                this.b=-1;
                                this.w=-1;
                            }
                        }

                        class BoxWeight extends Box{
                            int side ;
                        BoxWeight(float l,float b,float w,int side){
                            super( l, b, w);
                            this.side=side;
                        }
                        BoxWeight(int side){
                            super();
                            this.side = -1;
                        }
                        }

                        class BoxPrice extends Box{
                        double price;
                        BoxPrice(double price){
                            super();
                            this.price =price;
                        }
                        }



*Hybrid Inheritance: JAVA not fully support hybrid inhertance b/c of multiple inheritance .
*It is combination of two or more types of inheritance.
Eg: baseclass B1  have derived class d1 and d2 and further d1 class have its derived class d3.
  this eg is valid b/c of no multiple inheritance

  Eg: baseclass b1 have two derived classes d1 and d2 and both d1 and d2 have single derived class d3 .
  this eg is not valid b/c of multiple inheritance in here.
 

* Self inheritance or cyclic inheritance- is not possible means (class B inherits class B) is not possible.


 */