package calculadoraja;


public class CalculadoraJa {

    float x;
    float y;
    float r;
    
    public CalculadoraJa (float a, float b){
        
        x = a;
        y = b;
        r = 0;
    }
    public void imprimirResultado(){
        System.out.println("El resultado es = " + r);
    }
    public float sumar (float a, float b) {
        
        x = a;
        y = b;
        r = a + b;
        return r;
    }
    public float restar (float a, float b){
        
        x = a;
        y = b;
        r = a - b;
        return r;
    }
    public float multiplicar (float a, float b){
        x = a;
        y = b;
        r = a * b;
        return r;
    }
    public float dividir (float a, float b){
        x = a;
        y = b;
        r = a/b;
        return r;
    }
    
    public static void main(String[] args) {
        CalculadoraJa obj1 = new CalculadoraJa(0,0);
        obj1.sumar(20 , 10);
        obj1.imprimirResultado();
        obj1.restar(20,10);
        obj1.imprimirResultado();
        obj1.multiplicar(20,10);
        obj1.imprimirResultado();
        obj1.dividir(20,10);
        obj1.imprimirResultado();   
    }  
}