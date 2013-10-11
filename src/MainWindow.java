import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;


public class MainWindow extends JFrame {
	
	Game game;
	
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setSize(new Dimension(400, 350));
		setPreferredSize(new Dimension(500, 600));
		setTitle("Blackjack");
		getContentPane().setLayout(null);
		
		JPanel pnl_dealer_card1 = new JPanel();
		pnl_dealer_card1.setBounds(48, 36, 50, 80);
		getContentPane().add(pnl_dealer_card1);
		
		JPanel pnl_dealer_card2 = new JPanel();
		pnl_dealer_card2.setBounds(113, 36, 50, 80);
		getContentPane().add(pnl_dealer_card2);
		
		JPanel pnl_dealer_card3 = new JPanel();
		pnl_dealer_card3.setBounds(176, 36, 50, 80);
		getContentPane().add(pnl_dealer_card3);
		
		JPanel pnl_dealer_card4 = new JPanel();
		pnl_dealer_card4.setBounds(236, 36, 50, 80);
		getContentPane().add(pnl_dealer_card4);
		
		JPanel pnl_dealer_card5 = new JPanel();
		pnl_dealer_card5.setBounds(296, 36, 50, 80);
		getContentPane().add(pnl_dealer_card5);
		
		JLabel dealerlabel = new JLabel("Dealer");
		dealerlabel.setBounds(157, 11, 41, 14);
		getContentPane().add(dealerlabel);
		
		JLabel playerlabel = new JLabel("Player");
		playerlabel.setBounds(157, 146, 30, 14);
		getContentPane().add(playerlabel);
		
		JPanel pnl_player_card1 = new JPanel();
		pnl_player_card1.setBounds(48, 171, 50, 80);
		getContentPane().add(pnl_player_card1);
		
		JPanel pnl_player_card2 = new JPanel();
		pnl_player_card2.setBounds(113, 171, 50, 80);
		getContentPane().add(pnl_player_card2);
		
		JPanel pnl_player_card3 = new JPanel();
		pnl_player_card3.setBounds(176, 171, 50, 80);
		getContentPane().add(pnl_player_card3);
		
		JPanel pnl_player_card4 = new JPanel();
		pnl_player_card4.setBounds(236, 171, 50, 80);
		getContentPane().add(pnl_player_card4);
		
		JPanel pnl_player_card5 = new JPanel();
		pnl_player_card5.setBounds(296, 171, 50, 80);
		getContentPane().add(pnl_player_card5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 136, 374, 12);
		getContentPane().add(separator);
		
		JLabel player_score = new JLabel("0");
		player_score.setBounds(195, 146, 46, 14);
		getContentPane().add(player_score);
		
		JLabel dealer_score = new JLabel("0");
		dealer_score.setBounds(195, 11, 46, 14);
		getContentPane().add(dealer_score);
		
		JButton btnNewButton_1 = new JButton("Stand");
		btnNewButton_1.setBounds(209, 278, 77, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnHit = new JButton("Hit");
		btnHit.setBounds(113, 278, 77, 23);
		getContentPane().add(btnHit);
	}
	
	public void setGame(Game game) {
		this.game = game;
	}
}
