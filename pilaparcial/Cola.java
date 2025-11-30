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
   public int sacar() {
      if (!estaVacia()) {
         int elem = elemcola[1];
         ultimo--;
         return elem;
      } else {
         System.out.println("La cola esta vacia.");
         return -1;
      }
   }
   public boolean masElementos(Cola q2){
      ColaInt aux1 = new ColaInt();
      ColaInt aux2 = new ColaInt();
      int contador1 = 0;
      int contador2 = 0;
      while(!this.estaVacia()){
         aux1.insertar(this.sacar());
         contador1++;
         }
      while(!q2.estaVacia()){
         aux2.insertar(q2.sacar());
         contador2++;
      }
      while(!aux1.estaVacia()){
         this.insertar(aux1.borrar());
      }
      while(!aux2.estaVacia()){
         q2.insertar(aux2.borrar());
      }

      if(contador1 > contador2){
         return true;
      } else {
         return false;
      }
   } 
}
