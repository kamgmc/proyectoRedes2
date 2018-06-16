/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesmonopolyserver.Pantallas;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import redesmonopolyserver.Comunicacion.Cliente;
import redesmonopolyserver.Dominio.CPropiedad;
import redesmonopolyserver.Dominio.Casilla;
import redesmonopolyserver.Dominio.Jugador;
import redesmonopolyserver.Dominio.Tablero;
import redesmonopolyserver.Persistencia.Generador;

/**
 *
 * @author alexd
 */
public class PantallaJugadorPrincipal extends javax.swing.JFrame {
    Cliente cliente;
    boolean enAnimacion;

    /**
     * Creates new form PantallaJugadorPrincipal
     */
    public PantallaJugadorPrincipal() {
        initComponents();
        
        
    }
    
    public PantallaJugadorPrincipal(Cliente cliente) {
        initComponents();
        this.cliente=cliente;
        cliente.setPantalla(this);
        actualizarTablero(cliente.getTablero());
        setLocationRelativeTo(null);
        //cliente.solicitarTablero();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroYFondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botonJugar = new javax.swing.JButton();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        areaJugador = new javax.swing.JPanel();
        imagenJugador = new javax.swing.JLabel();
        piezaJugador1 = new javax.swing.JLabel();
        piezaJugador2 = new javax.swing.JLabel();
        piezaJugador3 = new javax.swing.JLabel();
        piezaJugador4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1010, 710));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableroYFondo.setBackground(new java.awt.Color(205, 230, 208));
        tableroYFondo.setMaximumSize(new java.awt.Dimension(1010, 710));
        tableroYFondo.setMinimumSize(new java.awt.Dimension(1010, 710));
        tableroYFondo.setName(""); // NOI18N
        tableroYFondo.setOpaque(false);
        tableroYFondo.setPreferredSize(new java.awt.Dimension(1010, 710));
        tableroYFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("mover 3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tableroYFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, -1, -1));

        jButton2.setText("mover 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tableroYFondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, -1, -1));

        jButton3.setText("mover 4");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        tableroYFondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, -1, -1));

        botonJugar.setText("Jugar");
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });
        tableroYFondo.add(botonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));
        botonJugar.getAccessibleContext().setAccessibleName("botonJugar");

        dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D1.png"))); // NOI18N
        tableroYFondo.add(dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 125, -1, -1));

        dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D1.png"))); // NOI18N
        tableroYFondo.add(dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 125, -1, -1));

        areaJugador.setOpaque(false);

        imagenJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarroG.png"))); // NOI18N
        areaJugador.add(imagenJugador);

        tableroYFondo.add(areaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 270, 330));

        piezaJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PerroP.png"))); // NOI18N
        tableroYFondo.add(piezaJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, -1, -1));

        piezaJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarroP.png"))); // NOI18N
        tableroYFondo.add(piezaJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        piezaJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SombreroP.png"))); // NOI18N
        tableroYFondo.add(piezaJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 630, -1, -1));

        piezaJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DedalP.png"))); // NOI18N
        tableroYFondo.add(piezaJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, -1, -1));

        getContentPane().add(tableroYFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tablero.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        enAnimacion=true;
        new Thread(new LanzadorDados(this)).start();
    }//GEN-LAST:event_botonJugarActionPerformed

    
    public void actualizarTablero(Tablero tablero){
        tablero.imprimirTablero();
        tableroYFondo.setLayout(null);
        if(tablero.getJugadores().size()>=1)piezaJugador1.setLocation(tablero.getCasillas().get(tablero.getJugadores().get(0).getPosicion()).getPosJugadorX(),tablero.getCasillas().get(tablero.getJugadores().get(0).getPosicion()).getPosJUgadorY());
        if(tablero.getJugadores().size()>=2)piezaJugador2.setLocation(tablero.getCasillas().get(tablero.getJugadores().get(1).getPosicion()).getPosJugadorX(),tablero.getCasillas().get(tablero.getJugadores().get(1).getPosicion()).getPosJUgadorY());
        if(tablero.getJugadores().size()>=3)piezaJugador3.setLocation(tablero.getCasillas().get(tablero.getJugadores().get(2).getPosicion()).getPosJugadorX(),tablero.getCasillas().get(tablero.getJugadores().get(2).getPosicion()).getPosJUgadorY());
        if(tablero.getJugadores().size()>=4)piezaJugador4.setLocation(tablero.getCasillas().get(tablero.getJugadores().get(3).getPosicion()).getPosJugadorX(),tablero.getCasillas().get(tablero.getJugadores().get(3).getPosicion()).getPosJUgadorY());
        mostrarDado(dado1,tablero.getDado1());
        mostrarDado(dado2,tablero.getDado2());
        botonJugar.setVisible(tablero.isTurno());
        /*Prueba de casas
        if (tablero.getJugadores().get(0).getPosicion() instanceof CPropiedad){
            JLabel casa = new JLabel("");
            tableroYFondo.add(casa);
            CPropiedad casilla = (CPropiedad) tablero.getJugadores().get(0).getPosicion();
            casa.setSize(16, 16);
            System.out.println(casilla.getPosCasasX());
            System.out.println(casilla.getPosJugadorX());
            casa.setLocation( casilla.getPosCasasX(),casilla.getPosCasasY());
            casa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casa.png")));
            this.revalidate();
            this.validate();
            this.repaint();
        }
        */
    }
        
    
    public void mostrarDado(JLabel dado, int num){
        if(num==1)dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D1.png")));
        else if(num==2)dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D2.png")));
        else if(num==3)dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D3.png")));
        else if(num==4)dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D4.png")));
        else if(num==5)dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        else if(num==6)dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D6.png")));
        pack();
    }   
    
    public class LanzadorDados implements Runnable{
        PantallaJugadorPrincipal pantalla;

        public LanzadorDados(PantallaJugadorPrincipal pantalla) {
            this.pantalla = pantalla;
        }
        
        
        @Override
        public void run() {
            pantalla.botonJugar.setVisible(false);
            int max =(int)(5+Math.random()*8);
            for(int i=0;i<max;i++){
                int d1 =(int)(1+Math.random()*6);
                int d2 = (int)(1+Math.random()*6);
                pantalla.mostrarDado(pantalla.dado1,d1);
                pantalla.mostrarDado(pantalla.dado2,d2);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PantallaJugadorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            pantalla.cliente.solicitarMoverse();
            
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaJugador;
    private javax.swing.JButton botonJugar;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imagenJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel piezaJugador1;
    private javax.swing.JLabel piezaJugador2;
    private javax.swing.JLabel piezaJugador3;
    private javax.swing.JLabel piezaJugador4;
    private javax.swing.JPanel tableroYFondo;
    // End of variables declaration//GEN-END:variables

}


