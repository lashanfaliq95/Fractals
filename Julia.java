
import java.awt.*;

public class Julia extends Fractals{
    double real,imaginery;
    int noOfIterations;
    public Julia(){
    	this.real=-0.4;
    	this.imaginery=0.6;
    	this.noOfIterations=1000;
    	draw();
    	map();
    }
    public Julia(double real, double imaginery, int noOfIterations) {
        this.real = real;
        this.imaginery = imaginery;
        this.noOfIterations = noOfIterations;
        draw();
        map();
      }

            public void map() {
        double dif = 1.0/400;
        boolean isDivergent;
        for (int k = 0; k < 800; k++) {
            for (int j = 0; j < 800; j++) {
                isDivergent = false;
                
                double x , y ;
                x = -1 + dif * j;
                y = 1 - dif * k;
                Complex z = new Complex(x, y);  //z0= complex point
                Complex c = new Complex(this.real,this.imaginery);//c is the given constant
                Complex temp;
                   for (int i = 0; i < noOfIterations; i++) {
                      temp=Complex.sqr(z);
                      Complex sum = Complex.add(c,temp);  //z=c+sqr.zn
                      z = sum;
                     
                    if (Complex.getAbsolute(z)>2){
                        if(i%4==0)
                        image.setRGB(j,k,Color.yellow.getRGB());
                        repaint();
                        if(i%4==1)
                        image.setRGB(j,k,Color.red.getRGB());
                        repaint();
                        if(i%4==2)
                        image.setRGB(j,k,Color.cyan.getRGB());
                        repaint();
                        if(i%4==3)
                        image.setRGB(j,k,Color.blue.getRGB());
                        repaint();
                        isDivergent = true;
                        break;
                      }
                   }
                if (!isDivergent) {
                    image.setRGB(j,k,Color.black.getRGB());
                    repaint();
                }
           }
        }
    }
}
