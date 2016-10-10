package team_project;

public interface BlockInterface {
	/*
	 * Tetrominoes�� �Ҹ���� ��� ���� ������
	 * x,y���� ���� ���� ������ �ϱ� ������ int[][]��� Point Ŭ������ ����Ͽ� Point[][]�� ��Ÿ���� ��.
	 * ��� ���� ������ ����� ������ �ʴ� ���̱� ������ ������� ������ ������, �������̽� �󿡼� �����ص� ������
	 * ������� ������ ��� Ŭ������ Enum�� �̿��Ͽ� �����ϴ� ���� ��õ.
	 * ��� ���·δ� ���� I,O,T,J,L,S,Z ����� ������ ���� ���ô� �Ʒ��� ����.
	 * �����̹Ƿ� ���� ���� �ÿ��� ������  x,y �ʱⰪ�� ������ ��.
	 * int[][] IBlock = new int[][] { {0,0}, {0,0}, {0,0}, {0,0} };
	 * ���� ���� ���·� int[][] IBlock, OBlock, TBlock, ..., ZBlock���� �� 7���� ��� ���� ������ �ʿ�.
	 */
	
	public void dropDown();	// UML�� 5�� �ó�����. ����� ���� ��ġ�� y���� �ٲ㼭 ������ ������.
	public void setMoveDirection(UserInterface directionInput);	// UML�� 2�� �ó�����. UserŬ�����κ��� ���� �Է��� �޾ƿ´�.
	public void setRotation(UserInterface rotationInput);	// UML�� 4�� �ó�����. UserŬ�����κ��� ȸ�� �Է��� �޾ƿ´�.
	public int[][] getBlock();	// UML�� 6�� �ó�����. BoardŬ������ ��� ������ ������. 
	
	
}
