
package zoo;
import java.util.Scanner;

public class main {

  
    public static void main(String[] args) {
    //Animal	p = new Animal();		
    rusa	p = new rusa();		
    Scanner	sc = new Scanner(System.in);		
    int inp	= 0;		
do {
System.out.println("Masukkan: 0	untuk	memberi air, 1 untuk memberi rumput, 999 untuk keluar");
    inp = sc.nextInt(); 
    switch(inp){
       case 0: p.beriAir(); break;
       case 1: p.beriMakan(); break;
    }
    p.displayAnimal();
  }while (inp!=999);
   
 }
}
