package team_project;

import java.awt.Shape;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

// UML�� 2�� �ó�����. BlockŬ������ �Է��� key���� ������. keyPressed(KeyEvent e)�̿��� �� 
public class User extends Block {
	int curX = 0; // ����� X��ǥ
	int curY = 0; // ����� Y��ǥ
	Shape curPiece; // ����� ����

	/**
	 * rotation ���ó��
	 */
	final Shape rotation() {
		return curPiece;

	}

	/**
	 * Ű �Է� ó��
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

	// UML�� 1��, 7�� �ó�����. Board Ŭ�����κ��� ��ϰ��� �޾ƿ´�.
	public void setBlock(Board b) {
	}

	// UML�� 13�� �ó�����. �� �޼ҵ尡 ȣ��Ǹ� '�ش� ����'�� ��Ʈ������ ����ȴ�.
	public void showGameOver(TetrisManager tm) {
		JOptionPane.showMessageDialog(null, "������ ����Ǿ����ϴ�.", "��������", JOptionPane.ERROR_MESSAGE);
	}

}
