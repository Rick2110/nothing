package koalinha;


import java.awt.*;
import javax.swing.*;
import java.util.regex.*;
import java.util.*;

import java.sql.*;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class cadastro {

	private static JFrame frame;
	protected static Object conexao;
	private JPasswordField passwordField;
	private JTextField txtNomeCompleto;
	private JTextField txtUsuario;
	private JTextField txtExemploemailcom;
	private JTextField textField_3;
	private JTextField textField_4;
	

	/**
	 * Launch the application.
	 */
	public static void cadastrar(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro window = new cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 615, 774);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(258, 104, 52, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Usuário");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(247, 191, 70, 25);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail_1.setBounds(258, 282, 52, 25);
		frame.getContentPane().add(lblEmail_1);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSenha.setBounds(258, 556, 59, 25);
		frame.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setToolTipText("");
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBounds(145, 600, 293, 29);
		frame.getContentPane().add(passwordField);
		
		txtNomeCompleto = new JTextField();
		txtNomeCompleto.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        // Remove o texto placeholder ao ganhar foco
		        if (txtNomeCompleto.getText().equals("Nome Completo")) {
		            txtNomeCompleto.setText("");
		            txtNomeCompleto.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        // Reinsere o texto placeholder se o campo estiver vazio
		        if (txtNomeCompleto.getText().isEmpty()) {
		            txtNomeCompleto.setText("Nome Completo");
		            txtNomeCompleto.setForeground(new Color(136, 136, 136));
		        }
		    }
		});

		
		txtNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNomeCompleto.setForeground(new Color(136, 136, 136));
		txtNomeCompleto.setText("Nome Completo");
		txtNomeCompleto.setBounds(145, 140, 293, 30);
		frame.getContentPane().add(txtNomeCompleto);
		txtNomeCompleto.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
		        // Remove o texto placeholder ao ganhar foco
		        if (txtUsuario.getText().equals("Usuário")) {
		            txtUsuario.setText("");
		            txtUsuario.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        // Reinsere o texto placeholder se o campo estiver vazio
		        if (txtUsuario.getText().isEmpty()) {
		            txtUsuario.setText("Usuário");
		            txtUsuario.setForeground(new Color(136, 136, 136));
		        }
		    }
		});
		txtUsuario.setText("Usuário");
		txtUsuario.setForeground(new Color(136, 136, 136));
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(145, 226, 293, 30);
		frame.getContentPane().add(txtUsuario);
		
		txtExemploemailcom = new JTextField();
		txtExemploemailcom.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
		        // Remove o texto placeholder ao ganhar foco
		        if (txtExemploemailcom.getText().equals("exemplo@email.com")) {
		        	txtExemploemailcom.setText("");
		        	txtExemploemailcom.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        // Reinsere o texto placeholder se o campo estiver vazio
		        if (txtExemploemailcom.getText().isEmpty()) {
		        	txtExemploemailcom.setText("exemplo@email.com");
		        	txtExemploemailcom.setForeground(new Color(136, 136, 136));
		        }
		    }
		});
		txtExemploemailcom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtExemploemailcom.setForeground(new Color(136, 136, 136));
		txtExemploemailcom.setText("exemplo@email.com");
		txtExemploemailcom.setColumns(10);
		txtExemploemailcom.setBounds(145, 314, 293, 30);
		frame.getContentPane().add(txtExemploemailcom);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblCadastro.setBounds(218, 26, 137, 43);
		frame.getContentPane().add(lblCadastro);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(218, 659, 137, 43);
		frame.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
		        // Remove o texto placeholder ao ganhar foco
		        if (textField_3.getText().equals("(11) 12345-6789")) {
		        	textField_3.setText("");
		        	textField_3.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        // Reinsere o texto placeholder se o campo estiver vazio
		        if (textField_3.getText().isEmpty()) {
		        	textField_3.setText("(11) 12345-6789");
		        	textField_3.setForeground(new Color(136, 136, 136));
		        }
		    }
		});
		textField_3.setForeground(new Color(136, 136, 136));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setForeground(new Color(136, 136, 136));
		textField_3.setText("(11) 12345-6789");
		textField_3.setColumns(10);
		textField_3.setBounds(145, 409, 293, 30);
		frame.getContentPane().add(textField_3);
		
		JLabel lblEmail_1_1 = new JLabel("Telefone");
		lblEmail_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail_1_1.setBounds(247, 373, 86, 25);
		frame.getContentPane().add(lblEmail_1_1);
		
		JLabel lblEmail_1_1_1 = new JLabel("CPF");
		lblEmail_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail_1_1_1.setBounds(270, 463, 43, 25);
		frame.getContentPane().add(lblEmail_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
		        // Remove o texto placeholder ao ganhar foco
		        if (textField_4.getText().equals("123.456.789-00")) {
		        	textField_4.setText("");
		        	textField_4.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        // Reinsere o texto placeholder se o campo estiver vazio
		        if (textField_4.getText().isEmpty()) {
		        	textField_4.setText("123.456.789-00");
		        	textField_4.setForeground(new Color(136, 136, 136));
		        }
		    }
		});
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setForeground(new Color(136, 136, 136));
		textField_4.setText("123.456.789-00");
		textField_4.setColumns(10);
		textField_4.setBounds(145, 499, 293, 30);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\henrique.oliveira4\\eclipse-workspace\\Koala\\imgs\\home-button-for-interface.png"));
		btnNewButton_1.setForeground(new Color(240, 240, 240));
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(41, 26, 70, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNomeCompleto.getText();
				String user = txtUsuario.getText();
				String email = txtExemploemailcom.getText();
				String telefone = textField_3.getText();
				String cpf = textField_4.getText();
				String senha = new String(passwordField.getPassword());
				
				if (validarEmail(email)) {
				    if (validarSenha(senha)) {
				        if (validarTelefone(telefone)) {
				            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/koalinha", "root", "")) {
				                // Primeira consulta para verificar se o usuário, cpf ou email já existe
				                String sqlVerificacao = "SELECT usuario, cpf, email FROM cadastro WHERE usuario = ? OR cpf = ? OR email = ?";
				                try (PreparedStatement stmt = conn.prepareStatement(sqlVerificacao)) {
				                    stmt.setString(1, user);
				                    stmt.setString(2, cpf);
				                    stmt.setString(3, email);

				                    try (ResultSet rs = stmt.executeQuery()) {
				                        // Verificando se o usuário já foi encontrado
				                        if (rs.next()) {
				                            String usuarioVeri = rs.getString("usuario");
				                            String cpfVeri = rs.getString("cpf");
				                            String emailVeri = rs.getString("email");
				                            
				                            JOptionPane.showMessageDialog(frame, "Usuario, cpf ou email já foi cadastrado.");
				                        } else {
				                            // Se o usuário não for encontrado, realizar a inserção
				                            String sqlInsercao = "INSERT INTO cadastro (nome, usuario, email, telefone, cpf, senha) VALUES (?, ?, ?, ?, ?, ?)";
				                            try (PreparedStatement stmtInsert = conn.prepareStatement(sqlInsercao)) {
				                                stmtInsert.setString(1, nome);
				                                stmtInsert.setString(2, user);
				                                stmtInsert.setString(3, email);
				                                stmtInsert.setString(4, telefone);
				                                stmtInsert.setString(5, cpf);
				                                stmtInsert.setString(6, senha);

				                                int linhasAfetadas = stmtInsert.executeUpdate();
				                                JOptionPane.showMessageDialog(frame, "Usuario cadastrado com sucesso! ");
				                            } catch (SQLException e1) {
				                                JOptionPane.showMessageDialog(frame, "Erro ao inserir dados no banco de dados: " + e1.getMessage());
				                            }
				                        }
				                    }
				                } catch (SQLException e1) {
				                    JOptionPane.showMessageDialog(frame, "Erro ao conectar com o banco de dados: " + e1.getMessage());
				                }
				            } catch (SQLException e1) {
				                JOptionPane.showMessageDialog(frame, "Erro ao conectar com o banco de dados: " + e1.getMessage());
				            }
				        } else {
				            JOptionPane.showMessageDialog(frame, "Formato de telefone inválido.\nExemplo de formato correto: (11) 12345-6789");
				        }
				    } else {
				        JOptionPane.showMessageDialog(frame, "A senha precisa ter números e pelo menos um caractere especial.");
				    }
				} else {
				    JOptionPane.showMessageDialog(frame, "Formato de Email inválido.\nExemplo de formato: exemplo@email.com");
				}


				
			}
		});
	}
	
	public static Connection conexao() {
		String url = "jdbc:mysql://localhost:3306/koalinha"; // Endereço do servidor e banco
        String usuario = "root"; // Usuário do banco
        String senha = ""; // Senha do banco
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(frame, "Erro ao conectar: " + e.getMessage());
        }
		return null;
	}
        
        public static boolean validarEmail(String email) {
            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

    	public static boolean validarSenha(String senha) {
            // Regras de validação
            boolean temNumero = senha.chars().anyMatch(Character::isDigit);
            boolean temCaracterEspecial = senha.chars().anyMatch(ch -> "!@#$%^&*()_+[]{}|;:',.<>?/`~".indexOf(ch) >= 0);
            
            return senha.length() >= 6 && temNumero && temCaracterEspecial;
        }
    	public static boolean validarTelefone(String telefone) {
            String regex = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$"; // Formato: (XX) XXXX-XXXX ou (XX) XXXXX-XXXX
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(telefone);
            return matcher.matches();

    	}
    	
}