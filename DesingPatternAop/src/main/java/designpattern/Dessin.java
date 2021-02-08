package designpattern;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Dessin extends Figure {

    List<Figure> figures = new ArrayList();

    public Figure ajouterFigure(Figure figure){
        figures.add(figure);
        return figure;
    }

    public void supprimerFigure(Figure  figure){
        figures.remove(figure);
    }

    public List<Figure> getFigures(){
        return figures;
    }

    public void serialiserDessin(){

    }

    public void calculerPerimetre() {
        for(Figure figure : figures){
            figure.calculerPerimetre();
        }
    }

    public void calculerSurface() {
        for(Figure figure : figures){
            figure.calculerSurface();
        }
    }

    public void dessinerFigure() {
        for(Figure figure : figures){
            figure.dessinerFigure();
        }
    }

    public void mettreAjour(Parametrage parametrage) {
        for(Figure figure : figures){
            figure.mettreAjour(parametrage);
        }
    }
}
