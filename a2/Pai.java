import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
   Integer idade;
    Integer contador=0;

    for(int i=0; i<5; i++){
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
      if(idade>18){
        contador++;
      }
    }
    JOptionPane.showMessageDialog(null, "IDades maiores que 18 são "+contador);
  }
}