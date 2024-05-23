package menus;

public abstract class ChoicePersona {
    private boolean readMessageEntrance = false;
    private boolean killedWolf = false;
    private boolean skinnedWolf = false;
    private boolean tookArgentDaggerFromEntrance = false;
    private boolean tookCollarWolf = false;
    private boolean tookPendantWolf = false;
    private boolean readMessageFromPendant = false;
    private boolean tookSmallKey = false;
    private boolean tookArgentKeyFromEntrance = false;
    private boolean talkedToOrk1 = false;
    private boolean talkedToOrk2 = false;
    private boolean talkedToOrk3 = false;
    private boolean talkedToOrk4 = false;
    private boolean talkedToOrk5 = false;
    private boolean talkedToOrk6 = false;

    public boolean isKilledOrk() {
        return killedOrk;
    }

    public void setKilledOrk(boolean killedOrk) {
        this.killedOrk = killedOrk;
    }

    private boolean killedOrk = false;

    public boolean isTalkedToOrk1() {
        return talkedToOrk1;
    }

    public void setTalkedToOrk1(boolean talkedToOrk1) {
        this.talkedToOrk1 = talkedToOrk1;
    }

    public boolean isTalkedToOrk2() {
        return talkedToOrk2;
    }

    public void setTalkedToOrk2(boolean talkedToOrk2) {
        this.talkedToOrk2 = talkedToOrk2;
    }

    public boolean isTalkedToOrk3() {
        return talkedToOrk3;
    }

    public void setTalkedToOrk3(boolean talkedToOrk3) {
        this.talkedToOrk3 = talkedToOrk3;
    }

    public boolean isTalkedToOrk4() {
        return talkedToOrk4;
    }

    public void setTalkedToOrk4(boolean talkedToOrk4) {
        this.talkedToOrk4 = talkedToOrk4;
    }

    public boolean isTalkedToOrk5() {
        return talkedToOrk5;
    }

    public void setTalkedToOrk5(boolean talkedToOrk5) {
        this.talkedToOrk5 = talkedToOrk5;
    }

    public boolean isTalkedToOrk6() {
        return talkedToOrk6;
    }

    public void setTalkedToOrk6(boolean talkedToOrk6) {
        this.talkedToOrk6 = talkedToOrk6;
    }

    public boolean isReadMessageEntrance() {
        return readMessageEntrance;
    }

    public boolean isKilledWolf() {
        return killedWolf;
    }

    public boolean isSkinnedWolf() {
        return skinnedWolf;
    }

    public boolean isTookArgentDaggerFromEntrance() {
        return tookArgentDaggerFromEntrance;
    }

    public boolean isTookCollarWolf() {
        return tookCollarWolf;
    }

    public boolean isTookPendantWolf() {
        return tookPendantWolf;
    }

    public boolean isReadMessageFromPendant() {
        return readMessageFromPendant;
    }

    public void setReadMessageFromPendant(boolean readMessageFromPendant) {
        this.readMessageFromPendant = readMessageFromPendant;
    }

    public void setTookCollarWolf(boolean tookCollarWolf) {
        this.tookCollarWolf = tookCollarWolf;
    }

    public void setTookPendantWolf(boolean tookPendantWolf) {
        this.tookPendantWolf = tookPendantWolf;
    }

    public void setTookArgentDaggerFromEntrance(boolean tookArgentDaggerFromEntrance) {
        this.tookArgentDaggerFromEntrance = tookArgentDaggerFromEntrance;
    }

    public void setReadMessageEntrance(boolean readMessageEntrance) {
        this.readMessageEntrance = readMessageEntrance;
    }

    public void setKilledWolf(boolean killedWolf) {
        this.killedWolf = killedWolf;
    }

    public void setSkinnedWolf(boolean skinnedWolf) {
        this.skinnedWolf = skinnedWolf;
    }

    public boolean isTookSmallKey() {
        return tookSmallKey;
    }

    public void setTookSmallKey(boolean tookSmallKey) {
        this.tookSmallKey = tookSmallKey;
    }

    public void setTookArgentKeyFromEntrance(boolean tookArgentKeyFromEntrance) {
        this.tookArgentKeyFromEntrance = tookArgentKeyFromEntrance;
    }

    public boolean isTookArgentKeyFromEntrance() {
        return tookArgentKeyFromEntrance;
    }
}
