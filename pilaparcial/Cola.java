package pilaparcial;

public class Cola{ 
   private final int maxcola = 10;
   private int ultimo;
   private int []elemcola;

   public Cola(int i){
      elemcola = new int[maxcola];
      ultimo = 0;
   }
   public boolean estaVacia(){
      if(this.ultimo == 0)
         return true;
      else
         return false;
   }
   public boolean estaLlena(){
      if (this.ultimo == maxcola)
         return true;
      else
         return false;
   }
   public void insertar(int elem){
      if(!estaLlena()){
         ultimo++;
         elemcola[ultimo] = elem;
      }
   }
   
   public int borrar(){
      int aux = this.elemcola[0];
      for(int i = 0; i<this.ultimo; i++){
        this.elemcola[i] = this.elemcola[i+1];
        this.ultimo--;
      }
      return aux;
    }
    public void vaciar(){
        this.ultimo = 0;
    }
   public boolean masElementos(Cola cola1, Cola cola2) {
    Cola aux1 = new Cola(maxcola);
    Cola aux2 = new Cola(maxcola);
    int c1 = 0, c2 = 0;
      while (!cola1.estaVacia() || !cola2.estaVacia()) {
         if (!cola1.estaVacia()) {
               int elem1 = cola1.borrar();
               aux1.insertar(elem1);
               c1++;
         }
         if (!cola2.estaVacia()) {
               int elem2 = cola2.borrar();
               aux2.insertar(elem2);
               c2++;
         }
      }
      return c1 > c2;
   } 
}
