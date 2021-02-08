package designpattern;

import org.springframework.stereotype.Service;

@Service
public class Cercle extends Figure {

    private Point C;
    private double R = Math.random() * 30 + 5;

    public void calculerPerimetre() {
        perimetre = 2 * Math.PI * R;
    }

    public void calculerSurface() {
        surface = Math.PI * Math.pow(R, 2);
    }

    public void dessinerFigure() {
        System.out.println("Cercle");
        System.out.println("Permimetre " + perimetre);
        System.out.println("Surface " + surface);
    }

    public void mettreAjour(Parametrage parametrage) {
        System.out.println( "Eppaisseur Contour = " + parametrage.getEppaisseurContour());
        System.out.println( "Couleur Contour = " + parametrage.getCouleurContour());
        System.out.println( "Couleur Remplissage = " + parametrage.getCouleurRemplissage());
        System.out.println("----------------------------------------------------------------");
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

}
