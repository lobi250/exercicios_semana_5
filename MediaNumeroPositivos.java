import javax.swing.JOptionPane;

public class MediaNumeroPositivos
{
   public static void main(String [] args)
   {
      int numero, soma = 0, contador = 0;
      double media;
      
      do
      {
      
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
        
        if(numero > 0)
        {
         soma = soma + numero;
         
         contador++;

        }
      
      }while(numero > 0);
                                   
      media = soma / contador;
      
      System.out.println(media);
      
   }
}