import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest extends JFrame {

	public MenuTest() {
		setTitle("Menu Example");
		setSize(400, 150);
		JMenuBar menuBar = new JMenuBar();
        
		JMenu menu = new JMenu("파일");
		menu.add(new JMenuItem("열기"));
		menu.add(new JMenuItem("저장하기"));
		menu.add(new JMenuItem("다른 이름으로 저장하기"));


        JMenu printMenu = new JMenu("출력");
        printMenu.add(new JMenuItem("프린터로 출력하기"));
        printMenu.add(new JMenuItem("pdf로 출력하기"));

        menu.add(printMenu);

		menuBar.add(menu);


		setJMenuBar(menuBar);
		setVisible(true);
	}

	public static void main(String args[]) {
		MenuTest f = new MenuTest();
	}
}
