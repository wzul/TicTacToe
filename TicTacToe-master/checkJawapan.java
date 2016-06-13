public class checkJawapan {
   public static int checkJawapan(String[] jawapan, int kedudukan, boolean[] a){
      switch(kedudukan){
         case 0:
            return jawapan0(jawapan, a);
         case 1:
            return jawapan1(jawapan, a);
         case 2:
            return jawapan2(jawapan, a);
         case 3:
            return jawapan3(jawapan, a);
         case 4:
            return jawapan4(jawapan, a);
         case 5:
            return jawapan5(jawapan, a);
         case 6:
            return jawapan6(jawapan, a);
         case 7:
            return jawapan7(jawapan, a);
         case 8:
            return jawapan8(jawapan, a);
      }
      return 0;
   }
   
   public static int checkdraw(boolean[] a){
      for (int i=0; i<9; i++){
         if (a[i]==false){
            if (i==8)
               return 2;
         }
         else
            break;
      }  
      return 0;
   }

   public static int jawapan0(String[] jawapan, boolean[] a){
      if (jawapan[0] == jawapan[1] && jawapan[0] == jawapan[2])
         return 1;
      if (jawapan[0] == jawapan[3] && jawapan[0] == jawapan[6])
         return 1;
      if (jawapan[0] == jawapan[4] && jawapan[0] == jawapan[8])
         return 1;         
      return checkdraw(a);
   }
   public static int jawapan1(String[] jawapan, boolean[] a){
      if (jawapan[0] == jawapan[1] && jawapan[0] == jawapan[2])
         return 1;
      if (jawapan[1] == jawapan[4] && jawapan[1] == jawapan[7])
         return 1; 
      return checkdraw(a);
   }
   public static int jawapan2(String[] jawapan, boolean[] a){
      if (jawapan[0] == jawapan[1] && jawapan[0] == jawapan[2])
         return 1;
      if (jawapan[2] == jawapan[5] && jawapan[2] == jawapan[8])
         return 1;
      if (jawapan[2] == jawapan[4] && jawapan[2] == jawapan[6])
         return 1;
      return checkdraw(a);
   }
   public static int jawapan3(String[] jawapan, boolean[] a){
      if (jawapan[0] == jawapan[3] && jawapan[0] == jawapan[6])
         return 1;
      if (jawapan[3] == jawapan[4] && jawapan[3] == jawapan[5])
         return 1;
      return checkdraw(a);
   }
   public static int jawapan4(String[] jawapan, boolean[] a){
      if (jawapan[0] == jawapan[4] && jawapan[0] == jawapan[8])
         return 1;
      if (jawapan[1] == jawapan[4] && jawapan[1] == jawapan[7])
         return 1;
      if (jawapan[2] == jawapan[4] && jawapan[2] == jawapan[6])
         return 1;
      if (jawapan[3] == jawapan[4] && jawapan[3] == jawapan[5])
         return 1;
      return checkdraw(a);
   }
   public static int jawapan5(String[] jawapan, boolean[] a){
      if (jawapan[3] == jawapan[4] && jawapan[3] == jawapan[5])
         return 1; 
      if (jawapan[2] == jawapan[5] && jawapan[2] == jawapan[8])
         return 1; 
      return checkdraw(a);
   }
   public static int jawapan6(String[] jawapan, boolean[] a){
      if (jawapan[0] == jawapan[3] && jawapan[0] == jawapan[6])
         return 1; 
      if (jawapan[2] == jawapan[4] && jawapan[2] == jawapan[6])
         return 1; 
      if (jawapan[6] == jawapan[7] && jawapan[6] == jawapan[8])
         return 1; 
      return checkdraw(a);
   }
   public static int jawapan7(String[] jawapan, boolean[] a){
      if (jawapan[1] == jawapan[4] && jawapan[1] == jawapan[7])
         return 1;
      if (jawapan[6] == jawapan[7] && jawapan[6] == jawapan[8])
         return 1;       
      return checkdraw(a);
   }
   public static int jawapan8(String[] jawapan, boolean[] a){
      if (jawapan[6] == jawapan[7] && jawapan[6] == jawapan[8])
         return 1;
      if (jawapan[2] == jawapan[5] && jawapan[2] == jawapan[8])
         return 1;
      if (jawapan[0] == jawapan[4] && jawapan[0] == jawapan[8])
         return 1; 
      return checkdraw(a);
   }
}