public class Robots {

    String color;
    int weight;
    int height;

    public Robots(String color, int weight, int height){
        this.color = color;
        this.weight = weight;
        this.height =  height;
    }


    public void description(){
        System.out.println("Color: " + color );
        System.out.println("My weight: " + weight);
        System.out.println("My height: " + height + " Feet.");

    }

   public static void main(String[] args){

       Robots r1 = new Robots("Blue", 50, 3);
       Robots r2 = new Robots("Red", 40, 6);
       Robots r3 = new Robots("Yellow",29, 4);

       r1.description();
       System.out.println();
       r2.description();
       System.out.println();
       r3.description();
   }



}
