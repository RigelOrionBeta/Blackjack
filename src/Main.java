
public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		MainWindow mw = new MainWindow();
		mw.setGame(game);
		game.setView(mw);
		mw.setVisible(true);
		mw.setLocationRelativeTo(null);
	}

}
