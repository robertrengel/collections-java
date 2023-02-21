public enum Materias {
    MATEMATICA("Matematica"),
    FISICA("Fisica"),
    QUIMICA ("Quimica"),
    BIOLOGIA("Biologia"),
    FILOSOFIA("Filosofia"),
    INGLES("Ingles"),
    ESPAÑOL("Español"),
    LENGUAJE("Lengua"),
    HISTORIA("Historia"),
    GEOGRAFIA("Geografia");

    private final String materia;

    Materias (String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
}