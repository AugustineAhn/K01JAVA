package ex12inheritance;

class Rectangle {
	//멤버변수
	int up;//가로
	int side;//세로
	//인자생성자

	public Rectangle  (int up, int side) {
		this.up=up;
		this.side=side;
	}
	public void ShowAreaInfo() {
		System.out.println("정사각형 면적:" + (up*side));
	}

}

class Square extends Rectangle{

	//멤버변수: 확장없음
	/*
	 부모클래스에서 이미 가로, 세로 길이가 정의되어 있으므로 추가적인
	 멤버변수의 정의는 불필요하다.
	 */
	
	//생성자
	/*
	 정사각형은 가로, 세로 길이가 동일하므로 인자값 1개로
	 부모의 멤버변수 2개를 동시에 초기화한다.
	 */
	public Square(int up) {
		super(up, up);
		
	}
	
	/*
	 넓이를 구하는 공식은 동일하나 부모는 직사각형, 자식은 정사각형의
	 면적을 출력해야 하므로 오버라이딩 해야한다.
	 */
	@Override
	public void ShowAreaInfo() {
		
		System.out.println("정사각형 면적:" + (up * up));
	}


}

public class QuRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rec = new Rectangle(4, 3);
		rec.ShowAreaInfo();

		Square sqr = new Square(7);
		sqr.ShowAreaInfo();

	}
}
