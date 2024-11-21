package koalinha;

// Importações de bibliotecas necessárias
import java.awt.*;
import javax.swing.*;
import java.awt.Choice;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Button;

// Declaração da classe principal marcarHorario
public class marcarHorario {

	// Declaração dos componentes da interface
	private JFrame frmKoalaApp;

	// Método para abrir a janela de marcação de horário
	public static void horarioScreen() {
		EventQueue.invokeLater(new Runnable() {
			// Executa o código para iniciar a tela em uma fila de eventos
			public void run() {
				try {
					marcarHorario window = new marcarHorario(); // Criação do objeto marcarHorario
					window.frmKoalaApp.setVisible(true); // Exibe a janela de marcação de horário
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Construtor da classe - cria a aplicação
	public marcarHorario() {
		initialize(); // Chama o método de inicialização
	}

	// Inicializa os componentes da janela
	private void initialize() {
		// Configuração da janela principal
		frmKoalaApp = new JFrame();
		frmKoalaApp.setTitle("Koala App"); // Título da janela
		frmKoalaApp.getContentPane().setBackground(new Color(210, 222, 198)); // Cor de fundo da janela
		frmKoalaApp.setBounds(100, 100, 600, 636); // Define posição e tamanho
		frmKoalaApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportamento ao fechar
		frmKoalaApp.setLocationRelativeTo(null); // Centraliza a janela
		frmKoalaApp.getContentPane().setLayout(null);

		// Painel para selecionar a data
		JPanel panel = new JPanel();
		panel.setBackground(new Color(162, 173, 152)); // Cor de fundo do painel
		panel.setBounds(151, 172, 261, 83); // Localização e tamanho do painel
		frmKoalaApp.getContentPane().add(panel);
		panel.setLayout(null);

		// Texto "Data" para o painel
		JLabel lblNewLabel = new JLabel("Data");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18)); // Fonte do texto
		lblNewLabel.setBounds(106, 10, 44, 19); // Localização do texto no painel
		panel.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Selecionar Data");
		btnNewButton_3.setBounds(65, 39, 129, 34);
		panel.add(btnNewButton_3);

		// Painel para selecionar o horário
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(162, 173, 152)); // Cor de fundo do painel
		panel_1.setBounds(151, 276, 261, 83); // Localização e tamanho do painel
		frmKoalaApp.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		// Texto "Horário" para o painel
		JLabel lblNewLabel_1 = new JLabel("Horario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18)); // Fonte do texto
		lblNewLabel_1.setBounds(91, 10, 58, 16); // Localização do texto no painel
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_1 = new JButton("Selecionar Reserva");
		btnNewButton_3_1.setBounds(65, 39, 129, 34);
		panel_1.add(btnNewButton_3_1);

		// Painel para selecionar o número de pessoas
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(162, 173, 152)); // Cor de fundo do painel
		panel_1_1.setBounds(151, 380, 261, 83); // Localização e tamanho do painel
		frmKoalaApp.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);

		// Texto "N° de Pessoas" para o painel
		JLabel lblNewLabel_2 = new JLabel("N° de Pessoas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18)); // Fonte do texto
		lblNewLabel_2.setBounds(68, 10, 115, 22); // Localização do texto no painel
		panel_1_1.add(lblNewLabel_2);
		
		JButton btnNewButton_3_1_1 = new JButton("Selecionar Numero");
		btnNewButton_3_1_1.setBounds(68, 39, 129, 34);
		panel_1_1.add(btnNewButton_3_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Marcar Reserva");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(178, 109, 209, 53);
		frmKoalaApp.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(210, 222, 198));
		btnNewButton.setBounds(37, 20, 59, 53);
		frmKoalaApp.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(210, 222, 198));
		btnNewButton_1.setBounds(245, 20, 59, 53);
		frmKoalaApp.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(210, 222, 198));
		btnNewButton_2.setBounds(483, 20, 59, 53);
		frmKoalaApp.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String input = JOptionPane.showInputDialog(frmKoalaApp, "Digite uma data (dd/MM/yyyy):");
		        
		        if (input == null || input.trim().isEmpty()) {
		            JOptionPane.showMessageDialog(frmKoalaApp, "Você não digitou nenhuma data.");
		            return;
		        }

		        // Definindo o formato da data
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		        dateFormat.setLenient(false);

		        try {
		            // Tenta converter a entrada em uma data
		            Date date = dateFormat.parse(input);
		            // Exibe a data no formato desejado
		            JOptionPane.showMessageDialog(frmKoalaApp, "Você digitou a data: " + dateFormat.format(date));
		        } catch (ParseException ex) {
		            // Exceção caso a entrada não seja uma data válida
		            JOptionPane.showMessageDialog(frmKoalaApp, "Por favor, digite uma data válida no formato dd/MM/yyyy.");
		        }
		    }
		});
		btnNewButton_3_1.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	String input1 = JOptionPane.showInputDialog(frmKoalaApp, "Digite um Horario (00:00):");
		    	
		    	if (valido(input1)) {
		    		JOptionPane.showMessageDialog(frmKoalaApp,"Horario " + input1 + " selecionado");
		    	} else {
		    		JOptionPane.showMessageDialog(frmKoalaApp,"Formato de horario inválido (00:00)");
		    	}
		    	
		    }
		});
	}
	public static boolean valido(String horario) {
		String regex = "^([01]?[0-9]|2[0-3]):([0-5]?[0-9])$";
		return horario != null && horario.matches(regex);
	}
}

