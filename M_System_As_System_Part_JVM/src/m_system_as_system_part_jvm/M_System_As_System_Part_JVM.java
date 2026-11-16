/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m_system_as_system_part_jvm;

import java.math.BigInteger;
import FD_POS.fn_ps;
import Sum_CDIS.smcd;
import java.util.Scanner;

/**
 *
 * @author acherontas
 */
public class M_System_As_System_Part_JVM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    fn_ps fsp=new fn_ps();
    smcd scd=new smcd();
    System.out.println("Enter 1,2,3,4,5,6 for ur M System:");
    System.out.println("if 0 all systems will shown up");
    int ask_system;
    Scanner console = new Scanner(System.in);
    ask_system=console.nextInt();
    System.out.println();
    BigInteger mynum;
    System.out.println("enter ur number:");
    mynum=console.nextBigInteger();
    int ys,yys,zs,zzs,zzi;
    BigInteger y,yy,z,zz,zi;
    int lri=0;
    int nps=0;
    int gnr=0;
    int main_sum=scd.get_the_sum(mynum.toString());
     if(ask_system==0){
        System.out.println("M1 non shifting  " + mynum + " ::= " + main_sum );
        y=mynum.shiftLeft(5);ys=scd.get_the_sum(y.toString());
        System.out.println("M2 shifts << 5 | " + y + " ::= " + ys );
        yy=mynum.shiftLeft(4);yys=scd.get_the_sum(yy.toString());
        System.out.println("M3 shifts << 4 | " + (yy)+ " ::= " + yys );
        z=mynum.shiftLeft(3);zs=scd.get_the_sum(z.toString());
        System.out.println("M4 shifts << 3 | " + (z)+ " ::= " + zs );
        zz=mynum.shiftLeft(2);zzs=scd.get_the_sum(zz.toString());
        System.out.println("M5 shifts << 2 | " + (zz)+ " ::= " + zzs );
        zi=mynum.shiftLeft(1);zzi=scd.get_the_sum(zi.toString());
        System.out.println("M6 shifts << 1 | " +(zi)+ " ::= " + zzi);
        
    }
    if(main_sum==3){System.out.println("ur number is 3 use 0 for all systems");return;}
    if(main_sum==6){System.out.println("ur number is 6 use 0 for all systems");return;}
    if(main_sum==9){System.out.println("ur number is 9 use 0 for all systems");return;}
    if(ask_system==2){
        y=mynum.shiftLeft(5);ys=scd.get_the_sum(y.toString());
        System.out.println("M2 shifts << 5 | " + y + " ::= " + ys );
        lri=fsp.fnd(ys);
        nps=fsp.fnd_fpos(0,5,lri,5);
        System.out.println("returning : " + lri + " @nps " + nps + "  ::= " + fsp.arr_t[nps]);
        gnr=ys;
        }
    if(ask_system==3){
        yy=mynum.shiftLeft(4);yys=scd.get_the_sum(yy.toString());
        System.out.println("M3 shifts << 4 | " + (yy)+ " ::= " + yys );
        lri=fsp.fnd(yys);
        nps=fsp.fnd_fpos(0,5,lri,4);
        System.out.println("returning : " + lri + " @nps " + nps + "  ::= " + fsp.arr_t[nps]);
        gnr=yys;
        }
    if(ask_system==4){
        z=mynum.shiftLeft(3);zs=scd.get_the_sum(z.toString());
        System.out.println("M4 shifts << 3 | " + (z)+ " ::= " + zs );
        lri=fsp.fnd(zs);
        nps=fsp.fnd_fpos(0,5,lri,3);
        System.out.println("returning : " + lri + " @nps " + nps + "  ::= " + fsp.arr_t[nps]);
        gnr=zs;
        }
    if(ask_system==5){
        zz=mynum.shiftLeft(2);zzs=scd.get_the_sum(zz.toString());
        System.out.println("M5 shifts << 2 | " + (zz)+ " ::= " + zzs );
        lri=fsp.fnd(zzs);
        nps=fsp.fnd_fpos(0,5,lri,2);
        System.out.println("returning : " + lri + " @nps " + nps + "  ::= " + fsp.arr_t[nps]);
        gnr=zzs;
        }
    if(ask_system==6){
        zi=mynum.shiftLeft(1);zzi=scd.get_the_sum(zi.toString());
        System.out.println("M6 shifts << 1 | " +(zi)+ " ::= " + zzi);
        lri=fsp.fnd(zzi);
        nps=fsp.fnd_fpos(0,5,lri,1);
        System.out.println("returning : " + lri + " @nps " + nps + "  ::= " + fsp.arr_t[nps]);
        gnr=zzi;
        }

    //if(gnr==3){System.out.println("its 6");}
    //if(gnr==6){System.out.println("its 3");}
    //if(gnr==9){System.out.println("its 9");}
   
    System.out.println("M1 non shifting " + mynum + " ::== " + main_sum );

    }
    
}
