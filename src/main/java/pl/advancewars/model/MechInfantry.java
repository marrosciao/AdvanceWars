package pl.advancewars.model;

/**
 * Created by tpalucki
 * Created on 09.04.17.
 */
public class MechInfantry extends Infantry implements Unit {

    @Override
    public short getAttackRange() {
        return 0;
    }
}
