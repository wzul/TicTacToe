import java.io.*;
public class saveScore {
   private int a;
   private int pelik;
   private int isatu[] = new int[5];
   private boolean haha = true;
   private String sstring[] = new String[5];
   public String display(){
      try {
         return displayAll();
      }
      catch (IOException bb){
         return "";}
   }
   public String displayAll()throws IOException{
      File inFile = new File("score.txt");
      int panjangfile = countLines("score.txt");
      FileReader fileReader = new FileReader(inFile);
      BufferedReader bufReader = new BufferedReader(fileReader);
      String[] huhu = new String[panjangfile];
      for (int i=0; i<panjangfile; i++){
         huhu[i]=bufReader.readLine();
      }
      bufReader.close();
      String grimace="";
      a=0;
      pelik = 0;
      //for (int i=0; i<panjangfile; i++){
      //   grimace +=huhu[i]+"\n";
      //}
      for (int i=0; i<isatu.length; i++)
         isatu[i] = 0;
      for (int i=0; i<panjangfile-1;i++){
        // if (huhu[i].equalsIgnoreCase(huhu[i+1])){
        
         sstring[a] = huhu[i];
         for (int zx=0; zx<panjangfile; zx++){
            if (sstring[a].equalsIgnoreCase(huhu[zx])){
               isatu[a]+= 1;
                  //System.out.println("brp" + isatu[a]);
            }
         }
         for (int bb=0; bb<sstring.length; bb++){
            if (sstring[a].equalsIgnoreCase(sstring[bb])){
               pelik++;
               if (bb==sstring.length-1){
                  haha = false;
                  break;
               }
            }
            else {
               haha = true;
            }         
         }
         if (haha)
            a++;
         else
            break;
      }
      
      grimace+=sstring[0] + " - "+isatu[0]+ "x, ";
      grimace+=sstring[1] + " - "+isatu[1]+ "x, "; 
      
      return grimace;
   }
   public void save(String nama)throws IOException{
      File outFile = new File("score.txt");
      int panjangfile = countLines("score.txt");
      String[] grimace = simpan(panjangfile);
      FileOutputStream outFileStream = new FileOutputStream(outFile);
      PrintWriter outStream = new PrintWriter(outFileStream);
      
   //write values of primitive data types to the stream
      outStream.println(nama);
      for (int i=0; i<grimace.length; i++)
         outStream.println(grimace[i]);
   //output done, so close the stream
      outStream.close();
      
   }
   public static int countLines(String filename) throws IOException {
      InputStream is = new BufferedInputStream(new FileInputStream(filename));
      try {
         byte[] c = new byte[1024];
         int count = 0;
         int readChars = 0;
         boolean empty = true;
         while ((readChars = is.read(c)) != -1) {
            empty = false;
            for (int i = 0; i < readChars; ++i) {
               if (c[i] == '\n') {
                  ++count;
               }
            }
         }
         return (count == 0 && !empty) ? 1 : count;
      } 
      finally {
         is.close();
      }
   }
   public static String[] simpan(int panjangfile) throws IOException{
      File inFile = new File("score.txt");
      FileReader fileReader = new FileReader(inFile);
      BufferedReader bufReader = new BufferedReader(fileReader);
      String[] huhu = new String[panjangfile];
      for (int i=0; i<panjangfile; i++){
         //System.out.println(bufReader.readLine());
         huhu[i]=bufReader.readLine();
      }
      bufReader.close();
      return huhu;
   }
}
