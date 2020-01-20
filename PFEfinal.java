/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfefinal;

import java.util.Scanner;
import javax.swing.*;
public class PFEfinal {
 //private int mat[][], pcri[],act[],nbcri,nbact;
 
 public static boolean surclassement(int mat[][],int pds[],int a1,int a2){
   int s1=0,s2=0;
     for(int i=0;i<pds.length;i++)
     {
       if (mat[a1][i]>  mat[a2][i])
           s1+=pds[i];
       else if (mat[a1][i]<mat[a2][i])
           s2+=pds[i];
     }
      if(s1>s2)
          return true;
      return false;
 }
 public static double[][] concordance(int mat[][],int tabp[],int c){
double t[][]=new double[c][c];
   int s=0;
   for(int p=0;p<tabp.length;p++)
       s=s+tabp[p];
   // double mat [][];
   // mat=new double[y.length][y.length];
    //int n=v.length;
    //int r=t.length;
   
    for(int i=0;i<c;i++){
        for(int j=0;j<c;j++){
        int s1=0;
           
           
              
          
        
                for(int k=0;k<tabp.length;k++){
                  
                    if(mat[i][k]>=mat[j][k])
                        s1=s1+tabp[k];
                    //mat[i][j]=(s1/s);
                
         /*double r=(double)s1/s;
         t[i][j]=r;*/
                
         
         /*double r=(double)s1/s;
         t[i][j]=r; */ 
         double r=(double)s1/s;
         t[i][j]=r; 
                }
    //double r=(double)s1/s;
        // t[i][j]=r;
           }
        

  
 }
    return t;
 }
 public static String[][]testconcordance(double mat[][],double c,int a) throws Exception {
     String  s[][]=new String[a][a];
      if((c<=0) || (c>1))
       throw new Exception();
      
     else{
         for(int i=0;i<a;i++){
             for(int j=0;j<a;j++){
                 if(mat[i][j]<c)
                     s[i][j]="Non P";
                 else s[i][j]=String.valueOf(mat[i][j]) ; 
             }
         }
     }
      return s;
 }
   public static  int [][] disconcordance(int mat[][],int in,int a,int c){
       
       int m[][]=new int[a][a];
       for(int j=0;j<a;j++){
           for(int k=0;k<a;k++){
            if(mat[j][in]>=mat[k][in])
              m[j][k]=0;  
            else
                m[j][k]=(mat[k][in]-mat[j][in]);
           }
       }
     
       
    return m;   
   } 
   public static String[][] testconcordance2(double mat[][],double ind1,double ind2,int a)throws Exception{
  if(ind1>1 || ind1<=0 || ind2>1 || ind2<=0)
      throw new Exception();
       String s[][]=new String[a][a]; 
   for(int i=0;i<a;i++){
       for(int j=0;j<a;j++){
           if(i==j)
               s[i][j]="/";
           else {if(mat[i][j]>=ind1 )
               s[i][j]=String.valueOf( mat[i][j]);
           else if(mat[i][j]<ind1 && mat[i][j]>=ind2)
               s[i][j]="P faible";
           else s[i][j]="Non P";
        }
       }
   }
   return s;
   }
  
   public static String[][] testdiscordance(int t[][],int ind,int a){
       String s[][]=new String[a][a];
       for(int i=0;i<a;i++){
           for(int j=0;j<a;j++){
             if(i==j)
                 s[i][i]="/";
             else{
                 if(t[i][j]<ind)
                     s[i][j]="S";
                 else s[i][j]= "Non S";
             }
                 
           }
       }
       return s;
   }
   public static int noyau(String s[][],int ind,int a){
    
       if(ind<0 || ind>=a)
           System.out.println("Erreur indice");
       else{
           int i=0;
           while(i<a)
           {   if(i==ind)
               i++;
               else{   if(("Non P".equals(s[i][ind]))||((("P".equals(s[i][ind]))&&("P".equals(s[ind][i]))))) 
                     i++;
               
           else return -1;
               
       }}
           
           
       }
   return 1;
   }
   /* public static void main(String[] args) {
       int c=4, mat[][]=new int[][]{
           {12,23,6,2},
           {10,33,7,4},
           {9,20,10,5},
           {10,5,8,6},
       };
       String f[][]=new String[c][c];
       Scanner sc=new Scanner(System.in);
       int t[]=new int[]{2,3,2,3};
      double m[][];
      m=concordance(mat,t,c);
      System.out.print("Matrice de concordance\n");
      for(int i=0;i<t.length;i++)
      {for(int j=0;j<c;j++){
          System.out.print(m[i][j]+"|");
         // System.out.println("\n");
      }
      System.out.print("\n");
    }
      System.out.println("test de concordance\n");
     double cn=0.5;
      String s[][]=testconcordance(m,cn ,c);
      for(int l=0;l<c;l++)
      {for(int n=0;n<c;n++){
          System.out.print(s[l][n]+"|");
         String ab="Non P";
          if(s[l][n]==ab)
             f[l][n]=ab;
// System.out.println("\n");
      }
      System.out.print("\n");
    }
    int ma[][];
   System.out.print("les matrices de disconcordance\n");
    for(int a=0;a<c;a++){
   System.out.print("matrice de critère "+(a+1));
   System.out.print("\n");
       ma=disconcordance(mat,a,4,4);
     for(int i=0;i<t.length;i++)
      {for(int j=0;j<c;j++){
          System.out.print(ma[i][j]+"|");
         // System.out.println("\n");
      }
      System.out.print("\n");
}}
 System.out.println("test discordance\n");
    String sa[][];
     int u;
 for(int r=0;r<t.length;r++){
     System.out.println("Entrer D pour critere"+(r+1) );
     u=sc.nextInt();
     System.out.println("test discordance pour critere"+(r+1));
     sa=testdiscordance(disconcordance(mat,r,c,c),u,r,c);
  
     for(int in=0;in<c;in++){
      for(int l=0;l<c;l++){
        System.out.print(sa[in][l]+" |");
        if(sa[in][l]=="Non P")
            f[in][l]="Non P";
                  }
      System.out.println("\n");
      }
    }
 for(int i=0;i<c;i++){
     for(int j=0;j<c;j++){
         if(i==j)
             f[i][i]=String.valueOf(1);
         else{
             if(f[i][j]!="Non P")
                 f[i][j]="P";
         }
     }
 }
 System.out.println("Matrice de surclassement\n");
 for(int i=0;i<c;i++){
     for(int j=0;j<c;j++){
         System.out.print("|"+f[i][j]+"|");
         }
     System.out.print("\n");
     }
 System.out.println("noyau\n");
 int no[]=new int[4];
 for(int y=0;y<c;y++){
   no[y]=noyau(f,y,c);
 System.out.println("|"+no[y]+"|");
 }
 String str[][]=new String[][]{
     {"1","Non P","Non P","Non P"},
     {"P","1","Non P","Non P"},
      {"Non P","Non P","1","Non P"},
       {"Non P","Non P","Non P","1"},
 };
 System.out.println("noyau\n");
 int nor[]=new int[4];
 for(int y=0;y<c;y++){
   nor[y]=noyau(str,y,c);
 System.out.println("|"+nor[y]+"|");
 }
    }*/
  }
