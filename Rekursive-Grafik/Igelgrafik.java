
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Igelgrafik extends JFrame implements ActionListener {

    Igel i = new Igel();
    A73 Quadrat = new A73();
    A74 vieleQuadrate = new A74();
    BiBaum baum = new BiBaum();
    sierpinskiDreieck dreieck = new sierpinskiDreieck();
    JButton schalter01, schalter02, schalter03, schalter04;
    JTextField schalter01TextField, schalter02TextField, schalter03TextField, schalter04TextField;

    public Igelgrafik() {

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        schalter01 = new JButton("zeichne Quadrat");
        add(schalter01);
        schalter01.addActionListener(this);
        schalter01.setActionCommand("Quadrat!");

        schalter01TextField = new JTextField(15);
        schalter01TextField.addActionListener(this);
        add(schalter01TextField);

        schalter02 = new JButton("zeichne viele Quadrate");
        add(schalter02);
        schalter02.addActionListener(this);
        schalter02.setActionCommand("vieleQuadrate!");

        schalter02TextField = new JTextField(15);
        schalter02TextField.addActionListener(this);
        add(schalter02TextField);

        schalter03 = new JButton("Baum");
        add(schalter03);
        schalter03.addActionListener(this);
        schalter03.setActionCommand("Baum!");

        schalter03TextField = new JTextField(15);
        schalter01TextField.addActionListener(this);
        add(schalter03TextField);

        schalter04 = new JButton("Dreieck");
        add(schalter04);
        schalter04.addActionListener(this);
        schalter04.setActionCommand("Dreieck!");

        schalter04TextField = new JTextField(15);
        schalter04TextField.addActionListener(this);
        add(schalter04TextField);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Quadrat!")) {
            int x = 50;
            try {
                x = Integer.parseInt(schalter01TextField.getText());
            } catch (Exception ex) {
                schalter01TextField.setText("Geben Sie eine Zahl ein.");
            }
            Quadrat.zeichne(x);
        }

        if (e.getActionCommand().equals("vieleQuadrate!")) {
            int y = 10;
            try {
                y = Integer.parseInt(schalter02TextField.getText());
            } catch (Exception ex) {
                schalter02TextField.setText("Geben Sie eine Zahl ein.");
            }
            vieleQuadrate.zeichne(0, y);
        }

        if (e.getActionCommand().equals("Baum!")) {
            int a = 140;
            try {
                a = Integer.parseInt(schalter03TextField.getText());
            } catch (Exception ex) {
                schalter03TextField.setText("Geben Sie eine Zahl ein.");
            }
            baum.zeichne(a);
        }

        if (e.getActionCommand().equals("Dreieck!")) {
            int b = 140;
            try {
                b = Integer.parseInt(schalter03TextField.getText());
            } catch (Exception ex) {
                schalter04TextField.setText("Geben Sie eine Zahl ein.");
            }
            dreieck.zeichne(b);
        }
    }

    class Igel {

        int xa = 500;
        int ya = 500;
        int phi = 0;
        double b = 0;

        public void vor(double d) {
            Graphics stift = getGraphics();
            int dx = (int) (d * Math.sin(b));
            int dy = (int) (d * Math.cos(b));
            int xe = xa + dx;
            int ye = ya - dy;
            stift.drawLine(xa, ya, xe, ye);
            xa = xe;
            ya = ye;
        }

        public void rechts(int Winkel) {
            phi = phi + Winkel;
            b = 2 * Math.PI * phi / 360;
        }

        public void links(int Winkel) {
            phi = phi + Winkel;
            b = 2 * Math.PI * phi / 360;
        }
    }

    class A73 {
        int n = 4;

        public void zeichne(double j) {
            for (int n = 4; n > 0; n--) {
                i.vor(j);
                i.rechts(90);
            }
        }

        public void zeichne() {
            for (int n = 4; n > 0; n--) {
                i.vor(100);
                i.rechts(90);
            }
        }
    }

    class A74 {
        public void zeichne() {

            for (int n = 0; n < 360; n += 10) {
                i.rechts(n);
                for (int j = 4; j > 0; j--) {
                    i.vor(250);
                    i.rechts(90);
                }
                i.phi = 0;
            }
        }

        public void zeichne(int startwert, int winkel) {

            if (startwert < 360) {
                i.rechts(startwert + winkel);
                for (int j = 4; j > 0; j--) {
                    i.vor(250);
                    i.rechts(90);
                }
                i.phi = 0;
                vieleQuadrate.zeichne(startwert + winkel, winkel);
            }
        }
    }

    class BiBaum {
        public void zeichne(int l) {
            if (l > 2) {
                i.vor(l);
                i.rechts(90);
                i.vor(l);
                i.rechts(-90);
                zeichne(l / 2);
                i.rechts(90);
                i.vor(-2 * l);
                i.rechts(-90);
                zeichne(l / 2);
                i.rechts(90);
                i.vor(l);
                i.rechts(-90);
                i.vor(-l);
            }
        }
    }

    class sierpinskiDreieck {
        public void zeichne(double l) {
            if (l > 2) {
                i.vor(l);
                zeichne(l / 2);
                i.rechts(180);
                i.vor(l);
                i.rechts(60);
                i.vor(l);
                zeichne(l / 2);
                i.rechts(180);
                i.vor(l);
                i.rechts(60);
                i.vor(l);
                zeichne(l / 2);
                i.rechts(180);
                i.vor(l);
                i.rechts(60);
            }
        }
    }

    public static void main(String[] args) {

        Igelgrafik test1 = new Igelgrafik();

        test1.setSize(1000, 1000);
        test1.setVisible(true);

    }
}