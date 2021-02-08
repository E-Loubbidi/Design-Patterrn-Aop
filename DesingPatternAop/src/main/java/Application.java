import designpattern.*;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"designpattern", "aspects", "service"})
public class Application {
    public static void main(String[] args) {
        //Composite
        Dessin dessinRoot = new Dessin();
        Cercle cercle1 = new Cercle();
        Cercle d1 = (Cercle) dessinRoot.ajouterFigure(new Cercle());
        Cercle d2 = (Cercle) dessinRoot.ajouterFigure(new Cercle());
        Cercle d3 = (Cercle) dessinRoot.ajouterFigure(new Cercle());
        Figure rectangle1 = new Rectangle();
        Rectangle rect1 = (Rectangle) dessinRoot.ajouterFigure(rectangle1);
        Rectangle rect2 = (Rectangle) dessinRoot.ajouterFigure(new Rectangle());
        Rectangle rect3 = (Rectangle) dessinRoot.ajouterFigure(new Rectangle());
        dessinRoot.calculerPerimetre();
        dessinRoot.calculerSurface();
        dessinRoot.dessinerFigure();
        //Observable
        Parametrage parametrage = new Parametrage();
        Figure c1 = new Cercle();
        Figure r1 = new Rectangle();
        parametrage.ajouterObserver(c1);
        parametrage.ajouterObserver(r1);
        System.out.println("***********************");
        parametrage.setCouleurContour(5);
        parametrage.setCouleurRemplissage(400);
        parametrage.setCouleurContour(300);
        System.out.println("-----------------------");
        parametrage.setCouleurContour(7);
        parametrage.setCouleurRemplissage(450);
        parametrage.setCouleurContour(350);
        System.out.println("***********************");
        parametrage.setCouleurContour(10);
        parametrage.setCouleurRemplissage(170);
        parametrage.setCouleurContour(500);
    }
}
