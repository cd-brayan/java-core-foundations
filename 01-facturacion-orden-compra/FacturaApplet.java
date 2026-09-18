import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FacturaApplet extends JFrame {

    // Variables originales declaradas exactamente como las tenías
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, lblResultado;
    private JTextField txtCliente;
    private JTextField txtProd1, txtProd2, txtProd3;
    private JTextField txtPrecio1, txtPrecio2, txtPrecio3;
    private JTextField txtCant1, txtCant2, txtCant3;
    private JTextField txtTotal1, txtTotal2, txtTotal3;
    private JTextField txtTotalFactura;
    private JButton btnCalcular;

    public FacturaApplet() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Orden de Compra - Facturación");
        setSize(540, 480);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Layout estándar de Java: sin librerías externas de NetBeans
        getContentPane().setBackground(new Color(245, 245, 245));

        // Encabezado principal
        jLabel1 = new JLabel("ORDEN DE COMPRA");
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 16));
        jLabel1.setBounds(180, 15, 200, 25);
        add(jLabel1);

        // Campo Cliente
        jLabel2 = new JLabel("Cliente:");
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel2.setBounds(30, 55, 60, 25);
        add(jLabel2);

        txtCliente = new JTextField();
        txtCliente.setBounds(95, 55, 220, 25);
        add(txtCliente);

        // Columnas
        jLabel3 = new JLabel("Producto");
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel3.setBounds(30, 95, 100, 20);
        add(jLabel3);

        jLabel4 = new JLabel("Vlr.Unitario");
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel4.setBounds(160, 95, 90, 20);
        add(jLabel4);

        jLabel5 = new JLabel("Cantidad");
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel5.setBounds(270, 95, 80, 20);
        add(jLabel5);

        jLabel6 = new JLabel("Vlr. Total");
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel6.setBounds(370, 95, 90, 20);
        add(jLabel6);

        // Fila 1
        txtProd1 = new JTextField();
        txtProd1.setBounds(30, 125, 115, 25);
        add(txtProd1);

        txtPrecio1 = new JTextField();
        txtPrecio1.setBounds(160, 125, 90, 25);
        add(txtPrecio1);

        txtCant1 = new JTextField();
        txtCant1.setBounds(270, 125, 80, 25);
        add(txtCant1);

        txtTotal1 = new JTextField();
        txtTotal1.setEditable(false);
        txtTotal1.setBounds(370, 125, 110, 25);
        add(txtTotal1);

        // Fila 2
        txtProd2 = new JTextField();
        txtProd2.setBounds(30, 160, 115, 25);
        add(txtProd2);

        txtPrecio2 = new JTextField();
        txtPrecio2.setBounds(160, 160, 90, 25);
        add(txtPrecio2);

        txtCant2 = new JTextField();
        txtCant2.setBounds(270, 160, 80, 25);
        add(txtCant2);

        txtTotal2 = new JTextField();
        txtTotal2.setEditable(false);
        txtTotal2.setBounds(370, 160, 110, 25);
        add(txtTotal2);

        // Fila 3
        txtProd3 = new JTextField();
        txtProd3.setBounds(30, 195, 115, 25);
        add(txtProd3);

        txtPrecio3 = new JTextField();
        txtPrecio3.setBounds(160, 195, 90, 25);
        add(txtPrecio3);

        txtCant3 = new JTextField();
        txtCant3.setBounds(270, 195, 80, 25);
        add(txtCant3);

        txtTotal3 = new JTextField();
        txtTotal3.setEditable(false);
        txtTotal3.setBounds(370, 195, 110, 25);
        add(txtTotal3);

        // Resumen
        jLabel7 = new JLabel("Valor Total:");
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel7.setBounds(280, 240, 85, 25);
        add(jLabel7);

        txtTotalFactura = new JTextField();
        txtTotalFactura.setEditable(false);
        txtTotalFactura.setBounds(370, 240, 110, 25);
        add(txtTotalFactura);

        // Botón Calcular
        btnCalcular = new JButton("CALCULAR");
        btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCalcular.setBounds(370, 280, 110, 35);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular);

        // Etiqueta de resultado con tu estilo HTML original
        lblResultado = new JLabel("Resumen de Compra...");
        lblResultado.setBounds(30, 330, 480, 70);
        add(lblResultado);
    }

    // Tu lógica de negocio matemática intacta
    private void btnCalcularActionPerformed(ActionEvent evt) {
        try {
            String nombreCliente = txtCliente.getText();
            int precio1 = Integer.parseInt(txtPrecio1.getText());
            int cant1 = Integer.parseInt(txtCant1.getText());
            int precio2 = Integer.parseInt(txtPrecio2.getText());
            int cant2 = Integer.parseInt(txtCant2.getText());
            int precio3 = Integer.parseInt(txtPrecio3.getText());
            int cant3 = Integer.parseInt(txtCant3.getText());

            int totalProducto1 = precio1 * cant1;
            int totalProducto2 = precio2 * cant2;
            int totalProducto3 = precio3 * cant3;
            int granTotal = totalProducto1 + totalProducto2 + totalProducto3;

            txtTotal1.setText(String.valueOf(totalProducto1));
            txtTotal2.setText(String.valueOf(totalProducto2));
            txtTotal3.setText(String.valueOf(totalProducto3));
            txtTotalFactura.setText(String.valueOf(granTotal));

            lblResultado.setText(
                    "<html><span style='font-family: Serif; color: #D4AF37; text-shadow: 2px 2px 3px black; font-size: 14px;'><b>Señor(a) "
                            + nombreCliente + ", el total de su compra es de: $" + granTotal + "</b></span></html>");

        } catch (NumberFormatException e) {
            lblResultado.setText(
                    "<html><span style='color: red;'><b>Error: Asegúrese de llenar todos los campos con números válidos.</b></span></html>");
        }
    }

    // Puerta de entrada para ejecutar en Java 21 moderno
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FacturaApplet().setVisible(true);
        });
    }
}