package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Human brave = new Brave("勇者");
		Human fighter = new Fighter("戦士");
		Human wizerd = new Wizerd("魔法使い");
		List<Human> humans = new ArrayList<>();
		humans.add(brave);
		humans.add(fighter);
		humans.add(wizerd);

		Monster slime = new Slime("スライム");
		Monster oak = new Oak("オーク");
		Monster dragon = new Dragon("ドラゴン");
		List<Monster> monsters = new ArrayList<>();
		monsters.add(slime);
		monsters.add(oak);
		monsters.add(dragon);

		while (true) {
			System.out.println("人間のターン！");
			Human human = humans.get(Rand.get(humans.size()));
			Monster monster = monsters.get(Rand.get(monsters.size()));
			human.attack(monster);
			if (monster.hp <= 0) {
				System.out.println(monster.name + "は倒れた。");
				monsters.remove(monster);
			}
			if (monsters.isEmpty()) {
				System.out.println("勇者達は勝利した！");
				break;
			}

			System.out.println("モンスターのターン！");
			human = humans.get(Rand.get(humans.size()));
			monster = monsters.get(Rand.get(monsters.size()));
			monster.attack(human);
			if (human.hp <= 0) {
				System.out.println(human.name + "は倒れた。");
				humans.remove(human);
			}
			if (humans.isEmpty()) {
				System.out.println("勇者達は負けてしまった...");
				break;
			}
		}
	}
}
