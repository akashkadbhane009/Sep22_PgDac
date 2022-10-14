import java.util.Scanner;
/*
 * 6. Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write suitable
constructors to initialize them. Add functions like “getVolume” and “getArea” that will return volume and surface
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.
@006_Akash_Kadbhane_JH
 */
public class Box {
    //instance vairable of object
    double height , width , breath;
    //default OR parameterless constructore
    Box(){
        this.height=0;
        this.width=0;
        this.breath=0;
    }
    //method to calculate volume
    double  getVolume(double h, double w, double b ){
        double volume = h * w * b;
         return volume;
    }
    //method to calculate area
    double getArea(double h, double w, double b ){
        double area = 2*((h*w)+(w*b)+(b*h));
         return area;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // inputs for box 2
        System.out.println("Enter heigt , width and breath for box 1");
        System.out.print("height=");
        double height = sc.nextDouble();
        System.out.print("width=");
        double width = sc.nextDouble();
        System.out.print("breath=");
        double breath = sc.nextDouble();
        // Object creation for box 1
        Box obj1 = new Box();
        double one = obj1.getVolume(height, width, breath);
        double two = obj1.getArea(height, width, breath);
        //output for box 2
        System.out.println("volume ="+one+"cumm");
        System.out.println("area ="+two+"sqmm");
        // inputs for box 2
        System.out.println("Enter heigt , width and breath box 2");
        System.out.print("height=");
        double height1 = sc.nextDouble();
        System.out.print("width=");
        double width1 = sc.nextDouble();
        System.out.print("breath=");
        double breath1 = sc.nextDouble();
        sc.close();
        // Object creation for box 2
        Box obj2 = new Box();
        double one1 = obj2.getVolume(height1, width1, breath1);
        double two1 = obj2.getArea(height1, width1, breath1);
        //output for box 2
        System.out.println("volume ="+one1+"cumm");
        System.out.println("area ="+two1+"sqmm");
       
    }
}
