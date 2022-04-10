package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.iterator.example1;

/**
 * Defines the contract for collection class implementation
 *
 * @author eugenia
 */
interface ChannelCollection {

    void addChannel(Channel c);

    void removeChannel(Channel c);

    /**
     * Returns the iterator for traversal
     *
     * @param type {@link ChannelTypeEnum}
     * @return {@link ChannelIterator}
     */
    ChannelIterator iterator(ChannelTypeEnum type);
}
