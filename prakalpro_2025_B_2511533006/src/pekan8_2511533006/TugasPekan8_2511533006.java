package pekan8_2511533006;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TugasPekan8_2511533006 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextArea txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasPekan8_2511533006 frame = new TugasPekan8_2511533006();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TugasPekan8_2511533006() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(20, 50, 70, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Operator Assignment");
		lblNewLabel.setBounds(150, 11, 200, 25);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(20, 82, 70, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setBounds(20, 120, 70, 25);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(100, 52, 120, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setColumns(10);
		txtBil2.setBounds(100, 84, 120, 20);
		contentPane.add(txtBil2);
		
		// Menggunakan JTextArea agar bisa menampilkan teks multi-line
		txtHasil = new JTextArea();
		txtHasil.setEditable(false);
		txtHasil.setLineWrap(true);
		txtHasil.setWrapStyleWord(true);
		txtHasil.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		JScrollPane scrollPane = new JScrollPane(txtHasil);
		scrollPane.setBounds(100, 120, 350, 200);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Process");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				} else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						
						StringBuilder hasil = new StringBuilder();
						hasil.append("HASIL OPERATOR ASSIGNMENT\n");
						hasil.append("========================\n\n");
						
						// Simpan nilai awal untuk setiap operasi
						int nilaiAwal = a;
						
						// Operator Assignment +=
						a += b;
						hasil.append("a += b  →  a = ").append(a).append("\n");
						a = nilaiAwal; // Reset ke nilai awal
						
						// Operator Assignment -=
						a -= b;
						hasil.append("a -= b  →  a = ").append(a).append("\n");
						a = nilaiAwal; // Reset ke nilai awal
						
						// Operator Assignment *=
						a *= b;
						hasil.append("a *= b  →  a = ").append(a).append("\n");
						a = nilaiAwal; // Reset ke nilai awal
						
						// Operator Assignment /=
						if (b != 0) {
							a /= b;
							hasil.append("a /= b  →  a = ").append(a).append("\n");
							a = nilaiAwal; // Reset ke nilai awal
						} else {
							hasil.append("a /= b  →  Pembagian dengan nol tidak diperbolehkan\n");
						}
						
						// Operator Assignment %=
						if (b != 0) {
							a %= b;
							hasil.append("a %= b  →  a = ").append(a);
						} else {
							hasil.append("a %= b  →  Modulus dengan nol tidak diperbolehkan");
						}
						
						txtHasil.setText(hasil.toString());
						
					} catch (NumberFormatException ex) {
						pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
						txtHasil.setText("");
					}
				}
			}
		});
		btnNewButton.setBounds(250, 80, 100, 25);
		contentPane.add(btnNewButton);

	}
}