package pl.advancewars.model;

/**
 * Created by tpalucki
 * Created on 09.04.17.
 */
public class Infantry implements Unit {

    @Override
    public short getAttackRange() {
        return 0;
    }

    @Override
    public short getMoveRange() { return 0; }
}
