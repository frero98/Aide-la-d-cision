/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfefinal;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static pfefinal.PFEfinal.disconcordance;
import static pfefinal.PFEfinal.noyau;
import static pfefinal.PFEfinal.surclassement;
import static pfefinal.PFEfinal.testconcordance;
import static pfefinal.PFEfinal.testconcordance2;
import static pfefinal.PFEfinal.testdiscordance;

/**
 *
 * @author Administrator
 */
public class electre2 extends javax.swing.JFrame {

    /**
     * Creates new form electre2
     */
    public electre2() {
        initComponents();
         //setEnabled(false);
        pan1.setLayout(new BoxLayout(pan1,BoxLayout.Y_AXIS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        mat1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        pan1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Matrice d\"Evaluation(Critères max/min) :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        mat1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mat1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        mat1.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(mat1);

        jScrollPane1.setViewportView(jScrollPane2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre d'Actions :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de Critères :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        pan1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indices de Concordance :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jScrollPane6.setViewportView(pan1);

        jScrollPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indice de Concordance :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane4.setAutoscrolls(true);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane4.setViewportView(tab);

        jScrollPane7.setViewportView(jScrollPane4);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veillez Introduire les Seuils :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Seuil de concordance faible :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Seuil de concordance fort :");

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veillez Remplir les Seuils de Discordance !", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tb);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Tester");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        jScrollPane8.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            txt1.selectAll();
            txt2.selectAll();
            double t1=Double.parseDouble(txt1.getText());
            double t2=Double.parseDouble(txt2.getText());
      int a=Integer.parseInt(lab1.getText());
      int b=Integer.parseInt(lab2.getText());
      String test[][]=new String[a][a];
      double d[][]=new double[a][a];
      for(int i=0;i<a;i++){
          for(int j=0;j<a;j++){
              d[i][j]=(double) tab.getValueAt(i, j+1);
          }
      }
      int som=0;
      for(int i=0;i<b;i++)
      som+=Integer.parseInt(tb.getValueAt(i, 1).toString());
      //inter e=new inter();
       //int a=Integer.parseInt(e.gett1().getText());
    int m[][]=new int [a][b];
    // Object ol[]=new Object[b]; 
    int t[]=new int[b];
    //int to[]=new int[b];
   String dr[]=new String[b];
   String tf[][]=new String[a][b];
   for(int l=0;l<b;l++){
       dr[l]=(String) tb.getValueAt(l, 1);
       t[l]=Integer.parseInt(dr[l]);
       System.out.println(t[l]);
      // dr[l]=(String) tb.getValueAt(l, 2);
       //to[l]=Integer.parseInt(dr[l]);
   }
      for(int i=0;i<a;i++)
      { for(int j=1;j<=b;j++)
      {
         
          //t[j-1]=(Integer)tb.getValueAt(i, 1);
          tf[i][j-1]=(String)mat1.getValueAt(i, j).toString();
          m[i][j-1]=Integer.parseInt(tf[i][j-1]);
          System.out.println(m[i][j-1]);
          
      }
      }
      // d=concordance(m,t,a);
       
      // for(int i=0;i<a;i++){
          // for(int j=0;j<a;j++)
       
               //System.out.println(d[i][j]);}
     // tsc.selectAll();
    //  double sc=Double.parseDouble(tsc.getText());
      result_electre res=new result_electre();
   res.getlabel1().setText(""+som);
   res.getlab3().setText(txt1.getText());
   res.getlabel2().setText(txt2.getText());
   
    //{ for(int j=0;j<Integer.parseInt(mat1.getText());j++)
   //     m[i-1][j]=(int)mat1.getValueAt(i,j);
   // d=concordance(m,t,a);
   // }
   String tn[][] =new String[a][a];
    String r[]=new String[a+1];
    r[0]="Actions";
    for(int k=0;k<a;k++)
        r[k+1]=(String) mat1.getValueAt(k, 0);
    Object o[][]=new Object[a][a+1];
  for(int i=0;i<a;i++){
      for(int j=0;j<a+1;j++){
          if(j==0)
              o[i][0]=r[i+1];
          else{
              o[i][j]=d[i][j-1];
          }
      }
  }
  Object od[][]=new Object[a][a+1];
  tn=testconcordance2(d,t1,t2,a);
  for(int i=0;i<a;i++){
      for(int j=0;j<a+1;j++){
         //if(surclassement(m,t,i,j))
          if(j==0)
              od[i][0]=r[i+1];
          else{
             if(surclassement(m,t,i,j-1)&& tn[i][j-1]!="Non P" && tn[i][j-1]!="P faible")
                 od[i][j]="P";
                 else if((surclassement(m,t,i,j-1)) && (tn[i][j-1]=="P faible"))
                     od[i][j]="P faible";
                 else od[i][j]="Non P";         
             
          } 
          if(od[i][j]=="Non P")
           test[i][j-1]="Non P";
          else if(od[i][j]=="P")
              test[i][j-1]="P";
      }
  }
  String srt[]=new String[a+1];
  srt[0]="Action";
 for(int i=0;i<a;i++)
      srt[i+1]=(String) mat1.getValueAt(i, 0);
  int cor[][]=new int[a][a];
 /* for(int i=0;i<b;i++){
     cor=disconcordance( m,i, a,b );
     //srt[i+1]=(String) mat1.getValueAt(i, 0);
     Object ol[][]=new Object[a][a+1]; 
      JLabel lp=new JLabel();
      lp.setText("Critère : "+tb.getValueAt(i, 0));
      for(int u=0;u<a;u++){
          
             //lp.setText("Critère"+r[].toString());
         for(int j=0;j<a+1;j++)
         {
             if(j==0)
             ol[u][j]=srt[u+1];
         else ol[u][j]=cor[u][j-1]; 
         }
     }
      JTable tr=new JTable();
      //tr.setSize(70, 60);
      tr.setModel(new DefaultTableModel(ol,srt));
      
     //JLabel lp=new JLabel();
     
      res.getp1().add(lp);
      res.getp1().add(tr);
  }*/
  res.gettabs().setModel(new DefaultTableModel(od,r));
   // res.gettabc().setModel(new DefaultTableModel(o,r));
    res.setVisible(true);
    for(int i=0;i<b;i++){
        JLabel lb=new JLabel();
        String s=(String)tb.getValueAt(i, 2);
    String dt=(String) tb.getValueAt(i, 0);
      JLabel l2=new JLabel(" ");
      l2.setSize(50, 10);
       JLabel l3=new JLabel(" ");
      l3.setSize(50, 5);
    lb.setText("Critère :"+dt +", Seuil de discordance = "+s);
      //String s=(String)tb.getValueAt(i, 2);
      int ind=Integer.parseInt(s);
      Object disc[][]=new Object[a+1][a+1];
      JTable tp=new JTable();
     String re[][]=new String[a][a];
      re=testdiscordance(disconcordance( m,i, a,b ),ind,a);
      disc[0][0]="Action";
      for(int u=0;u<a+1;u++){
          
             //lp.setText("Critère"+r[].toString());
         
             
             for(int j=0;j<a+1;j++)
         {
            
           if(u==0 && j==0)  
               disc[u][j]="Action";
           else if(u==0 && j!=0)
                disc[u][j]=srt[j];
                 
           else    if(j==0 && u!=0)
                 disc[u][j]=srt[u];
                
         else disc[u][j]=re[u-1][j-1]; 
         
         if (disc[u][j]=="Non S")
             test[u-1][j-1]="Non P";
         }
     } 
      JTable ou=new JTable();
     ou.setModel(new DefaultTableModel(disc,srt));
      res.getpan().add(l3);
     res.getpan().add(lb);
      res.getpan().add(l2);
      res.getpan().add(ou);
    }
    for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
            if(i==j)
                test[i][j]="/";
            else{  if(test[i][j]!="Non P"){
                test[i][j]="P";
            }
            
        }
        }
    }
    Object fin[][]=new Object[a][a+1];
    for(int i=0;i<a;i++)
        for(int j=0;j<a+1;j++){
            if(j==0)
                fin[i][j]=r[i+1];
            else fin[i][j]=test[i][j-1];
        }
    res.gettabf().setModel(new DefaultTableModel(fin,r));
   int ens[]=new int[a];
  String noy[]=new String[a];
  int j=0; 
  for(int i=0;i<a;i++){
        r[i+1]=(String) mat1.getValueAt(i, 0);
    ens[i]=noyau(test,i,a); 
    
    if(ens[i]==1)
       // while(j<a)
        //{
        noy[i]=r[i+1];
       
        //}
   else noy[i]="/";
  // j++;
    
   } 
  String noyo[];
  int n=0;
  for(int i=0;i<a;i++){
     if(noy[i]!="/")
         n++;
  }
  noyo=new String[n];
  int c=0;
  while(c<n){
     int k=j;
      for( k=j;k<a;k++){
       if(noy[k]!="/") 
       {  noyo[c]=noy[k];
       System.out.println(noyo[c]+"\n");
       c++;}
      }
  }
  //noyo=new String[n];
    Object noya[][]=new Object[n][1];
    for(int i=0;i<noyo.length;i++)
        noya[i][0]=noyo[i];
    String s[]=new String[]{"Actions potentiels"};
    res.gettabn().setModel(new DefaultTableModel(noya,s));
    //res.getlabel2().setText(.getText());
    int sum=0;
    for(int i=0;i<b;i++)
        sum+=t[i];
    res.getlabel1().setText(String.valueOf(sum));
    }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, " Entrez un nombre svp", " ", JOptionPane.ERROR_MESSAGE);
            }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Seuil de Concordance doit etre compris entre 0 et 1");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public JLabel getlab1(){
    return lab1;
}
public JLabel getlab2(){
    return lab2;
}
public JTable getmat1(){
    return this.mat1;
}
public JTable gettab(){
    return this.tab;
}
public JTable gettb(){
    return this.tb;
}
public JPanel getpan(){
    return pan1;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(electre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(electre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(electre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(electre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new electre2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JTable mat1;
    private javax.swing.JPanel pan1;
    private javax.swing.JTable tab;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
