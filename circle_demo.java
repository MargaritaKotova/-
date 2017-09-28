
class circle { 

double radius;

circle(double r){
 radius=r;
}
double volume(){
  return Math.PI*radius*radius;
}

}

public class circle_demo { 
  public static void main(String[] args) {
    circle circlic = new circle(5); 
   double vol;
   vol = circlic.volume();
   System.out.println(vol);

   }
}  