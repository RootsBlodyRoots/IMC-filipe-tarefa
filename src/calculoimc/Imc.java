
package calculoimc;



public class Imc {
    
    
    public String Situacao;

    //calcula o IMC
    
    public double calcular(double peso, double altura){
        
        return peso / (altura*altura);   
    }

    //retorna situacao IMC
    
    
    
    public String getSituacao() {
        if(!this.Situacao.equals("")){
            
        } else {
            return Situacao = ("critica");
        }
        return ("Acima do peso ");
    }
    
  
        
            
            
        }
      
/*}*/
