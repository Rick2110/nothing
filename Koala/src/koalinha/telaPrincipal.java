package koalinha;

// Importações de bibliotecas necessárias
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Declaração da classe principal telaPrincipal
public class telaPrincipal {

	// Declaração dos componentes da interface
	private JFrame frmKoalaApp;

	// Método para abrir a janela principal do aplicativo
	public static void telaScreen(String usuario) {
		EventQueue.invokeLater(new Runnable() {
			// Executa o código para iniciar a tela em uma fila de eventos
			public void run() {
				try {
					telaPrincipal window = new telaPrincipal(usuario); // Criação do objeto telaPrincipal
					window.frmKoalaApp.setVisible(true); // Exibição da janela principal
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Construtor da classe - cria a aplicação
	public telaPrincipal(String usuario) {
		initialize(usuario); // Chama o método de inicialização
	}

	// Inicializa os componentes da janela
	private void initialize(String usuario) {
		// Configuração da janela principal
		frmKoalaApp = new JFrame();
		frmKoalaApp.getContentPane().setBackground(new Color(162, 173, 152)); // Cor de fundo da janela
		frmKoalaApp.setTitle("Koala App"); // Título da janela
		frmKoalaApp.setBounds(100, 100, 576, 543); // Define posição e tamanho
		frmKoalaApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportamento ao fechar
		frmKoalaApp.setLocationRelativeTo(null); // Centraliza a janela
		frmKoalaApp.getContentPane().setLayout(null);

		// Texto de boas-vindas
		JLabel lblNewLabel = new JLabel("Bem-vindo " + usuario + "!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30)); // Fonte do texto
		lblNewLabel.setBounds(151, 24, 254, 75); // Localização do texto
		frmKoalaApp.getContentPane().add(lblNewLabel);

		// Botão "Marcar horário"
		JButton btnNewButton = new JButton("Marcar horario");
		btnNewButton.setBackground(new Color(217, 217, 217)); // Cor de fundo do botão
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20)); // Fonte do texto do botão
		btnNewButton.setBounds(186, 194, 162, 58); // Localização e tamanho
		frmKoalaApp.getContentPane().add(btnNewButton);

		// Botão "Perfil"
		JButton btnNewButton_1 = new JButton("Perfil");
		btnNewButton_1.setBackground(new Color(217, 217, 217));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(186, 262, 162, 58);
		frmKoalaApp.getContentPane().add(btnNewButton_1);

		// Botão "Opções"
		JButton btnNewButton_1_1 = new JButton("Opções");
		btnNewButton_1_1.setBackground(new Color(217, 217, 217));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(186, 330, 162, 58);
		frmKoalaApp.getContentPane().add(btnNewButton_1_1);

		// Botão "Sair"
		JButton btnNewButton_1_1_1 = new JButton("Sair");
		btnNewButton_1_1_1.setBackground(new Color(217, 217, 217));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBounds(186, 398, 162, 58);
		frmKoalaApp.getContentPane().add(btnNewButton_1_1_1);

		// Ação do botão "Marcar horário"
		marcarHorario hrs = new marcarHorario(); // Instância da classe marcarHorario
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hrs.horarioScreen(); // Chama o método para marcar horário
			}
		});
		

		// Ação do botão "Sair" - fecha a aplicação
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmKoalaApp.dispose(); // Fecha a janela principal
			}
		});
	}
}