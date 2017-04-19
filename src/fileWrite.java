import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWrite {
    public void compineWrite(int[] a ,String sort){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("output.txt",true);
            pw = new PrintWriter(fw);
            pw.write("\n"+sort+ "Output: \n");
            if(a.length>100){
                for(int i=50;i<100;i++){
                    pw.write(a[i]+" ");
                }
            }
            else{
                for(int i=0;i<a.length;i++){
                    pw.write(a[i]+" ");
                }
            }


            pw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.print("Error!!!");
        }
    }

}
