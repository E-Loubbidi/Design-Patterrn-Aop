package designpattern;

import aspects.Log;
import aspects.SecuredByAspect;
import org.springframework.stereotype.Service;

@Service
public abstract class Figure {

    protected double perimetre;
    protected double surface;

    @Log
    public abstract void calculerPerimetre();

    @Log
    public abstract void calculerSurface();

    @Log
    @SecuredByAspect(roles={"USER", "ADMIN"})
    public abstract void dessinerFigure();

    @Log
    @SecuredByAspect(roles={"USER", "ADMIN"})
    public abstract void mettreAjour(Parametrage parametrage);
}
