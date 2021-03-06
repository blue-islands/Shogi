package koma;

import item.Board;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Kyosha extends Koma {

	private static String[] imgName = { "./koma_img/sgs07.png",
			"./koma_img/sgs37.png", "./koma_img/sgs17.png",
			"./koma_img/sgs47.png" };
	private static String[] komaName = {
		"香", "成香"
	};
	public Kyosha(boolean direction) {
		super(direction, imgName, komaName);
	}

	public List<Point> getMoveList(Point p) {
		List<Point> list = new ArrayList<Point>();

		if (direction == true) {
			for (int i = p.y - 1; i >= 1; i--) {
				list.add(new Point(p.x, i));
			}
		} else {
			for (int i = p.y + 1; i <= Board.SIZE; i++) {
				list.add(new Point(p.x, i));
			}
		}

		return list;
	}

}
