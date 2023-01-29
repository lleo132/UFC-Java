public class Lutador {
    private String nome;
    private String nacionalide;
    private int idade;
    private String sexo;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private String titulos;

   public Lutador(String nome, String nacionalide, int idade, String sexo, float peso, float altura, int vitorias, int derrotas, int empates, String titulos) {
    this.nome = nome;
    this.nacionalide = nacionalide;
    this.idade = idade;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    this.titulos = titulos;
    this.setCategoria(peso);
   }
   
   public void Apresentar() {
    System.out.println("Vem ai o lutador, " + this.getNome() + " " + this.getTitulos() + 
    " que tem um total de " + this.getVitorias() + " Vitorias, " + this.getDerrotas() + " Derrotas e " + this.getEmpates() + " empates");
    
   }

   public void Status() {
    System.out.println("--------------------------UFC STATUS LUTADOR-----------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Nacionalidade: " + this.getNacionalide());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Altura: " + this.getAltura());
    System.out.println("Peso: " + this.getPeso() + "KG");
    System.out.println("Categoria: " + getCategoria());
    System.out.println("Vitorias: " + this.getVitorias());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empate: " + this.getEmpates());
    System.out.println("Titulos: " + this.getTitulos());


   }

   public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
   }

   public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
   }

   public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalide() {
        return nacionalide;
    }

    public void setNacionalide(String nacionalide) {
        this.nacionalide = nacionalide;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(float peso) {
        if (peso < 52.2) {
            categoria = "Invalido";
        } else if(peso <= 70.3) {
            categoria = "Leve";
        }else if(peso <=83.9) {
            categoria = "Medio";
        }else if(peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "INVALIDO";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }





   





}
