package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example1.builder;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example1.constants.BuildingType;

/**
 * Adapter to connect {@link SkyscraperBuilder} and {@link HouseBuilder} interfaces
 *
 * @author eugenia
 */
public class BuilderAdapterImpl implements BuilderAdapter {

    private Builder builder;

    public BuilderAdapterImpl(BuildingType type) {
        switch (type) {
            case SKYSCRAPER:
                builder = new SkyscraperBuilder();
                break;
            case HOUSE:
                builder = new HouseBuilder();
                break;
            default:
                throw new RuntimeException(String.format("%s building type is not supported", type));
        }
    }

    public void build(String location) {
        builder.build(location);
    }
}
