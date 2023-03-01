
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Igelgrafik extends JFrame implements ActionListener{
	
    Igel i = new Igel();
    A73 Quadrat = new A73();
    A74 vieleQuadrate = new A74();
    JButton schalter01, schalter02;
  
    public Igelgrafik() {
    	
    	setLayout( new FlowLayout() );
    	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    	
    	schalter01 = new JButton("zeichne Quadrat") ;
    	add(schalter01) ; 
    	schalter01.addActionListener(this ) ;
        schalter01.setActionCommand("Quadrat!");
        schalter02 = new JButton("zeichne viele Quadrate");
        add(schalter02);
        schalter02.addActionListener(this);
        schalter02.setActionCommand("vieleQuadrate!");
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Quadrat!"))
            Quadrat.zeichne(50);
        if(e.getActionCommand().equals("vieleQuadrate!"))
            vieleQuadrate.zeichne(0, 10);
    }
    	
    class Igel {

    	int xa=500; int ya=500; 
    	int phi=0; 
    	double b=0; 

    	public void vor(int d) { 
    	Graphics stift=getGraphics () ; 
    	int dx=(int)(d*Math.sin(b)) ; 
    	int dy=(int)(d*Math.cos(b)) ; 
    	int xe=xa+dx; int ye=ya-dy; 
    	stift.drawLine(xa,ya,xe,ye); 
    	xa=xe; ya=ye; 
    	} 
    	public void rechts(int Winkel ) { 
    		
    	phi= phi + Winkel ; 
    	b=2*Math.PI*phi/360; 
    	}

        public void links(int Winkel){
            phi = phi + Winkel;
            b = 2*Math.PI*phi/360;
        }
    }

    class A73{
        int n = 4;
        public void zeichne(int j){
            for(int n = 4; n > 0; n--){
                i.vor(j); i.rechts(90);
            }
        }

        public void zeichne(){
            for( int n = 4; n>0; n--){
                i.vor(100); i.rechts(90);
            }
        }
    }

    class A74{
        public void zeichne(){

            for(int n = 0; n < 360; n+=10){
                i.rechts(n);
                for(int j = 4; j>0; j--){
                    i.vor(250); i.rechts(90);
                }
                i.phi = 0;
            }
        }
        public void zeichne(int startwert, int winkel){

            if(startwert < 360){
                i.rechts(startwert + winkel);
                for(int j = 4; j>0; j--){
                    i.vor(250); i.rechts(90);
                }
                i.phi = 0;
                vieleQuadrate.zeichne(startwert+winkel, winkel);
            }
        }
    }
    
    public static void main ( String[] args ) 
    {

    	Igelgrafik test1 = new Igelgrafik();
    	 
    	 	test1.setSize( 1000, 1000 );
    	 	test1.setVisible( true );
    	  
    }
}