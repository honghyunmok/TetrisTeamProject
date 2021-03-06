package team_project;

import java.awt.Shape;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

// UML상 2번 시나리오. Block클래스에 입력한 key값을 보낸다. keyPressed(KeyEvent e)이용할 것 
public class User extends Block {
	int curX = 0; // 블록의 X좌표
	int curY = 0; // 블록의 Y좌표
	Shape curPiece; // 블록의 형태

	/**
	 * rotation 상수처리
	 */
	final Shape rotation() {
		return curPiece;

	}

	/**
	 * 키 입력 처리
	 */
	public void keyPressed(KeyEvent e) {
		int Keycode = e.getKeyCode();

		switch (Keycode) {
		case KeyEvent.VK_LEFT:
			MoveDirection(curPiece, curX - 1, curY);
			break;
		case KeyEvent.VK_RIGHT:
			MoveDirection(curPiece, curX + 1, curY);
			break;
		case KeyEvent.VK_DOWN:
			MoveDirection(curPiece, curX, curY + 1);
			break;
		case KeyEvent.VK_UP:
			MoveDirection(((User) curPiece).rotation(), curX, curY);
			break;
		case KeyEvent.VK_SPACE:
			dropDown();
			break;
		}
	}

	// UML상 1번, 7번 시나리오. Board 클래스로부터 블록값을 받아온다.
	public void setBlock(Board b) {
	}

	// UML상 13번 시나리오. 이 메소드가 호출되면 '해당 유저'의 테트리스는 종료된다.
	public void showGameOver(TetrisManager tm) {
		JOptionPane.showMessageDialog(null, "게임이 종료되었습니다.", "게임종료", JOptionPane.ERROR_MESSAGE);
	}

}
