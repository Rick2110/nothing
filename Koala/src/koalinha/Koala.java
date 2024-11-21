package koalinha;

// Bibliotecas que estão sendo importadas
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import koalinha.cadastro.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Declaração da classe principal 
public class Koala {

	private JFrame frmKoalaLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public String usuario;
	public Connection conectar;

	//Metodo principal
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// metodo para abrir a janela da interface
			public void run() {
				try {
					Koala window = new Koala();
					window.frmKoalaLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Inicia a aplicação
	public Koala() {
		initialize();
	}

	//Design da janela
	private void initialize() {
		//Janela
		conectar = cadastro.conexao();
		frmKoalaLogin = new JFrame();
		frmKoalaLogin.getContentPane().setBackground(new Color(210, 222, 198));
		frmKoalaLogin.setTitle("Koala - Login");
		frmKoalaLogin.setBounds(100, 100, 520, 500);
		frmKoalaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKoalaLogin.setLocationRelativeTo(null);
		frmKoalaLogin.getContentPane().setLayout(null);
		
		//Botão de login
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(189, 285, 114, 26);
		frmKoalaLogin.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(149, 201, 190, 26);
		frmKoalaLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Texto de usuario
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(149, 182, 45, 19);
		frmKoalaLogin.getContentPane().add(lblNewLabel);
		
		//Texto da senha
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(149, 230, 45, 13);
		frmKoalaLogin.getContentPane().add(lblNewLabel_1);
		
		//Botão que vai para a pagina de login
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setBounds(189, 360, 114, 19);
		frmKoalaLogin.getContentPane().add(btnNewButton_1);
		
		//campo para digitar a senha
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 249, 190, 26);
		frmKoalaLogin.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Não tem conta? Cadastre-se");
		lblNewLabel_2.setBounds(160, 336, 173, 19);
		frmKoalaLogin.getContentPane().add(lblNewLabel_2);
		
		//botão para realizar o login
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(189, 123, 100, 49);
		frmKoalaLogin.getContentPane().add(lblNewLabel_3);
		
		//imagem do Koala
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ricko\\Downloads\\iloveimg-resized\\Koala_logo.png"));
		lblNewLabel_4.setBounds(189, 41, 108, 72);
		frmKoalaLogin.getContentPane().add(lblNewLabel_4);
		telaPrincipal tela = new telaPrincipal(usuario);
		cadastro cad = new cadastro();
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cad.cadastrar(null);
				frmKoalaLogin.dispose();
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Acessa o usuário e a senha
		        String usuario = textField.getText();
		        String password = new String(passwordField.getPassword());
		        
		        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/koalinha", "root", "")) {
		            String sql = "SELECT usuario, senha FROM cadastro WHERE usuario = ? AND senha = ?";
		            
		            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
		                stmt.setString(1, usuario);
		                stmt.setString(2, password);
		                
		                try (ResultSet rs = stmt.executeQuery()) {
		                    if (rs.next()) {
		                        telaPrincipal.telaScreen(usuario); // Passa o usuário para a tela principal
		                        frmKoalaLogin.dispose(); // Fecha a janela de login
		                    } else {
		                    	JOptionPane.showMessageDialog(frmKoalaLogin,"Usuário não encontrado.");
		                    }
		                }
		            }
		        } catch (SQLException e1) {
		        	JOptionPane.showMessageDialog(frmKoalaLogin,"Erro ao conectar com o banco de dados: " + e1.getMessage());
		        }
		    }
		});
	}
}