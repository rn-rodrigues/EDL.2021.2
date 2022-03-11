

// A linguagem escolhida foi Java

import java.util.Arrays;		//(nome=java.util.Arrays, propriedade=biblioteca, tempo=pr�-processamento)

public class TestMergeSort {    // //(nome=TestMergeSort, propriedade=classe, tempo= design )

   // Ordenar array v entre posicoes start e end
   static void mergeSort(int v[], int start, int end) {
      if (start == end) return;        //(nome=if, propriedade=fun�?o, tempo=compila�?o)
      int middle = (start + end) / 2;  
      mergeSort(v, start, middle);     //(nome=mergeSort, propriedade=fun�?o, tempo=liga�?o)
      mergeSort(v, middle+1, end);     
      merge(v, start, middle, end);    
   }

   // Juntar duas metadas ja ordenadas
   static void merge(int v[], int start, int middle, int end) {
      int aux[] = new int[end-start+1]; // Novo array temporario
      
      int p1 = start;    //(nome=p1, propriedade=valor, tempo=implementa�?o)
      int p2 = middle+1; //(nome=p1, propriedade=valor, tempo=implementa�?o)
      int cur = 0;       //(nome=p1, propriedade=valor, tempo=implementa�?o)
      while (p1 <= middle && p2 <= end) { //((p1 <= middle && p2 <= end), propriedade=inteiro, tempo=implementa�?o)
         if (v[p1] <= v[p2]) aux[cur++] = v[p1++]; 
         else aux[cur++] = v[p2++];                
      }
      while (p1<=middle) aux[cur++] = v[p1++]; 
      while (p2<=end)    aux[cur++] = v[p2++];
      
      // Copiar array aux[] para v[]
      for (int i=0; i<cur; i++) v[start+i] = aux[i];
   }

   // -----------------------------------------------------------

   public static void main(String args[]) {
      int v[] = {1,5,2,8,4,3,7,6}; // Inicializacao de array

      System.out.println("Antes  do mergeSort: " + Arrays.toString(v));
      mergeSort(v, 0, v.length-1); //(nome=mergeSort, propriedade=fun�?o, tempo=carregamento)
      System.out.println("Depois do mergeSort: " + Arrays.toString(v));
   }
   
}