import java.util.Random;

public class Luta {
 private Lutador desafiado;
 private Lutador desafiante;
 private int rounds;
 private boolean aprovada;
 private  String local;
    


 public Luta(){
    aprovada = false;
 }
 
 public void marcarLuta(Lutador desafiante, Lutador desafiado) {
    if(desafiado != desafiante && desafiante.getCategoria() == desafiado.getCategoria() 
    && desafiado.getSexo() == desafiante.getSexo()) {
        this.aprovada = true;
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    } else {
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
    }

 }
 
 public void lutar() {
    if(this.aprovada) {
    this.desafiado.Apresentar();
    this.desafiante.Apresentar();
    Random random = new Random();
    int vencedor = random.nextInt(3);
    System.out.println("========RESULTADO DA LUTA=======");
    switch(vencedor) {
        case 0: 
        System.out.println("Empate!!");
        this.desafiado.empatarLuta();
        this.desafiante.empatarLuta();
         break;
       case 1:
       System.out.println("O " + this.desafiado.getNome() + " é o vencedor");  
       this.desafiado.ganharLuta();
       this.desafiante.perderLuta();
        break;
       case 2:
       System.out.println("O " + this.desafiante.getNome() + " é o vencedor");
       this.desafiante.ganharLuta();
       this.desafiado.perderLuta();
       break;

    }  

    } else {
        System.out.println("Luta não poderá acontecer");
    }


 }

 public void estadio() {
    if(this.aprovada) {
        if(this.desafiado.getCategoria() == "Leve") {
            local = "Salvador - BA";
            
        } else {
            local = "São Paulo - SP";
        
        }
        narradores();
    }
    
 }

   public void narradores(){
    System.out.println("A luta de hoje aqui em " + local + " terá a narração de Galvão buendo e comentarios de Satoshi Nakamoto");
 }

public Lutador getDesafiador() {
    return desafiado;
}

public void setDesafiador(Lutador desafiador) {
    this.desafiado = desafiador;
}

public Lutador getDesafiante() {
    return desafiante;
}

public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
}

public int getRounds() {
    return rounds;
}

public void setRounds(int rounds) {
    this.rounds = rounds;
}

public boolean isAprovada() {
    return aprovada;
}

public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
}

}
