


public class Main{

    public static void main(String args[]) {

        int count=args.length;
        if(args[0].equals("Mandelbrot") || args[0].equals("mandelbrot")){
            
            if(count==6){
            Double x1 = Double.parseDouble(args[1]);
            Double x2 = Double.parseDouble(args[2]);
            Double y1 = Double.parseDouble(args[3]);
            Double y2 = Double.parseDouble(args[4]);
            Integer noOfIterations = Integer.parseInt(args[5]);
            Mandelbrot mandelbrot = new Mandelbrot(x1,x2,y1,y2,noOfIterations); 
        }
        else if(count==5){
        	Double x1 = Double.parseDouble(args[1]);
            Double x2 = Double.parseDouble(args[2]);
            Double y1 = Double.parseDouble(args[3]);
            Double y2 = Double.parseDouble(args[4]);
           Mandelbrot mandelbrot = new Mandelbrot(x1,x2,y1,y2); 
        }
        else if(count==1){
        	 Mandelbrot mandelbrot = new Mandelbrot(); 
        }
        else{System.out.println("Wrong input");}
        }

        else if(args[0].equals("Julia") || args[0].equals("julia")){
          if(count==4){
            Double real = Double.parseDouble(args[1]);
            Double imaginery = Double.parseDouble(args[2]);
            Integer noOfIterations = Integer.parseInt(args[3]);
            Julia julia = new Julia(real,imaginery,noOfIterations);}
            else if(count==1){
             Julia julia = new Julia();
            }
    }
      else{System.out.println("Wrong input");}
 
        
  
}
}
