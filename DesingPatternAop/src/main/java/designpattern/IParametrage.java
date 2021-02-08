package designpattern;

public interface IParametrage {
    void ajouterObserver(Figure figure);
    void supprimerObserver(Figure figure);
    void notifierObservers();
}
