/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.HockeyPlayer;
import model.Endereco;
import controller.ControleHockeyPlayer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ramses
 */
public class CadastroHockeyPlayer extends javax.swing.JFrame {
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private ControleHockeyPlayer controleHockeyPlayer;
    private HockeyPlayer novoHockeyPlayer;
    private boolean novoRegistro;
    private DefaultListModel telefonesListModel;
    /**
     * Creates new form ControleAtletaJFrame
     */
    public CadastroHockeyPlayer() {
        initComponents();
        this.novoRegistro = true;
        this.controleHockeyPlayer = new ControleHockeyPlayer();
        this.telefonesListModel = new DefaultListModel();
        this.jListTelefones.setModel(telefonesListModel);
        this.jTableListaHockeyPlayers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
  
    private void limparCampos() {
        jTextFieldAltura.setText(null);
        jTextFieldBairro.setText(null);
        jTextFieldCEP.setText(null);
        jTextFieldCidade.setText(null);
        jTextFieldComplemento.setText(null);
        jTextFieldCPF.setText(null);
        jFormattedTextFieldDataNascimento.setText(null);
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldLogradouro.setText(null);
        jTextFieldNome.setText(null);
        jTextFieldNomeMae.setText(null);
        jTextFieldNomePai.setText(null);
        jTextFieldNumero.setText(null);
        jTextFieldPais.setText(null);
        jTextFieldPeso.setText(null);
        jTextFieldRG.setText(null);
        telefonesListModel.clear();
        jComboBoxSexo.setSelectedIndex(0);
        jComboBoxEstado.setSelectedIndex(0);
        jComboBoxPosicao.setSelectedIndex(0);
        jTextFieldAceleracao.setText(null);
        jComboBoxAgressividade.setSelectedIndex(0);
        jComboBoxAgilidade.setSelectedIndex(0);
        jComboBoxBloqueioChute.setSelectedIndex(0);
        jComboBoxControlePuck.setSelectedIndex(0);
        jComboBoxDefesaComTaco.setSelectedIndex(0);
        jComboBoxDrible.setSelectedIndex(0);
        jComboBoxEquilibrio.setSelectedIndex(0);
        jComboBoxFaceOff.setSelectedIndex(0);
        jComboBoxForcaFisica.setSelectedIndex(0);
        jComboBoxPrecisaoForcaSlapShot.setSelectedIndex(0);
        jComboBoxPrecisaoForcaWristShot.setSelectedIndex(0);
        jComboBoxMarcacao.setSelectedIndex(0);
        jComboBoxPasses.setSelectedIndex(0);
        jComboBoxPotencial.setSelectedIndex(0);
        jComboBoxPrecisaoSlapShot.setSelectedIndex(0);
        jComboBoxPrecisaoWristShot.setSelectedIndex(0);
        jComboBoxResistencia.setSelectedIndex(0);
        jTextFieldVelocidade.setText(null);
        jComboBoxVisaoAtaque.setSelectedIndex(0);
        jComboBoxVisaoDefesa.setSelectedIndex(0);
        jComboBoxPasses.setSelectedIndex(0);
    }
    
    private void carregarListaHockeyPlayers() {
        ArrayList<HockeyPlayer> listaHockeyPlayers = controleHockeyPlayer.getListaHockeyPlayers();
        DefaultTableModel model = (DefaultTableModel) jTableListaHockeyPlayers.getModel();
        model.setRowCount(0);
        for (HockeyPlayer hockPlayer : listaHockeyPlayers) {
            model.addRow(new String[]{hockPlayer.getNome(), hockPlayer.getCpf()});
        }
        jTableListaHockeyPlayers.setModel(model);
    }
    
    private boolean validarCampos() {
        if (jTextFieldNome.getText().trim().length() == 0) {
            this.exibirInformacao("O valor do campo 'Nome' não foi informado.");
            jTextFieldNome.requestFocus();
            return false;
        }
        if (jFormattedTextFieldDataNascimento.getText().length() != 0) {
            try {
                dateFormat.parse(jFormattedTextFieldDataNascimento.getText());
            } catch (ParseException ex) {
                this.exibirInformacao("O valor do campo 'Data de Nascimento' é inválido.");
                jFormattedTextFieldDataNascimento.requestFocus();
                return false;
            }
        }
        try {
            Double.parseDouble(jTextFieldAltura.getText());
        } catch (Exception ex) {
            this.exibirInformacao("O valor do campo 'Altura' é inválido.");
            jTextFieldAltura.requestFocus();
            return false;
        }
        try {
            Double.parseDouble(jTextFieldPeso.getText());
        } catch (Exception ex) {
            this.exibirInformacao("O valor do campo 'Peso' é inválido.");
            jTextFieldPeso.requestFocus();
            return false;
        }
        if (!jTextFieldNumero.getText().equals("")) {
            try {
                Integer.parseInt(jTextFieldNumero.getText());
            } catch (Exception ex) {
                this.exibirInformacao("O valor do campo 'Número' é inválido.");
                jTextFieldNumero.requestFocus();
                return false;
            }
        }       
        return true;
    }
    
    private void preencherCampos() {
        ArrayList<String> telefones;
        jTextFieldAltura.setText(Double.toString(novoHockeyPlayer.getAltura()));
        jTextFieldBairro.setText(novoHockeyPlayer.getEndereco().getBairro());
        jTextFieldCEP.setText(novoHockeyPlayer.getEndereco().getCep());
        jTextFieldCidade.setText(novoHockeyPlayer.getEndereco().getCidade());
        jTextFieldComplemento.setText(novoHockeyPlayer.getEndereco().getComplemento());
        jTextFieldCPF.setText(novoHockeyPlayer.getCpf());
        if (novoHockeyPlayer.getDataNascimento() == null) {
            jFormattedTextFieldDataNascimento.setText(null);
        } else {
            jFormattedTextFieldDataNascimento.setText(dateFormat.format(novoHockeyPlayer.getDataNascimento()));
        }
        jComboBoxSexo.setSelectedItem(novoHockeyPlayer.getSexo());
        jComboBoxEstado.setSelectedItem(novoHockeyPlayer.getEndereco().getEstado());
        jComboBoxPosicao.setSelectedItem(novoHockeyPlayer.getPosition());
        jTextFieldLogradouro.setText(novoHockeyPlayer.getEndereco().getLogradouro());
        jTextFieldNome.setText(novoHockeyPlayer.getNome());
        jTextFieldNomeMae.setText(novoHockeyPlayer.getNomeMae());
        jTextFieldNomePai.setText(novoHockeyPlayer.getNomePai());
        jTextFieldNumero.setText(novoHockeyPlayer.getEndereco().getNumero().toString());
        jTextFieldPais.setText(novoHockeyPlayer.getEndereco().getPais());
        jTextFieldPeso.setText(Double.toString(novoHockeyPlayer.getPeso()));
        jTextFieldRG.setText(novoHockeyPlayer.getRg());
        jTextFieldAceleracao.setText(Double.toString(novoHockeyPlayer.getAcceleration()));
        jComboBoxAgilidade.setSelectedItem(novoHockeyPlayer.getAgility());
        jComboBoxAgressividade.setSelectedItem(novoHockeyPlayer.getAggressiveness());
        jComboBoxBloqueioChute.setSelectedItem(novoHockeyPlayer.getShotBlocking());
        jComboBoxControlePuck.setSelectedItem(novoHockeyPlayer.getPuckControl());
        jComboBoxDefesaComTaco.setSelectedItem(novoHockeyPlayer.getStickChecking());
        jComboBoxDrible.setSelectedItem(novoHockeyPlayer.getDeking());
        jComboBoxEquilibrio.setSelectedItem(novoHockeyPlayer.getBalance());
        jComboBoxFaceOff.setSelectedItem(novoHockeyPlayer.getFaceOffs());
        jComboBoxForcaFisica.setSelectedItem(novoHockeyPlayer.getStrength());
        jComboBoxPrecisaoForcaSlapShot.setSelectedItem(novoHockeyPlayer.getSlapShotPower());
        jComboBoxPrecisaoForcaWristShot.setSelectedItem(novoHockeyPlayer.getWristShotPower());
        jComboBoxMarcacao.setSelectedItem(novoHockeyPlayer.getBodyChecking());
        jComboBoxPasses.setSelectedItem(novoHockeyPlayer.getPassing());
        jComboBoxPotencial.setSelectedItem(novoHockeyPlayer.getPotential());
        jComboBoxPrecisaoSlapShot.setSelectedItem(novoHockeyPlayer.getSlapShotAccuracy());
        jComboBoxPrecisaoWristShot.setSelectedItem(novoHockeyPlayer.getWristShotAccuracy());
        jComboBoxResistencia.setSelectedItem(novoHockeyPlayer.getEndurance());
        jTextFieldVelocidade.setText(Double.toString(novoHockeyPlayer.getSpeed()));
        jComboBoxVisaoAtaque.setSelectedItem(novoHockeyPlayer.getOffenseAwareness());
        jComboBoxVisaoDefesa.setSelectedItem(novoHockeyPlayer.getDefenseAwareness());
        jComboBoxVisaoPasse.setSelectedItem(novoHockeyPlayer.getHandEye());
        telefonesListModel.clear();
        telefones = novoHockeyPlayer.getTelefones();
        for (String t : telefones) {
            telefonesListModel.addElement(t);
        }
    }
    
    private void salvarRegistro() {
        Endereco endereco;
        ArrayList<String> telefones;
        Date dataNascimento;

        if (this.validarCampos() == false) {
            return;
        }

        if (jFormattedTextFieldDataNascimento.getText().length() == 0) {
            dataNascimento = null;
        } else {
            try {
                dataNascimento = dateFormat.parse(jFormattedTextFieldDataNascimento.getText());
            } catch (ParseException ex) {
                exibirInformacao("Falha ao gravar a data de nascimento: " + ex.toString());
                return;
            }
        }
        endereco = new Endereco();
        endereco.setBairro(jTextFieldBairro.getText());
        endereco.setCep(jTextFieldCEP.getText());
        endereco.setCidade(jTextFieldCidade.getText());
        endereco.setComplemento(jTextFieldComplemento.getText());
        endereco.setEstado((String) jComboBoxEstado.getSelectedItem());
        endereco.setLogradouro(jTextFieldLogradouro.getText());
        endereco.setNumero(jTextFieldNumero.getText());
        endereco.setPais(jTextFieldPais.getText());

        telefones = new ArrayList<>();
        for (int i = 0; i < telefonesListModel.size(); i++) {
            telefones.add(telefonesListModel.getElementAt(i).toString());
        }
        if (novoRegistro == true) {
            novoHockeyPlayer = new HockeyPlayer(jTextFieldNome.getText());
        } else {
            novoHockeyPlayer.setNome(jTextFieldNome.getText());
        }        
        novoHockeyPlayer.setEndereco(endereco);
        novoHockeyPlayer.setTelefones(telefones);
        novoHockeyPlayer.setDataNascimento(dataNascimento);
        novoHockeyPlayer.setAltura(Double.parseDouble(jTextFieldAltura.getText()));
        novoHockeyPlayer.setNomeMae(jTextFieldNomeMae.getText());
        novoHockeyPlayer.setNomePai(jTextFieldNomePai.getText());
        novoHockeyPlayer.setSexo((String) jComboBoxSexo.getSelectedItem());
        novoHockeyPlayer.setPeso(Double.parseDouble(jTextFieldPeso.getText()));
        novoHockeyPlayer.setCpf(jTextFieldCPF.getText());
        novoHockeyPlayer.setRg(jTextFieldRG.getText());
        novoHockeyPlayer.setAcceleration(Double.parseDouble(jTextFieldAceleracao.getText()));
        novoHockeyPlayer.setAggressiveness((String) jComboBoxAgressividade.getSelectedItem());
        novoHockeyPlayer.setAgility((String) jComboBoxAgilidade.getSelectedItem());
        novoHockeyPlayer.setBalance((String) jComboBoxEquilibrio.getSelectedItem());
        novoHockeyPlayer.setBodyChecking((String) jComboBoxMarcacao.getSelectedItem());
        novoHockeyPlayer.setDefenseAwareness((String) jComboBoxVisaoDefesa.getSelectedItem());
        novoHockeyPlayer.setDeking((String) jComboBoxDrible.getSelectedItem());
        novoHockeyPlayer.setEndurance((String) jComboBoxResistencia.getSelectedItem());
        novoHockeyPlayer.setFaceOffs((String) jComboBoxFaceOff.getSelectedItem());
        novoHockeyPlayer.setHandEye((String) jComboBoxVisaoPasse.getSelectedItem());
        novoHockeyPlayer.setOffenseAwareness((String) jComboBoxVisaoAtaque.getSelectedItem());
        novoHockeyPlayer.setPassing((String) jComboBoxPasses.getSelectedItem());
        novoHockeyPlayer.setPosition((String) jComboBoxPosicao.getSelectedItem());
        novoHockeyPlayer.setPotential((String) jComboBoxPotencial.getSelectedItem());
        novoHockeyPlayer.setPuckControl((String) jComboBoxControlePuck.getSelectedItem());
        novoHockeyPlayer.setShotBlocking((String) jComboBoxBloqueioChute.getSelectedItem());
        novoHockeyPlayer.setSlapShotAccuracy((String) jComboBoxPrecisaoSlapShot.getSelectedItem());
        novoHockeyPlayer.setSlapShotPower((String) jComboBoxPrecisaoForcaSlapShot.getSelectedItem());
        novoHockeyPlayer.setSpeed(Double.parseDouble(jTextFieldVelocidade.getText()));
        novoHockeyPlayer.setStickChecking((String) jComboBoxDefesaComTaco.getSelectedItem());
        novoHockeyPlayer.setStrength((String) jComboBoxForcaFisica.getSelectedItem());
        novoHockeyPlayer.setWristShotAccuracy((String) jComboBoxPrecisaoWristShot.getSelectedItem());
        novoHockeyPlayer.setWristShotPower((String) jComboBoxPrecisaoForcaWristShot.getSelectedItem());
        if (novoRegistro == true) {
            controleHockeyPlayer.adicionarHockeyPlayer(novoHockeyPlayer);
            this.exibirInformacao("Cadastro efetuado com sucesso.");
        }
        else{
            this.exibirInformacao("Alteração efetuada com sucesso.");
        }
        novoRegistro = true;        
        this.limparCampos();
        this.carregarListaHockeyPlayers();
    }

    private void exibirInformacao(String info) {
        JOptionPane.showMessageDialog(this, info, "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void pesquisarHockeyPlayer(String nome) {
        HockeyPlayer hockeyPlayerPesquisado = controleHockeyPlayer.pesquisarUmHockeyPlayer(nome);

        if (hockeyPlayerPesquisado == null) {
            this.carregarListaHockeyPlayers();
            exibirInformacao("Hockey Player não encontrado.");
        } else {
            this.novoHockeyPlayer = hockeyPlayerPesquisado;
            ArrayList<HockeyPlayer> listaHockeyPlayers = controleHockeyPlayer.getListaHockeyPlayers();
            DefaultTableModel model = (DefaultTableModel) jTableListaHockeyPlayers.getModel();
            model.setRowCount(0);
            model.addRow(new String[]{hockeyPlayerPesquisado.getNome(), hockeyPlayerPesquisado.getCpf()});
            jTableListaHockeyPlayers.setModel(model);
        }
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }
    private void pesquisarHockeyPlayerTabela(String nome) {
        HockeyPlayer hockeyPlayerPesquisado = controleHockeyPlayer.pesquisarUmHockeyPlayer(nome);

        if (hockeyPlayerPesquisado == null) {
            exibirInformacao("Boxeador não encontrado.");
        } else {
            this.novoHockeyPlayer = hockeyPlayerPesquisado;
        }
    }
    
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPaneNovo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNomePai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomeMae = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTelefones = new javax.swing.JList();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPais = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldCEP = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxPosicao = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldAceleracao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextFieldVelocidade = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBoxAgressividade = new javax.swing.JComboBox();
        jComboBoxAgilidade = new javax.swing.JComboBox();
        jComboBoxEquilibrio = new javax.swing.JComboBox();
        jComboBoxMarcacao = new javax.swing.JComboBox();
        jComboBoxVisaoDefesa = new javax.swing.JComboBox();
        jComboBoxDrible = new javax.swing.JComboBox();
        jComboBoxResistencia = new javax.swing.JComboBox();
        jComboBoxFaceOff = new javax.swing.JComboBox();
        jComboBoxVisaoPasse = new javax.swing.JComboBox();
        jComboBoxVisaoAtaque = new javax.swing.JComboBox();
        jComboBoxControlePuck = new javax.swing.JComboBox();
        jComboBoxBloqueioChute = new javax.swing.JComboBox();
        jComboBoxPrecisaoSlapShot = new javax.swing.JComboBox();
        jComboBoxPrecisaoForcaSlapShot = new javax.swing.JComboBox();
        jComboBoxPrecisaoWristShot = new javax.swing.JComboBox();
        jComboBoxPrecisaoForcaWristShot = new javax.swing.JComboBox();
        jComboBoxPasses = new javax.swing.JComboBox();
        jComboBoxDefesaComTaco = new javax.swing.JComboBox();
        jComboBoxForcaFisica = new javax.swing.JComboBox();
        jComboBoxPotencial = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jTextValorPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaHockeyPlayers = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jLabel1.setText("Data Nascimento:");

        jFormattedTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataNascimentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Altura:");

        jLabel3.setText("Peso:");

        jLabel4.setText("Sexo:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome do Pai:");

        jLabel6.setText("Nome da Mãe:");

        jLabel7.setText("RG:");

        jLabel8.setText("CPF:");

        jLabel9.setText("Telefones:");

        jScrollPane1.setViewportView(jListTelefones);

        jButtonAdicionar.setText("+");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonRemover.setText("-");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldNomeMae)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(jTextFieldRG)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemover)))
                .addGap(317, 317, 317))
        );

        jTabbedPane1.addTab("INFORMAÇÕES GERAIS", jPanel5);

        jLabel10.setText("Logradouro:");

        jLabel11.setText("Número:");

        jLabel12.setText("Complemento:");

        jLabel13.setText("Bairro:");

        jLabel14.setText("Cidade:");

        jLabel15.setText("Estado:");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GO", "MT", "MS", "DF", "AM", "AC", "RO", "RR", "AP", "TO", "PA", "MA", "PI", "CE", "RN", "PB", "PE", "SE", "AL", "BA", "SP", "MG", "RJ", "ES", "PR", "SC", "RS" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        jLabel16.setText("País:");

        jLabel17.setText("CEP:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldCEP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(jTextFieldPais, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ENDEREÇO", jPanel6);

        jLabel18.setText("Posição:");

        jComboBoxPosicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Goleiro", "Centro", "Defesa", "Ala Direita", "Ala Esquerda" }));
        jComboBoxPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPosicaoActionPerformed(evt);
            }
        });

        jLabel19.setText("Aceleração Máxima:");

        jLabel20.setText("Agressividade:");

        jLabel21.setText("Agilidade:");

        jLabel22.setText("Equilíbrio:");

        jLabel23.setText("Marcação:");

        jLabel24.setText("Visão Defesa:");

        jLabel25.setText("Drible:");

        jLabel26.setText("Resistência:");

        jLabel27.setText("Habilidade FaceOff:");

        jLabel28.setText("Visão Passe:");

        jLabel29.setText("Visão Ataque:");

        jLabel30.setText("Qualidade Passes:");

        jLabel31.setText("Potencial:");

        jLabel32.setText("Controle Puck:");

        jLabel33.setText("Bloqueio Chute:");

        jLabel34.setText("Precisão SlapShot:");

        jLabel35.setText("Força SlapShot:");

        jLabel36.setText("Precisão WristShot:");

        jLabel37.setText("Força WristShot:");

        jLabel38.setText("Velocidade Máxima:");

        jLabel40.setText("Defesa com Taco:");

        jLabel41.setText("Força Física:");

        jComboBoxAgressividade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito alta", "Alta", "Média", "Baixa", "Muito baixa" }));
        jComboBoxAgressividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAgressividadeActionPerformed(evt);
            }
        });

        jComboBoxAgilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxAgilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAgilidadeActionPerformed(evt);
            }
        });

        jComboBoxEquilibrio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxEquilibrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquilibrioActionPerformed(evt);
            }
        });

        jComboBoxMarcacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxMarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcacaoActionPerformed(evt);
            }
        });

        jComboBoxVisaoDefesa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxVisaoDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVisaoDefesaActionPerformed(evt);
            }
        });

        jComboBoxDrible.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxDrible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDribleActionPerformed(evt);
            }
        });

        jComboBoxResistencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito alta", "Alta", "Média", "Baixa", "Muito baixa" }));
        jComboBoxResistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResistenciaActionPerformed(evt);
            }
        });

        jComboBoxFaceOff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxFaceOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFaceOffActionPerformed(evt);
            }
        });

        jComboBoxVisaoPasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxVisaoPasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVisaoPasseActionPerformed(evt);
            }
        });

        jComboBoxVisaoAtaque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxVisaoAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVisaoAtaqueActionPerformed(evt);
            }
        });

        jComboBoxControlePuck.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxControlePuck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxControlePuckActionPerformed(evt);
            }
        });

        jComboBoxBloqueioChute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxBloqueioChute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBloqueioChuteActionPerformed(evt);
            }
        });

        jComboBoxPrecisaoSlapShot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito alta", "Alta", "Média", "Baixa", "Muito baixa" }));
        jComboBoxPrecisaoSlapShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrecisaoSlapShotActionPerformed(evt);
            }
        });

        jComboBoxPrecisaoForcaSlapShot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito forte", "Forte", "Média", "Fraco", "Muito Fraco" }));
        jComboBoxPrecisaoForcaSlapShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrecisaoForcaSlapShotActionPerformed(evt);
            }
        });

        jComboBoxPrecisaoWristShot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito alta", "Alta", "Média", "Baixa", "Muito baixa" }));
        jComboBoxPrecisaoWristShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrecisaoWristShotActionPerformed(evt);
            }
        });

        jComboBoxPrecisaoForcaWristShot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito forte", "Forte", "Média", "Fraco", "Muito Fraco" }));
        jComboBoxPrecisaoForcaWristShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrecisaoForcaWristShotActionPerformed(evt);
            }
        });

        jComboBoxPasses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxPasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPassesActionPerformed(evt);
            }
        });

        jComboBoxDefesaComTaco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Boa", "Média", "Baixa", "Muito baixa" }));
        jComboBoxDefesaComTaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDefesaComTacoActionPerformed(evt);
            }
        });

        jComboBoxForcaFisica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito alta", "Alta", "Média", "Baixa", "Muito baixa" }));
        jComboBoxForcaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxForcaFisicaActionPerformed(evt);
            }
        });

        jComboBoxPotencial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muito alto", "Alto", "Médio", "Baixo", "Muito baixo" }));
        jComboBoxPotencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPotencialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldAceleracao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAgressividade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxAgilidade, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxEquilibrio, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxMarcacao, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxVisaoDefesa, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxDrible, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxResistencia, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxFaceOff, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxVisaoPasse, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                            .addComponent(jComboBoxVisaoAtaque, 0, 100, Short.MAX_VALUE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxControlePuck, javax.swing.GroupLayout.Alignment.TRAILING, 0, 104, Short.MAX_VALUE)
                                        .addComponent(jComboBoxBloqueioChute, 0, 104, Short.MAX_VALUE)
                                        .addComponent(jComboBoxPrecisaoSlapShot, 0, 104, Short.MAX_VALUE)
                                        .addComponent(jComboBoxPrecisaoForcaSlapShot, 0, 104, Short.MAX_VALUE))
                                    .addComponent(jComboBoxPrecisaoWristShot, 0, 126, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldVelocidade)
                                    .addComponent(jComboBoxPrecisaoForcaWristShot, 0, 109, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPasses, 0, 121, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDefesaComTaco, javax.swing.GroupLayout.Alignment.TRAILING, 0, 121, Short.MAX_VALUE)
                                    .addComponent(jComboBoxForcaFisica, javax.swing.GroupLayout.Alignment.TRAILING, 0, 121, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPotencial, 0, 121, Short.MAX_VALUE))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBoxPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldAceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jComboBoxControlePuck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel33)
                    .addComponent(jComboBoxAgressividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBloqueioChute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel34)
                    .addComponent(jComboBoxAgilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPrecisaoSlapShot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel35)
                    .addComponent(jComboBoxEquilibrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPrecisaoForcaSlapShot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel36)
                    .addComponent(jComboBoxMarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPrecisaoWristShot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel37)
                    .addComponent(jComboBoxVisaoDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPrecisaoForcaWristShot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel38)
                    .addComponent(jTextFieldVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDrible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30)
                    .addComponent(jComboBoxResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel40)
                    .addComponent(jComboBoxFaceOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDefesaComTaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel41)
                    .addComponent(jComboBoxVisaoPasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxForcaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(jComboBoxPotencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(jComboBoxVisaoAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INFORMAÇÕES TÉCNICAS", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneNovo.addTab("DADOS JOGADOR", jPanel1);

        jLabel42.setText("Digite o Nome:");

        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableListaHockeyPlayers.setModel(new javax.swing.table.DefaultTableModel 
            (
                null,
                new String [] {
                    "Nome", "CPF"
                }
            )
            {
                @Override    
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            });
            jTableListaHockeyPlayers.setShowHorizontalLines(false);
            jTableListaHockeyPlayers.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableListaHockeyPlayersMouseClicked(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jTableListaHockeyPlayersMouseExited(evt);
                }
            });
            jScrollPane2.setViewportView(jTableListaHockeyPlayers);

            jButtonAlterar.setText("ALTERAR");
            jButtonAlterar.setEnabled(false);
            jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonAlterarActionPerformed(evt);
                }
            });

            jButtonExcluir.setText("EXCLUIR");
            jButtonExcluir.setEnabled(false);
            jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonExcluirActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel42)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextValorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(jTextValorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE))
            );

            jTabbedPaneNovo.addTab("LISTAGEM JOGADORES", jPanel3);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPaneNovo)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPaneNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        this.controleHockeyPlayer.removerHockeyPlayer(novoHockeyPlayer);
        novoHockeyPlayer = null;
        this.limparCampos();
        this.carregarListaHockeyPlayers();
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        //jTabbedPane1.transferFocus();
        jTabbedPaneNovo.setSelectedComponent(jPanel1);
        novoRegistro = false;
        this.preencherCampos();
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableListaHockeyPlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaHockeyPlayersMouseClicked
        if (jTableListaHockeyPlayers.isEnabled()) {
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            DefaultTableModel model = (DefaultTableModel) jTableListaHockeyPlayers.getModel();
            String nome = (String) model.getValueAt(jTableListaHockeyPlayers.getSelectedRow(), 0);
            this.pesquisarHockeyPlayerTabela(nome);
        }
    }//GEN-LAST:event_jTableListaHockeyPlayersMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String pesquisa = jTextValorPesquisa.getText();
        jTextValorPesquisa.setText(null);
        if (pesquisa != null) {
            this.pesquisarHockeyPlayer(pesquisa);
        }
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jComboBoxPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPosicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPosicaoActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        if (jListTelefones.getSelectedIndex() != -1) {
            telefonesListModel.removeElementAt(jListTelefones.getSelectedIndex());
        }
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        CadastroTelefone cadastro = new CadastroTelefone(this, true);
        cadastro.setVisible(true);
        if (cadastro.getTelefone() != null) {
            telefonesListModel.addElement(cadastro.getTelefone());
        }
        cadastro.dispose();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.limparCampos();
        novoRegistro = true;
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        this.salvarRegistro();
        this.carregarListaHockeyPlayers();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataNascimentoActionPerformed

    private void jComboBoxAgressividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAgressividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAgressividadeActionPerformed

    private void jTableListaHockeyPlayersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaHockeyPlayersMouseExited
        
    }//GEN-LAST:event_jTableListaHockeyPlayersMouseExited

    private void jComboBoxAgilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAgilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAgilidadeActionPerformed

    private void jComboBoxEquilibrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquilibrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEquilibrioActionPerformed

    private void jComboBoxMarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcacaoActionPerformed

    private void jComboBoxVisaoDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVisaoDefesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVisaoDefesaActionPerformed

    private void jComboBoxDribleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDribleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDribleActionPerformed

    private void jComboBoxResistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxResistenciaActionPerformed

    private void jComboBoxFaceOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFaceOffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFaceOffActionPerformed

    private void jComboBoxVisaoPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVisaoPasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVisaoPasseActionPerformed

    private void jComboBoxVisaoAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVisaoAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVisaoAtaqueActionPerformed

    private void jComboBoxControlePuckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxControlePuckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxControlePuckActionPerformed

    private void jComboBoxBloqueioChuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBloqueioChuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBloqueioChuteActionPerformed

    private void jComboBoxPrecisaoSlapShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrecisaoSlapShotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPrecisaoSlapShotActionPerformed

    private void jComboBoxPrecisaoForcaSlapShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrecisaoForcaSlapShotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPrecisaoForcaSlapShotActionPerformed

    private void jComboBoxPrecisaoWristShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrecisaoWristShotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPrecisaoWristShotActionPerformed

    private void jComboBoxPrecisaoForcaWristShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrecisaoForcaWristShotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPrecisaoForcaWristShotActionPerformed

    private void jComboBoxPassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPassesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPassesActionPerformed

    private void jComboBoxDefesaComTacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDefesaComTacoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDefesaComTacoActionPerformed

    private void jComboBoxForcaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxForcaFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxForcaFisicaActionPerformed

    private void jComboBoxPotencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPotencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPotencialActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroHockeyPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroHockeyPlayer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxAgilidade;
    private javax.swing.JComboBox jComboBoxAgressividade;
    private javax.swing.JComboBox jComboBoxBloqueioChute;
    private javax.swing.JComboBox jComboBoxControlePuck;
    private javax.swing.JComboBox jComboBoxDefesaComTaco;
    private javax.swing.JComboBox jComboBoxDrible;
    private javax.swing.JComboBox jComboBoxEquilibrio;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox jComboBoxFaceOff;
    private javax.swing.JComboBox jComboBoxForcaFisica;
    private javax.swing.JComboBox jComboBoxMarcacao;
    private javax.swing.JComboBox jComboBoxPasses;
    private javax.swing.JComboBox jComboBoxPosicao;
    private javax.swing.JComboBox jComboBoxPotencial;
    private javax.swing.JComboBox jComboBoxPrecisaoForcaSlapShot;
    private javax.swing.JComboBox jComboBoxPrecisaoForcaWristShot;
    private javax.swing.JComboBox jComboBoxPrecisaoSlapShot;
    private javax.swing.JComboBox jComboBoxPrecisaoWristShot;
    private javax.swing.JComboBox jComboBoxResistencia;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JComboBox jComboBoxVisaoAtaque;
    private javax.swing.JComboBox jComboBoxVisaoDefesa;
    private javax.swing.JComboBox jComboBoxVisaoPasse;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JList jListTelefones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneNovo;
    private javax.swing.JTable jTableListaHockeyPlayers;
    private javax.swing.JTextField jTextFieldAceleracao;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeMae;
    private javax.swing.JTextField jTextFieldNomePai;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldVelocidade;
    private javax.swing.JTextField jTextValorPesquisa;
    // End of variables declaration//GEN-END:variables
}
