package designpattern;

import org.springframework.stereotype.Service;

@Service
public class Rectangle extends Figure {

    private Point CoinSupGauche;
    private double H = Math.random() * 30 + 5;
    private double L = Math.random() * 30 + 5;

    public void calculerPerimetre() {
        perimetre = 2 * (L + H);
    }

    public void calculerSurface() {
        surface = L * H;
    }

    public void dessinerFigure() {
        System.out.println("Rectangle");
        System.out.println("Permimetre " + perimetre);
        System.out.println("Surface " + surface);
    }

    public void mettreAjour(Parametrage parametrage) {
        System.out.println( "eppaisseurContour = " + parametrage.getEppaisseurContour());
        System.out.println( "couleur Contour = " + parametrage.getCouleurContour());
        System.out.println( "Couleur Remplissage = " + parametrage.getCouleurRemplissage());
    }

    public Point getCoinSupGauche() {
        return CoinSupGauche;
    }

    public void setCoinSupGauche(Point coinSupGauche) {
        CoinSupGauche = coinSupGauche;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }
}
