/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfefinal;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;

/**
 *
 * @author Administrator
 */
public interface Interface extends Remote {
    //import java.rmi.Remote;
//import java.rmi.RemoteException;
//import java.rmi.server.ServerNotActiveException;




//public interface Interface extends Remote//pour indiquer que ses methods sont accessible par tous mv java

    public void promethee(int a,int b ,float mat[][],float p[],float q[],float pf[],float ic[], int choix,float sc[][],float fln[],int v[])throws RemoteException,ServerNotActiveException;
     public float [][] recup() throws RemoteException;
      public float [] recup1() throws RemoteException;
        public int [] recup2() throws RemoteException;
      
		
}
    

