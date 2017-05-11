import java.awt.*;


public class Mandelbrot extends Fractals implements runnable{
    private double x1, x2;
    private double y1, y2;
    private int noOfIterations;

    public Mandelbrot() {

        this.x1 = -1;
        this.x2 = 1;
        this.y1 = -1;
        this.y2 = 1;
        this.noOfIterations = 1000;
        map();
        draw();
    }

    public Mandelbrot(double x1, double x2, double y1, double y2) {
        
       this.x1=x1;
       this.x2=x2;
       this.y1=y1;
       this.y2=y2;
        this.noOfIterations = 1000;
       map();
       draw();
    }

    public Mandelbrot(double x1, double x2, double y1, double y2, int noOfIterations) {

       this.x1=x1;
       this.x2=x2;
       this.y1=y1;
       this.y2=y2;
    this.noOfIterations = noOfIterations;
        map();
        draw();
    }

    public void map() {
        double dif = Math.abs(x1 - x2)/800.0;
        boolean isDivergent;
        for (int k = 0; k < 800; k++) {
            for (int j = 0; j < 800; j++) {
                isDivergent = false;
                Complex z = new Complex(0, 0);  //z0=0
                double x , y ;
                x = x1 + dif * j;
                y = y2 - dif * k;
               
                Complex c = new Complex(x, y);//c
                Complex temp;
                   for (int i = 0; i < noOfIterations; i++) {
                      temp=Complex.sqr(z);
                      Complex sum = Complex.add(c,temp);  //z=c+sqr.zn
                      z = sum;
                   
                      if (Complex.getAbsolute(z)>2){
                        if(i%4==0)
                        image.setRGB(j,k,Color.pink.getRGB());
                        repaint();
                        if(i%4==1)
                        image.setRGB(j,k,Color.green.getRGB());
                        repaint();
                        if(i%4==2)
                        image.setRGB(j,k,Color.orange.getRGB());
                        repaint();
                        if(i%4==3)
                        image.setRGB(j,k,Color.yellow.getRGB());
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