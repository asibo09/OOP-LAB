class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */
      ComplexNumCalculator c1=new ComplexNumCalculator();
      
      ComplexNum c2=new ComplexNum();
      c2.build(1, 2);

      ComplexNum c3=new ComplexNum();
      c2.build(2, 3);
      
      c1.add(c2,c3);
      c1.lastRes.toStringRep();

      c2.build(4, 5);
      c3.build(6, 7);
      c1.sub(c2, c3);
      c1.lastRes.toStringRep();

      c2.build(8, 2);
      c3.build(3, -1);
      c1.mul(c2, c3);
      c1.lastRes.toStringRep();
      
  }
}
