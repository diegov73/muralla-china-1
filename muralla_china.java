import java.io.IOException;
import java.util.Random;

public class Main
{
    static Random Srand = new Random();

    static int genRam(int Max){
        int x = Srand.nextInt(Max)+1;
        return x;
    }
    
    static int VG(int[]H, int i, int g){
        
        if(i-g<0){
            return g;
        }
        else{
            if(H[i]<H[i-g]){
                return g;
            }
            else{
                g++;
                return VG(H,i,g);
            }
        }
    }
	public static void main(String[] args) {
		
		int L = 5;
        int H[] = new int[L];
        int n = 10;
        
        for(int r = 0; r<H.length; r++){
            H[r]=genRam(n);
            System.out.print(H[r] + " ");
        }
        
        System.out.println(" ");
            
        for(int i = 0; i<H.length; i++){
            System.out.print(VG(H,i,1) + " ");
        }
	}
}
