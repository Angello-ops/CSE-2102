import Middle.bottom.BClass;
import Middle. alt_bottom.BClass;
import Middle.MClass;

public class Top{
    public static void main(String[] args){
         System.Out.println("Top");

         MClass mclass = new MClass();
         mclass.printMe();

         Middle.bottom.BClass bclass = new Middle.Bottom.BClass();
    }
}