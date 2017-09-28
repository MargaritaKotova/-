
class pryamougolnik { 

double width;
double length;

pryamougolnik(double w,double l){
 width=w;
 length=l;
}
double volume(){
  return width*length;
}

}

public class pryamougolnik_demo { 
  public static void main(String[] args) {
    pryamougolnik pryam = new pryamougolnik(5,10); 
   double vol;
   vol = pryam.volume();
   System.out.println(vol);

   }
}   