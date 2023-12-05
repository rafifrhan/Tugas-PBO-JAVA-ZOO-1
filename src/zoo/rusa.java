
package zoo;


public class rusa extends Animal{
    private String jenis;
    public rusa (){
        super(); jenis = "rusa ";
    }
    public void cekKondisiTumbuh() { 
        if(getJumlahAir() >=2 && getJumlahrumput() >=3) { tumbuh();
        } 
    }
    public void tumbuh() { 
        if(getStatusTumbuh() <4) { 
            setJumlahAir(getJumlahAir() - 2); 
            setJumlahrumput(getJumlahrumput() - 3); 
            setStatusTumbuh(getStatusTumbuh() + 1); } }
    
    public String getJenis() { 
        return jenis;
    }

}
