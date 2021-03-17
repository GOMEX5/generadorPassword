package GUI;

import javax.swing.JOptionPane;


public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        btnClean.setEnabled(false);
    }
    
    char numeros[] = {'0','1','2','3','4','5','6','7','8','9'};
    char signos[] = {'@','#','$','%','&','?'};
    char minusculas[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char mayusculas[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    int numeroRandom, letraRandom, signoRandom, dos, tres, cuatro;
    String pass = "";
    public int obtenernumerorandom(){
        numeroRandom = (int)(Math.random()*10);
        return numeroRandom;
    }
    
    public int obtenerletrarandom(){
        letraRandom = (int)(Math.random()*26);
        return letraRandom;
    }
    public int obtenersignorandom(){
        signoRandom = (int)(Math.random()*6);
        return signoRandom;
    }
    public int dosDigitos(){
        dos = (int)(Math.random()*2);
        return dos;
    }
    public int tresDigitos(){
        tres = (int)(Math.random()*3);
        return tres;
    }
    public int cuatroDigitos(){
        cuatro = (int)(Math.random()*4);
        return cuatro;
    }
    
    public void mayusculaSignos(){
        if (dosDigitos() == 1) {
            mayusculas();
        } else {
            signos();
        }
    }
    
    public void mayusculaMinuscula(){
        if (dosDigitos() == 1) {
            mayusculas();
        } else {
            minusculas();
        }
    }
    
    public void mayusculaNumeros(){
        if (dosDigitos() == 1) {
            mayusculas();
        } else {
            numeros();
        }
    }
    
    public void mayusculaNumerosSignos(){
        if (tresDigitos() == 1) {
            mayusculas();
        } else if(tresDigitos() == 2){
            numeros();
        }else{
            signos();
        }
    }
    public void mayusculaMinusculasSignos(){
        if (tresDigitos() == 1) {
            mayusculas();
        } else if(tresDigitos() == 2){
            minusculas();
        }else{
            signos();
        }
    }
    
    public void mayusculaMinusculasNumeros(){
        if (tresDigitos() == 1) {
            mayusculas();
        } else if(tresDigitos() == 2){
            minusculas();
        }else{
            numeros();
        }
    }
    
    public void mayusculaMinusculasNumerosSignos(){
       if (cuatroDigitos() == 1) {
            mayusculas();
        } else if(cuatroDigitos() == 2){
            minusculas();
        }else if(cuatroDigitos() == 3){
            numeros();
        }else{
            signos();
        }
    }
    
    public void minusculasNumerosSignos(){
        if (tresDigitos() == 1) {
            minusculas();
        } else if(tresDigitos() == 2){
            numeros();
        }else{
            signos();
        }
    }
    
    public void minusculasNumeros(){
        if (dosDigitos() == 1) {
            minusculas();
        } else {
            numeros();
        }
    }
    
    public void minusculasSignos(){
        if (dosDigitos() == 1) {
            minusculas();
        } else {
            signos();
        }
    }
    
     public void numerosSignos(){
        if (dosDigitos() == 1) {
            numeros();
        } else {
            signos();
        }
    }
    
    public void mayusculas(){
        pass = pass + String.valueOf(mayusculas[obtenerletrarandom()]);
    }
    public void minusculas(){
        pass = pass + String.valueOf(minusculas[obtenerletrarandom()]);
    }
    public void numeros(){
        pass = pass + String.valueOf(numeros[obtenernumerorandom()]);
    }
    public void signos(){
        pass = pass + String.valueOf(signos[obtenersignorandom()]);
    }
    
    public void generarPassword(){
        int i = Integer.parseInt(txtDigito.getText());
        for (int j = 1; j <= i; j++) {
            validar();
        }
    }
    
    public void validar(){
        if (cbMayusculas.isSelected()) {
            if (cbMinusculas.isSelected()) {
                if (cbNumeros.isSelected()) {
                    if (cbSignos.isSelected()) {
                        mayusculaMinusculasNumerosSignos();
                    }else{
                        mayusculaMinusculasNumeros();
                    }
                }else if(cbSignos.isSelected()){
                    mayusculaMinusculasSignos();
                } else {
                    mayusculaMinuscula();
                }
            } else if(cbNumeros.isSelected()){
                if (cbSignos.isSelected()) {
                        mayusculaNumerosSignos();
                    }else{
                        mayusculaNumeros();
                    } 
            }else if(cbSignos.isSelected()){
                
                mayusculaSignos();
            }else{
                
                mayusculas();
            }
        } else if(cbMinusculas.isSelected()){
            if (cbNumeros.isSelected()) {
                if (cbSignos.isSelected()) {
                    minusculasNumerosSignos();
                }else{
                    minusculasNumeros();
                }
            }else if(cbSignos.isSelected()){
                minusculasNumerosSignos();
            } else {
                minusculas();
            }
        }else if(cbNumeros.isSelected()){
            if (cbSignos.isSelected()) {
                    numerosSignos();
                }else{
                    numeros();
                }
        }else if(cbSignos.isSelected()){
            signos();
        }
    }
    
    public void limpiar(){
        txtDigito.setText("");
        txtValor.setText("");
    }
    
    public void verificacionDeCampos(){
        if (txtDigito.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(null, "debe seleccionar el tamano de digitos");
        } else {
            generarPassword();
            txtValor.setText(pass);
            pass = "";
            btnClean.setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbSignos = new javax.swing.JCheckBox();
        cbMayusculas = new javax.swing.JCheckBox();
        cbMinusculas = new javax.swing.JCheckBox();
        cbNumeros = new javax.swing.JCheckBox();
        txtValor = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        txtDigito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Generador de Contrasenas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 50));

        cbSignos.setText("Signos");
        jPanel1.add(cbSignos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        cbMayusculas.setText("Mayusculas");
        jPanel1.add(cbMayusculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cbMinusculas.setText("Minusculas");
        jPanel1.add(cbMinusculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        cbNumeros.setText("Numeros");
        jPanel1.add(cbNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        txtValor.setEditable(false);
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 410, -1));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 90, -1));
        jPanel1.add(txtDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 110, -1));

        jLabel2.setText("Digitos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
      verificacionDeCampos();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
       limpiar();
       btnClean.setEnabled(false);
    }//GEN-LAST:event_btnCleanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JCheckBox cbMayusculas;
    private javax.swing.JCheckBox cbMinusculas;
    private javax.swing.JCheckBox cbNumeros;
    private javax.swing.JCheckBox cbSignos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDigito;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
