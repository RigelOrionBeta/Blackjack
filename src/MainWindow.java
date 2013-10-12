import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
import java.io.File;

import javax.swing.Box;
import javax.swing.JSeparator;


public class MainWindow extends JFrame {
	
	Game game;
	JLabel[] scores;
	JLabel[] dealerCards;
	JLabel[] playerCards;
	
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500, 425));
		setPreferredSize(new Dimension(350, 350));
		setTitle("Blackjack");
		getContentPane().setLayout(null);
		
		JLabel dealerlabel = new JLabel("Dealer");
		dealerlabel.setBounds(173, 26, 41, 14);
		getContentPane().add(dealerlabel);
		
		JLabel playerlabel = new JLabel("Player");
		playerlabel.setBounds(173, 197, 41, 14);
		getContentPane().add(playerlabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 174, 464, 12);
		getContentPane().add(separator);
		
		JLabel player_score = new JLabel("0  ");
		player_score.setPreferredSize(new Dimension(0, 0));
		player_score.setMinimumSize(new Dimension(0, 0));
		player_score.setMaximumSize(new Dimension(0, 0));
		player_score.setBounds(240, 197, 46, 14);
		getContentPane().add(player_score);
		
		JLabel dealer_score = new JLabel("0  ");
		dealer_score.setPreferredSize(new Dimension(0, 0));
		dealer_score.setMinimumSize(new Dimension(0, 0));
		dealer_score.setMaximumSize(new Dimension(0, 0));
		dealer_score.setBounds(240, 26, 46, 14);
		getContentPane().add(dealer_score);
		
		JButton btnStand = new JButton("Stand");
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.stand();
			}
		});
		btnStand.setBounds(135, 352, 77, 23);
		getContentPane().add(btnStand);
		
		JButton btnHit = new JButton("Hit");
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.hit();
			}
		});
		btnHit.setBounds(239, 352, 77, 23);
		getContentPane().add(btnHit);
		
		JLabel dcard2 = new JLabel("");
		dcard2.setBounds(113, 57, 71, 96);
		getContentPane().add(dcard2);
		
		JLabel dcard1 = new JLabel("");
		dcard1.setBounds(21, 57, 71, 96);
		getContentPane().add(dcard1);
		
		JLabel dcard3 = new JLabel("");
		dcard3.setBounds(205, 57, 71, 96);
		getContentPane().add(dcard3);
		
		JLabel dcard4 = new JLabel("");
		dcard4.setBounds(297, 57, 71, 96);
		getContentPane().add(dcard4);
		
		JLabel dcard5 = new JLabel("");
		dcard5.setBounds(389, 57, 71, 96);
		getContentPane().add(dcard5);
		
		JLabel pcard1 = new JLabel("");
		pcard1.setBounds(21, 222, 71, 96);
		getContentPane().add(pcard1);
		
		JLabel pcard2 = new JLabel("");
		pcard2.setBounds(113, 222, 71, 96);
		getContentPane().add(pcard2);
		
		JLabel pcard3 = new JLabel("");
		pcard3.setBounds(205, 222, 71, 96);
		getContentPane().add(pcard3);
		
		JLabel pcard4 = new JLabel("");
		pcard4.setBounds(297, 222, 71, 96);
		getContentPane().add(pcard4);
		
		JLabel pcard5 = new JLabel("");
		pcard5.setBounds(389, 222, 71, 96);
		getContentPane().add(pcard5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 329, 464, 12);
		getContentPane().add(separator_1);
		
		dealerCards = new JLabel[]{ dcard1, dcard2, dcard3, dcard4, dcard5 };
		playerCards = new JLabel[]{ pcard1, pcard2, pcard3, pcard4, pcard5 };
		scores = new JLabel[]{dealer_score, player_score};
	}
	
	
	public void setGame(Game game) {
		this.game = game;
	}

	public void setCard(int player, int cardNum, Card card) {
		scores[player].setText(cardNum + "");
		if(player == 1 && cardNum < playerCards.length) {
			String imageName = "src\\cards\\" + card.getRank() + "_" + card.getSuit() + ".png";
			ImageIcon image = new ImageIcon(imageName);
			playerCards[cardNum].setIcon(image);
			playerCards[cardNum].paintImmediately(playerCards[cardNum].getVisibleRect());
		} else if(player == 0 && cardNum < dealerCards.length) {
			String imageName = "src\\cards\\" + card.getRank() + "_" + card.getSuit() + ".png";
			ImageIcon image = new ImageIcon(imageName);
			dealerCards[cardNum].setIcon(image);
			dealerCards[cardNum].paintImmediately(dealerCards[cardNum].getVisibleRect());
		}
	}
}
