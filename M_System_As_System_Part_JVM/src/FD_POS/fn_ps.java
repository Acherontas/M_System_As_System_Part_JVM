/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FD_POS;

import static java.lang.Math.abs;

/**
 *
 * @author acherontas
 */
public class fn_ps {
    public int[] arr_t={5,1,2,4,8,7};
     
    public int fnd( int by_me){
    int xli=0; int nt=0;
   for( int i=0;i<=6;i++)
   {
      if(by_me==arr_t[i]){xli=i;nt=1;}
      if(nt==1){break;}
   }
   return xli;
}
    
    
public int fnd_fpos( int min_pos, int max_pos, int current_pos, int pivot){
    int praxi=current_pos-pivot;
   praxi=abs(praxi);
    int xv=0;
    int mark_xv=0;
   int stp=0;
    int posx=0; 
    int cnt=0;
    int fli=0;
   xv=current_pos-1;
   //System.out.println("using min_pos " + min_pos + " max_pos " + max_pos + " current_pos " + current_pos + " pivot " + pivot + " xv " + xv);
   while(7>min_pos){
            mark_xv=xv;
            
            stp+=1;
            if(xv<0){  
	                xv=max_pos-1;
                        mark_xv=xv;                       
                        fli+=1;
                     }
        cnt+=1;
        if(cnt==pivot && fli==0){posx=mark_xv;                   
                      //System.out.println("returning  cnt " + cnt + " praxi " +  praxi + " posx " + posx + " fli " + fli);
                        break;}
        if(cnt==pivot && fli>0){posx=mark_xv+1;     
        //System.out.println("returning  cnt " + cnt + " praxi " +  praxi + " posx " + posx + " fli " + fli);
        break;}
        min_pos+=1;
        xv=xv-1;
    }
    //cout<<posx <<"\n";
    return posx;
}

}
