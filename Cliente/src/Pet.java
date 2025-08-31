class Pet {
    private String nome;
    private String especie; // cachorro, gato, etc.
    private int idade;
    private Cliente dono;

    public Pet(String nome, String especie, int idade, Cliente dono) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() { return nome; }
    public String getEspecie() { return especie; }
    public int getIdade() { return idade; }
    public Cliente getDono() { return dono; }
}