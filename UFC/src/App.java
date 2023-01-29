import javax.swing.plaf.ListUI;

public class App {
    public static void main(String[] args) throws Exception {
        Lutador[] lutador = new Lutador[4];
        
        lutador[0] = new Lutador("Pretty Boy", "França", 31, "Masculino", 68.9f, 1.78f, 11, 2, 1,
        "Campeão Francês 2010, 2014, 2022");
        lutador[1] = new Lutador("Putscript", "Brasil", 29, "Masculino", 57.8f, 1.68f, 14, 2, 3,
         "Campeão Brasileiro 2022");
         lutador[2] = new Lutador("Snapshadows", "EUA", 35, "Masculino", 80.9F, 1.65F, 12, 2, 1,
         "Campeão Americano");
         lutador[3] = new Lutador("Dead code", "Australia", 28, "Masculino", 81.6f, 1.93f, 13, 0, 2
        , "Campeão Australiano 2022");
  
    Luta UEC01 = new Luta();
    UEC01.marcarLuta(lutador[0], lutador[1]);   
    UEC01.estadio();    
    UEC01.lutar(); 
    lutador[0].Status();
    lutador[1].Status();
        
}
}