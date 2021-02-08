package designpattern;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Parametrage implements IParametrage{

    private int eppaisseurContour = 3;
    private int couleurContour = 100;
    private int couleurRemplissage = 200;
    List<Figure> figures = new ArrayList();

    public void ajouterObserver(Figure figure) {
        figures.add(figure);
    }

    public void supprimerObserver(Figure figure) {
        figures.remove(figure);
    }

    public void notifierObservers() {
        for (Figure figure : figures){
            figure.mettreAjour(this);
        }
    }

    public int getEppaisseurContour() {
        return eppaisseurContour;
    }

    public void setEppaisseurContour(int eppaisseurContour) {
        this.eppaisseurContour = eppaisseurContour;
        notifierObservers();
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
        notifierObservers();
    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        notifierObservers();
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
