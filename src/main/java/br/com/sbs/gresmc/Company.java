package br.com.sbs.gresmc;

public enum Company {
    PMC("PMC"),
    CPSMC("CPSMC"),
    CMC("CMC"),
    CMT("CMT");

    private String displayName;

    Company(String type) {
        this.displayName = type;
    }

    public String getDisplayName() {
        return displayName;
    }
}
