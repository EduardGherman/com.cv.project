package com.model;

import java.util.ArrayList;
import java.util.List;

public class CVService {
    List<CV> listaCV = new ArrayList<>();

    public CVService(){
        init();
    }

    public void init(){
        CV EduardGherman = new CV("Gherman", "Eduard", 29, 5.0, "IT" );
        CV SilvanaGherman = new CV("Gherman", "Silvana", 26, 3.0, "HR" );
        CV MariusBalanuca = new CV("Balanuca", "Marius", 29, 2.0, "IT" );
        CV GeorgianaBalanuca = new CV("Balanuca", "Georgiana", 28, 1.0, "HR" );

        listaCV.add(EduardGherman);
        listaCV.add(SilvanaGherman);
        listaCV.add(MariusBalanuca);
        listaCV.add(GeorgianaBalanuca);
    }

    public List<CV> getListaCV(){return listaCV;}





}
