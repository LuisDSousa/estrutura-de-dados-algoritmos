public class Professor {
    private int idProfessor;
    
    public Professor(){

    }
    public Professor(String nome, int idade, long cpf, int idProfessor) {
        this.idProfessor = idProfessor;
    }
    public int getIdProfessor() {
        return idProfessor;
    }
    public String toString() {
        return String.format(super.toString() + "Professor ID:" + getIdProfessor());
    }

}

// ainda tem q mexer