/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.prismacloud.messages;

/**
 *
 * @author andy
 */
public class Commit {
 
    private final int sequenceNr;
    
    public Commit(int sequenceNr) {
        this.sequenceNr = sequenceNr;
    }
    
    public int getSequenceNr() {
        return this.sequenceNr;
    }
}