package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example1;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example1.builder.BuilderAdapterImpl;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example1.constants.BuildingType;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        BuilderAdapterImpl houseBuilder = new BuilderAdapterImpl(BuildingType.HOUSE);
        BuilderAdapterImpl scyScraperBuilder = new BuilderAdapterImpl(BuildingType.SKYSCRAPER);

        houseBuilder.build("Downtown");
        scyScraperBuilder.build("City Center");
        scyScraperBuilder.build("Outskirts");
    }
}
