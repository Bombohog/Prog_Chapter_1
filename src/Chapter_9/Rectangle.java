/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 17-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

// Opg 1
public class Rectangle {

    double width, height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double GetArea() {return this.width * this.height;}

    public double GetPerimeter() {return (this.width * 2) + (this.height * 2);}

    public void DisplayData() {
        System.out.printf("Width: %.2f\nHeight: %.2f\nArea: %.2f\nPerimeter %.2f\n", this.width, this.height, this.GetArea(), this.GetPerimeter());
    }

}