package menus;

public class ChoicePersona {
    private boolean readMessageEntrance = false;
    private boolean killedWolf = false;
    private boolean skinnedWolf = false;
    private boolean tookArgentDaggerFromEntrance = false;
    private boolean tookCollarWolf = false;
    private boolean tookPendantWolf = false;
    private boolean readMessageFromPendant = false;

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
}
