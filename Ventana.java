package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblID;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrolladopr;
    private JTextField txtID;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDeasarrollador;
    private JButton btnAgregar;
    private GridLayout loyout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,550);
        loyout=new GridLayout(2,1);
        this.setLayout(loyout);

        panel1= new JPanel(new FlowLayout());
        panel1.setBackground(new Color(188,227,166));
        lblID = new JLabel("ID");
        txtID= new JTextField(4);
        panel1.add(lblID);
        panel1.add(txtID);
        this.getContentPane().add(panel1,0);

        lblNombre = new JLabel("Nombre");
        txtNombre= new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        this.getContentPane().add(panel1,0);

        lblGenero = new JLabel("Genero");
        txtGenero= new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        this.getContentPane().add(panel1,0);

        lblPeso = new JLabel("Peso (GB)");
        txtPeso= new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);
        this.getContentPane().add(panel1,0);

        lblPlataforma = new JLabel("Plataforma");
        txtPlataforma= new JTextField(15);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        this.getContentPane().add(panel1,0);

        lblDesarrolladopr = new JLabel("Desarrollador");
        txtDeasarrollador= new JTextField(25);
        panel1.add(lblDesarrolladopr);
        panel1.add(txtDeasarrollador);
        this.getContentPane().add(panel1,0);

        btnAgregar=new JButton("Agregar juego");
        panel1.add(btnAgregar);



        panel2= new JPanel(new FlowLayout());
        panel2.setBackground(new Color(201,195,241));
        info=new ArrayList<>();
        info.add(new Videojuego(1,"League of leguens","MOBA",4.5,"Windows y Mac","Riot Games"));
        modelo=new ModeloTablaJuego(info);

        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);

        this.getContentPane().add(panel2,1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Videojuego nuevo= new Videojuego();
                nuevo.setID(Integer.parseInt(txtID.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoEnGB(Double.parseDouble(txtPeso.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDeasarrollador.getText());
                //info.add(nuevo);
                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });
        this.setVisible(true);

    }
}
