package br.com.sbs.gresmc;

public enum MaritalStatus {
    SINGLE("Solteiro(a)"),
    MARRIED("Casado(a)"),
    DIVORCED("Divorciado(a)"),
    WIDOWER("Viúvo(a)"),
    OTHERS("Outros");

    private final String displayName;

    MaritalStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
