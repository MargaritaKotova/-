
class square { 

double width;

square(double w){
 width=w;
}
double volume(){
  return width*width;
}

}

public class square_demo { 
  public static void main(String[] args) {
    square squaric = new square(5); 
   double vol;
   vol = squaric.volume();
   System.out.println(vol);

   }
}   