package game;
import java.util.*;


public class main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int n1,n2,n3,n4,escolha,aleatorio;
		n1 = 5;
		n2 = 5;
		n3 = 0;
		n4 = 0;
		titulo();
		limpar();
		tema();
		do {
			if (n2 == 0) {
				System.out.println("Jogador perdeu...");
				System.exit(0);
			}else if (n1 == 0) {
				System.out.println("Você venceu !!!");
				System.exit(0);
			}
			if (n3 == 0 && n4 == 0) {
				Thread.sleep(2000);
				System.out.println("Colocando as balas no revolver");
				Thread.sleep(2000);
				int bala1 = random.nextInt(4) + 2;
				int bala2 = (6 - bala1);
				n3 = bala1;
				n4 = bala2;
				System.out.println("Há "+n3+" munições Verdadeiras no revolver.");
				Thread.sleep(2000);
				System.out.println("E "+n4+" Falsas");
				Thread.sleep(2000);
				System.out.println("Vamos começar a rodada");
				Thread.sleep(2000);
			}
			do {
				System.out.println("");
				System.out.println("Vida da IA:" + n1);
				System.out.println("");
				System.out.println("Vida do Jogador:" + n2);
				System.out.println("");
				System.out.println("1 - Atirar no Oponente ");
				System.out.println("2 - Atirar em si mesmo");
				System.out.println("3 - Usar Power-Ups");
				System.out.println("Escolha:");
				escolha = sc.nextInt(); 
			} while(escolha > 3 || escolha < 1);
			if (escolha == 1) {
				System.out.println("A bala é...");
				Thread.sleep(5000);
				aleatorio = random.nextInt(6);
				if (aleatorio <= n3) {
					n3 = n3 - 1;
					n1 = n1 - 1;
					System.out.println("Bala verdadeira");
					Thread.sleep(2000);
				} else if (aleatorio >= n4) {
					n4 = n4 - 1;
					System.out.println("Bala falsa");
					Thread.sleep(2000);
				}
			}else if (escolha == 2) {
				System.out.println("E a bala é...");
				Thread.sleep(5000);
				aleatorio = random.nextInt(5);
				if (aleatorio <= n3) {
					n3 = n3 - 1;
					n2 = n2 - 1;
					System.out.println("Bala verdadeira");
					Thread.sleep(2000);
				} else if (aleatorio >= n4) {
					n4 = n4 - 1;
					System.out.println("Bala falsa");
					Thread.sleep(2000);
				}
			}else if (escolha == 3) {
				System.out.println("Não programei ainda...");
			}
		} while(n1 != 0 || n2 != 0);
	}
	public static void titulo() throws InterruptedException {
		String ponto = ".";
		for (int e = 0; e < 3;e++) {
			limpar();
			tema();
			System.out.println("Carregando"+ponto);
			ponto = ponto + ".";
			Thread.sleep(2000);
		}
	}
	public static void linha() {
		for (int a = 0; a <=40;a++) {
			System.out.print("=");
		}
	}
	
	public static void limpar() {
		for (int u = 0;u <= 100;u++) {
			System.out.println("");
		}
	}
	public static void tema() {
		System.out.println("     _______. __    __   __    ______  __   _______       ___           _______.\n"
				+ "    /       ||  |  |  | |  |  /      ||  | |       \\     /   \\         /       |\n"
				+ "   |   (----`|  |  |  | |  | |  ,----'|  | |  .--.  |   /  ^  \\       |   (----`\n"
				+ "    \\   \\    |  |  |  | |  | |  |     |  | |  |  |  |  /  /_\\  \\       \\   \\    \n"
				+ ".----)   |   |  `--'  | |  | |  `----.|  | |  '--'  | /  _____  \\  .----)   |   \n"
				+ "|_______/     \\______/  |__|  \\______||__| |_______/ /__/     \\__\\ |_______/   ");
	}
}
